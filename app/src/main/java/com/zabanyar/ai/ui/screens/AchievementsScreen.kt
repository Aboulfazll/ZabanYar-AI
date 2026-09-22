package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.ProgressManager

data class Achievement(
    val id: String,
    val emoji: String,
    val title: String,
    val description: String,
    val isUnlocked: Boolean,
    val progress: Float,
    val currentValue: Int,
    val targetValue: Int
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementsScreen(
    onBack: () -> Unit
) {
    val context = LocalContext.current

    val totalStars = remember { ProgressManager.getTotalStars(context) }
    val lessonsCompleted = remember { ProgressManager.getLessonsCompleted(context) }
    val dailyStreak = remember { ProgressManager.getDailyStreak(context) }

    val achievements = remember {
        listOf(
            // درس‌ها
            Achievement(
                id = "first_lesson", emoji = "🥇",
                title = "اولین قدم",
                description = "اولین درس رو کامل کن",
                isUnlocked = lessonsCompleted >= 1,
                progress = (lessonsCompleted / 1f).coerceAtMost(1f),
                currentValue = lessonsCompleted,
                targetValue = 1
            ),
            Achievement(
                id = "five_lessons", emoji = "📚",
                title = "دانش‌آموز",
                description = "۵ درس رو کامل کن",
                isUnlocked = lessonsCompleted >= 5,
                progress = (lessonsCompleted / 5f).coerceAtMost(1f),
                currentValue = lessonsCompleted,
                targetValue = 5
            ),
            Achievement(
                id = "ten_lessons", emoji = "🎓",
                title = "دانشجو",
                description = "۱۰ درس رو کامل کن",
                isUnlocked = lessonsCompleted >= 10,
                progress = (lessonsCompleted / 10f).coerceAtMost(1f),
                currentValue = lessonsCompleted,
                targetValue = 10
            ),
            Achievement(
                id = "twenty_lessons", emoji = "🏅",
                title = "پیشرفته",
                description = "۲۰ درس رو کامل کن",
                isUnlocked = lessonsCompleted >= 20,
                progress = (lessonsCompleted / 20f).coerceAtMost(1f),
                currentValue = lessonsCompleted,
                targetValue = 20
            ),
            Achievement(
                id = "fifty_lessons", emoji = "👑",
                title = "استاد",
                description = "۵۰ درس رو کامل کن",
                isUnlocked = lessonsCompleted >= 50,
                progress = (lessonsCompleted / 50f).coerceAtMost(1f),
                currentValue = lessonsCompleted,
                targetValue = 50
            ),

            // امتیازات
            Achievement(
                id = "stars_100", emoji = "⭐",
                title = "شروع درخشان",
                description = "۱۰۰ امتیاز جمع کن",
                isUnlocked = totalStars >= 100,
                progress = (totalStars / 100f).coerceAtMost(1f),
                currentValue = totalStars,
                targetValue = 100
            ),
            Achievement(
                id = "stars_500", emoji = "🌟",
                title = "درخشان",
                description = "۵۰۰ امتیاز جمع کن",
                isUnlocked = totalStars >= 500,
                progress = (totalStars / 500f).coerceAtMost(1f),
                currentValue = totalStars,
                targetValue = 500
            ),
            Achievement(
                id = "stars_1000", emoji = "💫",
                title = "ستاره‌شناس",
                description = "۱۰۰۰ امتیاز جمع کن",
                isUnlocked = totalStars >= 1000,
                progress = (totalStars / 1000f).coerceAtMost(1f),
                currentValue = totalStars,
                targetValue = 1000
            ),
            Achievement(
                id = "stars_5000", emoji = "🌠",
                title = "کهکشان",
                description = "۵۰۰۰ امتیاز جمع کن",
                isUnlocked = totalStars >= 5000,
                progress = (totalStars / 5000f).coerceAtMost(1f),
                currentValue = totalStars,
                targetValue = 5000
            ),

            // پیوستگی
            Achievement(
                id = "streak_3", emoji = "🔥",
                title = "شروع گرم",
                description = "۳ روز پیوسته تمرین کن",
                isUnlocked = dailyStreak >= 3,
                progress = (dailyStreak / 3f).coerceAtMost(1f),
                currentValue = dailyStreak,
                targetValue = 3
            ),
            Achievement(
                id = "streak_7", emoji = "☄️",
                title = "هفته کامل",
                description = "۷ روز پیوسته تمرین کن",
                isUnlocked = dailyStreak >= 7,
                progress = (dailyStreak / 7f).coerceAtMost(1f),
                currentValue = dailyStreak,
                targetValue = 7
            ),
            Achievement(
                id = "streak_30", emoji = "🌋",
                title = "یک ماه قهرمان",
                description = "۳۰ روز پیوسته تمرین کن",
                isUnlocked = dailyStreak >= 30,
                progress = (dailyStreak / 30f).coerceAtMost(1f),
                currentValue = dailyStreak,
                targetValue = 30
            ),
            Achievement(
                id = "streak_100", emoji = "🏆",
                title = "افسانه‌ای",
                description = "۱۰۰ روز پیوسته تمرین کن",
                isUnlocked = dailyStreak >= 100,
                progress = (dailyStreak / 100f).coerceAtMost(1f),
                currentValue = dailyStreak,
                targetValue = 100
            )
        )
    }

    val unlockedCount = achievements.count { it.isUnlocked }
    val totalCount = achievements.size

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "🏆 دستاوردها",
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
        ) {
            // ==================== کارت خلاصه ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.linearGradient(
                            listOf(PrimaryColor, SecondaryColor)
                        )
                    )
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.EmojiEvents,
                            null,
                            tint = Color.White,
                            modifier = Modifier.size(32.dp)
                        )
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "دستاوردهای شما",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            "$unlockedCount از $totalCount دستاورد باز شده",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                        Spacer(Modifier.height(8.dp))
                        LinearProgressIndicator(
                            progress = { unlockedCount.toFloat() / totalCount },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(6.dp)
                                .clip(RoundedCornerShape(3.dp)),
                            color = Color.White,
                            trackColor = Color.White.copy(alpha = 0.3f)
                        )
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            // ==================== گرید دستاوردها ====================
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(achievements, key = { it.id }) { achievement ->
                    AchievementCard(achievement)
                }
            }
        }
    }
}

