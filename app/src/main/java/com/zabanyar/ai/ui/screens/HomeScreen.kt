package com.zabanyar.ai.ui.screens

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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    onLogout: () -> Unit = {}
) {
    val context = LocalContext.current
    val user = remember { UserManager.getLoggedInUser(context) }

    // ==================== حالت‌های تنظیمات ====================
    var showSettingsSheet by remember { mutableStateOf(false) }
    var voiceSpeed by remember { mutableFloatStateOf(1.0f) }
    var isDarkMode by remember { mutableStateOf(false) }
    var notificationsEnabled by remember { mutableStateOf(true) }

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
                    IconButton(onClick = { showSettingsSheet = true }) {
                        Icon(
                            Icons.Filled.Settings,
                            contentDescription = "تنظیمات",
                            tint = Color.White
                        )
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
                    StatItem("📚", "۱۲", "درس", AccentBlue)
                    Divider(
                        modifier = Modifier
                            .height(40.dp)
                            .width(1.dp),
                        color = Color.LightGray.copy(alpha = 0.5f)
                    )
                    StatItem("🔥", "۵", "روز پیوسته", AccentOrange)
                    Divider(
                        modifier = Modifier
                            .height(40.dp)
                            .width(1.dp),
                        color = Color.LightGray.copy(alpha = 0.5f)
                    )
                    StatItem("⭐", "۲۴۰", "امتیاز", AccentPink)
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
                    subtitle = "۵۰۴ لغت",
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
                chapter = "فصل ۳ - مکان‌ها و اشیا",
                progress = 0.35f,
                color = PrimaryColor,
                onClick = onNavigateToLibrary
            )

            Spacer(Modifier.height(10.dp))

            ContinueLearningCard(
                bookTitle = "Vocabulary in Use",
                chapter = "درس ۵ - خانواده",
                progress = 0.60f,
                color = AccentGreen,
                onClick = onNavigateToVocabulary
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
                AchievementBadge("🥇", "اولین درس", true, Modifier.weight(1f))
                AchievementBadge("🔥", "۷ روز پیوسته", false, Modifier.weight(1f))
                AchievementBadge("📚", "۱۰ کتاب", false, Modifier.weight(1f))
                AchievementBadge("⭐", "۱۰۰۰ امتیاز", false, Modifier.weight(1f))
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

    // ==================== شیت تنظیمات ====================
    if (showSettingsSheet) {
        ModalBottomSheet(
            onDismissRequest = { showSettingsSheet = false },
            shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
            containerColor = Color.White
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                // هدر
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(PrimaryColor.copy(alpha = 0.1f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Settings, null, tint = PrimaryColor)
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "تنظیمات",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                        Text(
                            "تنظیمات اپلیکیشن",
                            fontSize = 11.sp,
                            color = Color.Gray
                        )
                    }
                }

                Spacer(Modifier.height(24.dp))

                // ==================== سرعت صوت ====================
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFF8F9FF)
                    )
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("🎙️", fontSize = 22.sp)
                            Spacer(Modifier.width(10.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    "سرعت پخش صوت",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryColor
                                )
                                Text(
                                    "سرعت خواندن متن‌ها و پادکست‌ها",
                                    fontSize = 11.sp,
                                    color = Color.Gray
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(PrimaryColor.copy(alpha = 0.1f))
                                    .padding(horizontal = 8.dp, vertical = 3.dp)
                            ) {
                                Text(
                                    "${voiceSpeed}x",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryColor
                                )
                            }
                        }
                        Spacer(Modifier.height(14.dp))

                        Slider(
                            value = voiceSpeed,
                            onValueChange = { voiceSpeed = it },
                            valueRange = 0.5f..1.5f,
                            steps = 3,
                            colors = SliderDefaults.colors(
                                thumbColor = PrimaryColor,
                                activeTrackColor = PrimaryColor
                            )
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("🐢 آهسته", fontSize = 10.sp, color = Color.Gray)
                            Text("⚡ معمولی", fontSize = 10.sp, color = Color.Gray)
                            Text("🚀 سریع", fontSize = 10.sp, color = Color.Gray)
                        }

                        Spacer(Modifier.height(10.dp))

                        // دکمه‌های سریع
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            listOf(0.5f to "0.5x", 0.75f to "0.75x", 1.0f to "1.0x", 1.25f to "1.25x", 1.5f to "1.5x")
                                .forEach { (speed, label) ->
                                    FilterChip(
                                        selected = voiceSpeed == speed,
                                        onClick = { voiceSpeed = speed },
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
                                        modifier = Modifier.weight(1f)
                                    )
                                }
                        }
                    }
                }

                Spacer(Modifier.height(12.dp))

                // ==================== حالت شب ====================
                SettingToggle(
                    emoji = "🌙",
                    title = "حالت شب",
                    subtitle = "استفاده در محیط کم‌نور",
                    checked = isDarkMode,
                    onCheckedChange = { isDarkMode = it }
                )

                Spacer(Modifier.height(10.dp))

                // ==================== اعلان‌ها ====================
                SettingToggle(
                    emoji = "🔔",
                    title = "اعلان‌ها",
                    subtitle = "یادآوری تمرین روزانه",
                    checked = notificationsEnabled,
                    onCheckedChange = { notificationsEnabled = it }
                )

                Spacer(Modifier.height(12.dp))

                // ==================== زبان ====================
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFF8F9FF)
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("🌐", fontSize = 22.sp)
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "زبان اپلیکیشن",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Text(
                                "فارسی",
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

                Button(
                    onClick = { showSettingsSheet = false },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = PrimaryColor
                    )
                ) {
                    Text(
                        "ذخیره تنظیمات",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Spacer(Modifier.height(20.dp))
            }
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

@Composable
private fun SettingToggle(
    emoji: String,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF8F9FF)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(emoji, fontSize = 22.sp)
            Spacer(Modifier.width(10.dp))
            Column(modifier = Modifier.weight(1f)) {
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
            Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                colors = SwitchDefaults.colors(
                    checkedTrackColor = PrimaryColor
                )
            )
        }
    }
}