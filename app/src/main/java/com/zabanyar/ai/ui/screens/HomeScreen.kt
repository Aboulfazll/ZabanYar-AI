package com.zabanyar.ai.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.UserManager
import java.text.SimpleDateFormat
import java.util.*

// ==================== رنگ‌ها ====================
val PrimaryColor = Color(0xFF1A237E)
val SecondaryColor = Color(0xFF6200EE)
val AccentGreen = Color(0xFF11998E)
val AccentPink = Color(0xFFE91E63)
val AccentOrange = Color(0xFFFF6F00)
val AccentBlue = Color(0xFF0288D1)
val AccentRed = Color(0xFFC62828)

// ==================== Motivational Quotes ====================
private val motivationalQuotes = listOf(
    "زبان، پل ارتباط با دنیاست 🌍",
    "هر روز یک قدم به رویاهات نزدیک‌تر 🎯",
    "تمرین باعث پیشرفت می‌شه 💪",
    "امروز بهترین روز برای شروع دوباره‌ست ✨",
    "یادگیری زبان، سرمایه‌گذاری روی خودته 📈",
    "کوچک شروع کن، ولی شروع کن 🚀",
    "موفقیت از تلاش روزانه میاد ⭐",
    "زبان جدید، دنیای جدید 🌟"
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToLibrary: () -> Unit = {},
    onNavigateToAIChat: () -> Unit = {},
    onNavigateToSpeaking: () -> Unit = {},
    onNavigateToVocabulary: () -> Unit = {},
    onNavigateToProfile: () -> Unit = {},
    onNavigateToSettings: () -> Unit = {},
    onNavigateToPodcast: () -> Unit = {},
    onNavigateToDailySentences: () -> Unit = {},
    onNavigateToLevelTest: () -> Unit = {},
    onNavigateToAchievements: () -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val context = LocalContext.current
    val user = remember { UserManager.getLoggedInUser(context) }

    // ============ State ============
    var refreshKey by remember { mutableIntStateOf(0) }
    val refresh = { refreshKey++ }

    // ============ Stats ============
    val totalStars = remember(refreshKey) { ProgressManager.getTotalStars(context) }
    val lessonsCompleted = remember(refreshKey) { ProgressManager.getLessonsCompleted(context) }
    val dailyStreak = remember(refreshKey) { ProgressManager.getDailyStreak(context) }
    val quizzesPassed = remember(refreshKey) { ProgressManager.getTotalQuizzesPassed(context) }
    val quizAttempts = remember(refreshKey) { ProgressManager.getTotalQuizAttempts(context) }

    // ============ Continue Learning (از کتاب‌های در حال یادگیری) ============
    val continueBooks = remember(refreshKey) {
        BookRepository.getAllBooks()
            .filter { ProgressManager.isBookStarted(context, it.id) }
            .mapNotNull { book ->
                val progress = ProgressManager.getBookProgress(context, book.id, book.totalChapters)
                if (progress.readChapters > 0 && progress.overallProgressPercent < 100) {
                    Triple(book, progress.readChapters, progress.overallProgressPercent)
                } else null
            }
            .sortedByDescending { it.third }
            .take(3)
    }

    // ============ Daily Goal ============
    val dailyGoalMinutes = 10
    val todayMinutes = remember(refreshKey) {
        // محاسبه تخمینی از درس‌های امروز
        minOf((lessonsCompleted % 10) * 3, dailyGoalMinutes)
    }
    val dailyGoalProgress = todayMinutes.toFloat() / dailyGoalMinutes

    // ============ Weekly Activity (شبیه‌سازی) ============
    val weeklyActivity = remember(refreshKey) {
        val calendar = Calendar.getInstance()
        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)
        List(7) { i ->
            val dayIdx = (dayOfWeek - 1 + i) % 7
            if (dayIdx < dailyStreak % 7 + 1) (1..5).random() else (0..2).random()
        }
    }

    // ============ Quote of the day ============
    val todayQuote = remember {
        val dayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        motivationalQuotes[dayOfYear % motivationalQuotes.size]
    }

    // ============ Time-based greeting ============
    val greeting = remember {
        val hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
        when {
            hour < 12 -> "صبح بخیر"
            hour < 17 -> "ظهر بخیر"
            hour < 20 -> "عصر بخیر"
            else -> "شب بخیر"
        }
    }

    // ============ Avatar animation ============
    val infiniteTransition = rememberInfiniteTransition(label = "home")
    val glowScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "glow"
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .scale(glowScale)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🎓", fontSize = 20.sp)
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                "زبان‌یار AI",
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 16.sp
                            )
                            Text(
                                "یادگیری هوشمند",
                                fontSize = 10.sp,
                                color = Color.White.copy(alpha = 0.85f)
                            )
                        }
                    }
                },
                actions = {
                    // Notification badge
                    Box {
                        IconButton(onClick = { /* notifications */ }) {
                            Icon(
                                Icons.Filled.Notifications,
                                contentDescription = "اعلان‌ها",
                                tint = Color.White
                            )
                        }
                        if (dailyStreak > 0) {
                            Box(
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .offset(x = (-8).dp, y = 8.dp)
                                    .size(8.dp)
                                    .clip(CircleShape)
                                    .background(AccentOrange)
                            )
                        }
                    }
                    IconButton(onClick = onNavigateToSettings) {
                        Icon(
                            Icons.Filled.Settings,
                            contentDescription = "تنظیمات",
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
        ) {
            // ==================== هدر خوش‌آمدگویی پیشرفته ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            listOf(PrimaryColor, SecondaryColor)
                        )
                    )
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp, bottom = 80.dp)
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "$greeting، ${user?.name?.split(" ")?.firstOrNull() ?: "کاربر"} 👋",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(Modifier.height(6.dp))
                            Text(
                                "امروز چه چیزی یاد بگیریم؟",
                                fontSize = 13.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }
                        // تاریخ امروز
                        Column(horizontalAlignment = Alignment.End) {
                            val dateStr = remember {
                                val fmt = SimpleDateFormat("EEEE", Locale("fa"))
                                fmt.format(Date())
                            }
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color.White.copy(alpha = 0.15f))
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                            ) {
                                Text(
                                    dateStr,
                                    fontSize = 11.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    // Quote of the day
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(Color.White.copy(alpha = 0.15f))
                            .padding(14.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("💡", fontSize = 20.sp)
                            Spacer(Modifier.width(10.dp))
                            Text(
                                todayQuote,
                                fontSize = 12.sp,
                                color = Color.White,
                                lineHeight = 18.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }

            // ==================== کارت آماری شناور پیشرفته ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .offset(y = (-50).dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    // Header
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(32.dp)
                                    .clip(CircleShape)
                                    .background(AccentOrange.copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("📊", fontSize = 16.sp)
                            }
                            Spacer(Modifier.width(8.dp))
                            Text(
                                "آمار شما",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                        }
                        // سطح
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(
                                    Brush.linearGradient(
                                        listOf(PrimaryColor, SecondaryColor)
                                    )
                                )
                                .padding(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Text(
                                when (user?.level) {
                                    "BEGINNER" -> "🌱 مبتدی"
                                    "INTERMEDIATE" -> "🚀 متوسط"
                                    "ADVANCED" -> "🏆 پیشرفته"
                                    else -> "🌱 مبتدی"
                                },
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    // Stats grid
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        StatItemAdvanced("📚", "$lessonsCompleted", "درس", AccentBlue)
                        VerticalDividerSmall()
                        StatItemAdvanced("🔥", "$dailyStreak", "روز پیوسته", AccentOrange)
                        VerticalDividerSmall()
                        StatItemAdvanced("⭐", "$totalStars", "امتیاز", AccentPink)
                        VerticalDividerSmall()
                        StatItemAdvanced("🏆", "$quizzesPassed", "آزمون", AccentGreen)
                    }

                    Spacer(Modifier.height(16.dp))

                    Divider(color = Color.LightGray.copy(alpha = 0.3f))

                    Spacer(Modifier.height(14.dp))

                    // Daily Goal
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(38.dp)
                                .clip(CircleShape)
                                .background(AccentGreen.copy(alpha = 0.12f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🎯", fontSize = 18.sp)
                        }
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    "هدف امروز",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryColor
                                )
                                Text(
                                    "$todayMinutes/$dailyGoalMinutes دقیقه",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = AccentGreen
                                )
                            }
                            Spacer(Modifier.height(4.dp))
                            LinearProgressIndicator(
                                progress = { dailyGoalProgress },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(6.dp)
                                    .clip(RoundedCornerShape(3.dp)),
                                color = AccentGreen,
                                trackColor = AccentGreen.copy(alpha = 0.15f)
                            )
                        }
                    }

                    Spacer(Modifier.height(14.dp))

                    // Weekly Activity Chart
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(38.dp)
                                .clip(CircleShape)
                                .background(AccentBlue.copy(alpha = 0.12f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("📈", fontSize = 18.sp)
                        }
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "فعالیت هفته",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Spacer(Modifier.height(6.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.Bottom
                            ) {
                                weeklyActivity.forEachIndexed { idx, value ->
                                    val dayNames = listOf("ش", "ی", "د", "س", "چ", "پ", "ج")
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .width(14.dp)
                                                .height((value * 6 + 8).dp)
                                                .clip(RoundedCornerShape(4.dp))
                                                .background(
                                                    if (value > 0) AccentBlue
                                                    else Color.LightGray.copy(alpha = 0.3f)
                                                )
                                        )
                                        Spacer(Modifier.height(2.dp))
                                        Text(
                                            dayNames[idx],
                                            fontSize = 8.sp,
                                            color = Color.Gray
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.offset(y = (-30).dp))

            // ==================== دسترسی سریع ====================
            SectionTitle("🚀 دسترسی سریع")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                QuickAccessCardAdvanced(
                    emoji = "📚",
                    title = "کتابخانه",
                    subtitle = "۵۳+ کتاب",
                    gradient = listOf(Color(0xFF6A1B9A), Color(0xFFAB47BC)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToLibrary
                )
                QuickAccessCardAdvanced(
                    emoji = "🤖",
                    title = "AI Chat",
                    subtitle = "معلم هوشمند",
                    gradient = listOf(Color(0xFF00695C), Color(0xFF26A69A)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToAIChat
                )
            }

            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                QuickAccessCardAdvanced(
                    emoji = "🗣️",
                    title = "اسپیکینگ",
                    subtitle = "تمرین گفتار",
                    gradient = listOf(Color(0xFFC62828), Color(0xFFEF5350)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToSpeaking
                )
                QuickAccessCardAdvanced(
                    emoji = "📝",
                    title = "واژگان",
                    subtitle = "بانک لغات",
                    gradient = listOf(Color(0xFFE91E63), Color(0xFFF06292)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToVocabulary
                )
            }

            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                QuickAccessCardAdvanced(
                    emoji = "🎧",
                    title = "پادکست‌ها",
                    subtitle = "۲۴ پادکست",
                    gradient = listOf(Color(0xFF6A1B9A), Color(0xFFBA68C8)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToPodcast
                )
                QuickAccessCardAdvanced(
                    emoji = "💬",
                    title = "جملات روزمره",
                    subtitle = "۴۰ جمله",
                    gradient = listOf(Color(0xFF00695C), Color(0xFF4DB6AC)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToDailySentences
                )
            }

            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                QuickAccessCardAdvanced(
                    emoji = "🎯",
                    title = "تست سطح",
                    subtitle = "سطحت رو بسنج",
                    gradient = listOf(Color(0xFFC62828), Color(0xFFEF5350)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToLevelTest
                )
                QuickAccessCardAdvanced(
                    emoji = "🏆",
                    title = "دستاوردها",
                    subtitle = "۱۳ نشان",
                    gradient = listOf(Color(0xFFFF6F00), Color(0xFFFFB300)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToAchievements
                )
            }

            Spacer(Modifier.height(24.dp))

            // ==================== ادامه یادگیری ====================
            if (continueBooks.isNotEmpty()) {
                SectionTitle("📖 ادامه یادگیری")

                continueBooks.forEach { (book, chaptersRead, progressPercent) ->
                    ContinueLearningCardAdvanced(
                        bookTitle = book.title,
                        bookTitlePersian = book.titlePersian,
                        emoji = book.category.emoji,
                        chapter = "$chaptersRead از ${book.totalChapters} درس خوانده شده",
                        progress = progressPercent / 100f,
                        color = Color(book.gradientStart),
                        gradientEnd = Color(book.gradientEnd),
                        onClick = onNavigateToLibrary
                    )
                    Spacer(Modifier.height(10.dp))
                }
            } else {
                SectionTitle("📖 شروع یادگیری")

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .clickable { onNavigateToLibrary() },
                    shape = RoundedCornerShape(18.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(70.dp)
                                .clip(CircleShape)
                                .background(
                                    Brush.linearGradient(
                                        listOf(PrimaryColor, SecondaryColor)
                                    )
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("📖", fontSize = 32.sp)
                        }
                        Spacer(Modifier.height(12.dp))
                        Text(
                            "هنوز کتابی شروع نکردی!",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            "۵۳ کتاب آموزشی آماده یادگیریه",
                            fontSize = 12.sp,
                            color = Color.Gray,
                            textAlign = TextAlign.Center
                        )
                        Spacer(Modifier.height(12.dp))
                        Button(
                            onClick = onNavigateToLibrary,
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(
                                "شروع کن",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(Modifier.width(4.dp))
                            Icon(
                                Icons.Filled.ArrowForward,
                                null,
                                tint = Color.White,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            // ==================== دستاوردها ====================
            SectionTitle("🏆 دستاوردهای شما")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                AchievementBadgeAdvanced(
                    emoji = "🥇",
                    title = "شروع",
                    unlocked = lessonsCompleted > 0,
                    progressText = if (lessonsCompleted > 0) "کامل" else "0/1",
                    modifier = Modifier.weight(1f)
                )
                AchievementBadgeAdvanced(
                    emoji = "🔥",
                    title = "۷ روز",
                    unlocked = dailyStreak >= 7,
                    progressText = "$dailyStreak/7",
                    modifier = Modifier.weight(1f)
                )
                AchievementBadgeAdvanced(
                    emoji = "📚",
                    title = "۱۰ درس",
                    unlocked = lessonsCompleted >= 10,
                    progressText = "$lessonsCompleted/10",
                    modifier = Modifier.weight(1f)
                )
                AchievementBadgeAdvanced(
                    emoji = "🏆",
                    title = "۵ آزمون",
                    unlocked = quizzesPassed >= 5,
                    progressText = "$quizzesPassed/5",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(Modifier.height(24.dp))

            // ==================== پیشرفت کلی ====================
            SectionTitle("📊 پیشرفت کلی")

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(18.dp),
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    // Circular progress
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier.size(80.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            val totalChapters = BookRepository.getAllBooks().sumOf { it.totalChapters }
                            val progress = if (totalChapters > 0) {
                                lessonsCompleted.toFloat() / totalChapters
                            } else 0f

                            val animatedProgress by animateFloatAsState(
                                targetValue = progress,
                                animationSpec = tween(1500, easing = FastOutSlowInEasing),
                                label = "circular"
                            )

                            CircularProgressIndicator(
                                progress = { 1f },
                                modifier = Modifier.fillMaxSize(),
                                color = Color.LightGray.copy(alpha = 0.2f),
                                strokeWidth = 8.dp
                            )
                            CircularProgressIndicator(
                                progress = { animatedProgress },
                                modifier = Modifier.fillMaxSize(),
                                color = PrimaryColor,
                                strokeWidth = 8.dp
                            )
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    "${(progress * 100).toInt()}%",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryColor
                                )
                            }
                        }
                        Spacer(Modifier.width(18.dp))
                        Column {
                            Text(
                                "مسیر یادگیری شما",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Spacer(Modifier.height(6.dp))
                            ProgressText("📖 $lessonsCompleted درس خوانده‌شده", AccentBlue)
                            Spacer(Modifier.height(2.dp))
                            ProgressText("🏆 $quizzesPassed آزمون پاس‌شده", AccentGreen)
                            Spacer(Modifier.height(2.dp))
                            ProgressText("🎯 $quizAttempts بار تلاش آزمون", AccentOrange)
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            // ==================== دکمه پروفایل ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .clickable { onNavigateToProfile() },
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(
                                Brush.linearGradient(
                                    listOf(PrimaryColor, SecondaryColor)
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            user?.name?.firstOrNull()?.uppercase() ?: "U",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            user?.name ?: "کاربر",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                        Text(
                            user?.email ?: "",
                            fontSize = 11.sp,
                            color = Color.Gray
                        )
                    }
                    Icon(
                        Icons.Filled.ChevronLeft,
                        null,
                        tint = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== دکمه خروج ====================
            OutlinedButton(
                onClick = {
                    UserManager.logout(context)
                    onLogout()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(52.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = AccentRed
                )
            ) {
                Icon(Icons.Filled.Logout, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(8.dp))
                Text("خروج از حساب", fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(30.dp))
        }
    }
}

// ==================== کامپوزبل‌های کمکی پیشرفته ====================

@Composable
private fun SectionTitle(title: String) {
    Text(
        title,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = PrimaryColor,
        modifier = Modifier.padding(
            start = 20.dp,
            end = 20.dp,
            top = 8.dp,
            bottom = 12.dp
        )
    )
}

@Composable
private fun StatItemAdvanced(
    emoji: String,
    value: String,
    label: String,
    color: Color
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(emoji, fontSize = 20.sp)
        Spacer(Modifier.height(3.dp))
        Text(
            value,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = color
        )
        Text(
            label,
            fontSize = 9.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun VerticalDividerSmall() {
    Divider(
        modifier = Modifier
            .height(40.dp)
            .width(1.dp),
        color = Color.LightGray.copy(alpha = 0.4f)
    )
}

@Composable
private fun QuickAccessCardAdvanced(
    emoji: String,
    title: String,
    subtitle: String,
    gradient: List<Color>,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val infiniteTransition = rememberInfiniteTransition(label = "quick")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.02f,
        animationSpec = infiniteRepeatable(
            animation = tween(3000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "scale"
    )

    Card(
        modifier = modifier
            .height(120.dp)
            .scale(scale)
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.linearGradient(gradient))
                .padding(14.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(emoji, fontSize = 22.sp)
                    }
                    // Arrow indicator
                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.2f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.ArrowForward,
                            null,
                            tint = Color.White,
                            modifier = Modifier.size(12.dp)
                        )
                    }
                }
                Column {
                    Text(
                        title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(2.dp))
                    Text(
                        subtitle,
                        fontSize = 10.sp,
                        color = Color.White.copy(alpha = 0.85f)
                    )
                }
            }
        }
    }
}

@Composable
private fun ContinueLearningCardAdvanced(
    bookTitle: String,
    bookTitlePersian: String,
    emoji: String,
    chapter: String,
    progress: Float,
    color: Color,
    gradientEnd: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(54.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(color, gradientEnd)
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(emoji, fontSize = 26.sp)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    bookTitle,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor
                )
                Text(
                    bookTitlePersian,
                    fontSize = 10.sp,
                    color = SecondaryColor,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    chapter,
                    fontSize = 10.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(6.dp))
                LinearProgressIndicator(
                    progress = { progress },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = color,
                    trackColor = color.copy(alpha = 0.15f)
                )
                Spacer(Modifier.height(3.dp))
                Text(
                    "${(progress * 100).toInt()}% تکمیل",
                    fontSize = 9.sp,
                    color = color,
                    fontWeight = FontWeight.Bold
                )
            }
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
                    .background(color.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.PlayArrow,
                    null,
                    tint = color,
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}

@Composable
private fun AchievementBadgeAdvanced(
    emoji: String,
    title: String,
    unlocked: Boolean,
    progressText: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(if (unlocked) 4.dp else 1.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (unlocked) Color.White else Color(0xFFEDEDED)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
                    .background(
                        if (unlocked) AccentOrange.copy(alpha = 0.15f)
                        else Color.Gray.copy(alpha = 0.15f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    emoji,
                    fontSize = 18.sp
                )
            }
            Spacer(Modifier.height(4.dp))
            Text(
                title,
                fontSize = 9.sp,
                fontWeight = FontWeight.Bold,
                color = if (unlocked) PrimaryColor else Color.Gray,
                textAlign = TextAlign.Center,
                lineHeight = 11.sp
            )
            Text(
                progressText,
                fontSize = 8.sp,
                color = if (unlocked) AccentGreen else Color.Gray,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Composable
private fun ProgressText(text: String, color: Color) {
    Text(
        text,
        fontSize = 11.sp,
        color = color,
        fontWeight = FontWeight.SemiBold
    )
}