package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
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
import com.zabanyar.ai.data.UserManager

// ==================== رنگ‌ها ====================
val PrimaryColor = Color(0xFF1A237E)
val SecondaryColor = Color(0xFF6200EE)
val AccentGreen = Color(0xFF11998E)
val AccentPink = Color(0xFFE91E63)
val AccentOrange = Color(0xFFFF6F00)
val AccentBlue = Color(0xFF0288D1)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToLibrary: () -> Unit = {},
    onNavigateToAIChat: () -> Unit = {},
    onNavigateToSpeaking: () -> Unit = {},
    onNavigateToVocabulary: () -> Unit = {},
    onNavigateToProfile: () -> Unit = {},
    onNavigateToSettings: () -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val context = LocalContext.current
    val user = remember { UserManager.getLoggedInUser(context) }

    // آمار از ProgressManager
    val totalStars = remember { ProgressManager.getTotalStars(context) }
    val lessonsCompleted = remember { ProgressManager.getLessonsCompleted(context) }
    val dailyStreak = remember { ProgressManager.getDailyStreak(context) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
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
            // ==================== هدر خوش‌آمدگویی ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            listOf(PrimaryColor, SecondaryColor)
                        )
                    )
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp, bottom = 60.dp)
            ) {
                Column {
                    Text(
                        "سلام، ${user?.name ?: "کاربر"} 👋",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        "امروز چه چیزی یاد بگیریم؟",
                        fontSize = 13.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }

            // ==================== کارت آماری شناور ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .offset(y = (-40).dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 18.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    StatItem("📚", "$lessonsCompleted", "درس", AccentBlue)
                    Divider(
                        modifier = Modifier
                            .height(40.dp)
                            .width(1.dp),
                        color = Color.LightGray.copy(alpha = 0.5f)
                    )
                    StatItem("🔥", "$dailyStreak", "روز پیوسته", AccentOrange)
                    Divider(
                        modifier = Modifier
                            .height(40.dp)
                            .width(1.dp),
                        color = Color.LightGray.copy(alpha = 0.5f)
                    )
                    StatItem("⭐", "$totalStars", "امتیاز", AccentPink)
                }
            }

            Spacer(Modifier.offset(y = (-24).dp))

            // ==================== دسترسی سریع ====================
            SectionTitle("🚀 دسترسی سریع")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                QuickAccessCard(
                    emoji = "📚",
                    title = "کتابخانه",
                    subtitle = "۱۷ کتاب",
                    gradient = listOf(Color(0xFF6A1B9A), Color(0xFFAB47BC)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToLibrary
                )
                QuickAccessCard(
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
                QuickAccessCard(
                    emoji = "🗣️",
                    title = "اسپیکینگ",
                    subtitle = "تمرین گفتار",
                    gradient = listOf(Color(0xFFC62828), Color(0xFFEF5350)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToSpeaking
                )
                QuickAccessCard(
                    emoji = "📝",
                    title = "واژگان",
                    subtitle = "بانک لغات",
                    gradient = listOf(Color(0xFFE91E63), Color(0xFFF06292)),
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToVocabulary
                )
            }

            Spacer(Modifier.height(24.dp))

            // ==================== ادامه یادگیری ====================
            SectionTitle("📖 ادامه یادگیری")

            ContinueLearningCard(
                bookTitle = "Top Notch 1",
                chapter = "فصل ۱ - نام‌ها و شغل‌ها",
                progress = 0.15f,
                color = PrimaryColor,
                onClick = onNavigateToLibrary
            )

            Spacer(Modifier.height(10.dp))

            ContinueLearningCard(
                bookTitle = "Basic Grammar",
                chapter = "درس ۲ - a / an",
                progress = 0.40f,
                color = AccentGreen,
                onClick = onNavigateToLibrary
            )

            Spacer(Modifier.height(24.dp))

            // ==================== دستاوردها ====================
            SectionTitle("🏆 دستاوردهای شما")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                AchievementBadge("🥇", "شروع", lessonsCompleted > 0, Modifier.weight(1f))
                AchievementBadge("🔥", "۷ روز", dailyStreak >= 7, Modifier.weight(1f))
                AchievementBadge("📚", "۱۰ درس", lessonsCompleted >= 10, Modifier.weight(1f))
                AchievementBadge("⭐", "۱۰۰۰", totalStars >= 1000, Modifier.weight(1f))
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
                    contentColor = Color(0xFFC62828)
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

// ==================== کامپوزبل‌های کمکی ====================

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
private fun StatItem(emoji: String, value: String, label: String, color: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Text(emoji, fontSize = 22.sp)
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

@Composable
private fun QuickAccessCard(
    emoji: String,
    title: String,
    subtitle: String,
    gradient: List<Color>,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .height(120.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.linearGradient(gradient))
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
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
                Column {
                    Text(
                        title,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
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
private fun ContinueLearningCard(
    bookTitle: String,
    chapter: String,
    progress: Float,
    color: Color,
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
                    .size(50.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(color, color.copy(alpha = 0.7f))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text("📖", fontSize = 24.sp)
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
                    chapter,
                    fontSize = 11.sp,
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
                Spacer(Modifier.height(4.dp))
                Text(
                    "${(progress * 100).toInt()}%",
                    fontSize = 10.sp,
                    color = color,
                    fontWeight = FontWeight.Bold
                )
            }
            Icon(
                Icons.Filled.PlayArrow,
                null,
                tint = color,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Composable
private fun AchievementBadge(
    emoji: String,
    title: String,
    unlocked: Boolean,
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
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(
                        if (unlocked) AccentOrange.copy(alpha = 0.15f)
                        else Color.Gray.copy(alpha = 0.15f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    emoji,
                    fontSize = 20.sp
                )
            }
            Spacer(Modifier.height(6.dp))
            Text(
                title,
                fontSize = 9.sp,
                fontWeight = FontWeight.Bold,
                color = if (unlocked) PrimaryColor else Color.Gray,
                textAlign = TextAlign.Center,
                lineHeight = 12.sp
            )
        }
    }
}