@Composable
private fun AchievementCard(achievement: Achievement) {
    val isUnlocked = achievement.isUnlocked

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(if (isUnlocked) 5.dp else 1.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isUnlocked) Color.White else Color(0xFFEDEDED)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // آیکون
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(
                        if (isUnlocked)
                            Brush.linearGradient(
                                listOf(
                                    Color(0xFFFFB300),
                                    Color(0xFFFF6F00)
                                )
                            )
                        else
                            Brush.linearGradient(
                                listOf(
                                    Color(0xFFBDBDBD),
                                    Color(0xFF9E9E9E)
                                )
                            )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    emoji = if (isUnlocked) achievement.emoji else "🔒",
                    text = if (isUnlocked) achievement.emoji else "🔒",
                    fontSize = 32.sp
                )
            }

            Spacer(Modifier.height(10.dp))

            Text(
                achievement.title,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = if (isUnlocked) PrimaryColor else Color.Gray,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(4.dp))

            Text(
                achievement.description,
                fontSize = 10.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                lineHeight = 14.sp,
                minLines = 2
            )

            Spacer(Modifier.height(10.dp))

            // نوار پیشرفت
            Column(modifier = Modifier.fillMaxWidth()) {
                LinearProgressIndicator(
                    progress = { achievement.progress },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = if (isUnlocked) Color(0xFFFFB300) else Color.Gray,
                    trackColor = Color.LightGray.copy(alpha = 0.5f)
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = if (isUnlocked) "✅ کامل شده"
                    else "${achievement.currentValue} / ${achievement.targetValue}",
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isUnlocked) Color(0xFF43A047) else Color.Gray,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

// تابع کمکی برای نمایش ایموجی
@Composable
private fun Text(emoji: String, text: String, fontSize: androidx.compose.ui.unit.TextUnit) {
    androidx.compose.material3.Text(
        text = text,
        fontSize = fontSize
    )
}