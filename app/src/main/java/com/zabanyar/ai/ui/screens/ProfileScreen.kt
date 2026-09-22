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
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.UserManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    onBack: () -> Unit,
    onNavigateToApiKey: () -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val context = LocalContext.current
    val user = remember { UserManager.getLoggedInUser(context) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "👤 پروفایل",
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
        ) {
            // ==================== هدر پروفایل ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            listOf(PrimaryColor, SecondaryColor)
                        )
                    )
                    .padding(vertical = 30.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            user?.name?.firstOrNull()?.uppercase() ?: "U",
                            fontSize = 44.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Spacer(Modifier.height(14.dp))
                    Text(
                        user?.name ?: "کاربر",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        user?.email ?: "",
                        fontSize = 13.sp,
                        color = Color.White.copy(alpha = 0.85f)
                    )
                }
            }

            // ==================== کارت آمار ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .offset(y = (-20).dp),
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
                    StatBox("📚", "۰", "درس", AccentBlue)
                    StatBox("🔥", "۰", "روز", AccentOrange)
                    StatBox("⭐", "۰", "امتیاز", AccentPink)
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== اطلاعات ====================
            SectionLabel("📊 اطلاعات شما")

            InfoRow(
                emoji = "🎯",
                title = "سطح فعلی",
                value = when (user?.level) {
                    "BEGINNER" -> "🌱 مبتدی"
                    "INTERMEDIATE" -> "🚀 متوسط"
                    "ADVANCED" -> "🏆 پیشرفته"
                    else -> "🌱 مبتدی"
                }
            )

            InfoRow(
                emoji = "🔑",
                title = "کلید API",
                value = if (user?.apiKey.isNullOrBlank()) "وارد نشده ⚠️"
                else "وارد شده ✅",
                onClick = onNavigateToApiKey
            )

            InfoRow(
                emoji = "📅",
                title = "تاریخ عضویت",
                value = formatDate(user?.joinDate ?: 0L)
            )

            Spacer(Modifier.height(20.dp))

            // ==================== تنظیمات ====================
            SectionLabel("⚙️ تنظیمات")

            InfoRow(
                emoji = "🎙️",
                title = "تنظیمات صدا",
                value = "سرعت، زیر و بمی",
                onClick = {}
            )

            InfoRow(
                emoji = "🌐",
                title = "زبان اپلیکیشن",
                value = "فارسی",
                onClick = {}
            )

            InfoRow(
                emoji = "🔔",
                title = "اعلان‌ها",
                value = "فعال",
                onClick = {}
            )

            Spacer(Modifier.height(20.dp))

            // ==================== دستاوردها ====================
            SectionLabel("🏆 دستاوردها")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                AchievementBadgeSmall("🥇", "شروع", true, Modifier.weight(1f))
                AchievementBadgeSmall("🔥", "۷ روز", false, Modifier.weight(1f))
                AchievementBadgeSmall("📚", "۱۰ درس", false, Modifier.weight(1f))
                AchievementBadgeSmall("⭐", "۱۰۰۰", false, Modifier.weight(1f))
            }

            Spacer(Modifier.height(24.dp))

            // ==================== دکمه خروج ====================
            Button(
                onClick = {
                    UserManager.logout(context)
                    onLogout()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFEBEE),
                    contentColor = Color(0xFFC62828)
                )
            ) {
                Icon(Icons.Filled.Logout, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(8.dp))
                Text("خروج از حساب", fontWeight = FontWeight.Bold, fontSize = 15.sp)
            }

            Spacer(Modifier.height(30.dp))
        }
    }
}

@Composable
private fun SectionLabel(text: String) {
    Text(
        text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = PrimaryColor,
        modifier = Modifier.padding(
            start = 20.dp,
            end = 20.dp,
            top = 10.dp,
            bottom = 8.dp
        )
    )
}

@Composable
private fun StatBox(emoji: String, value: String, label: String, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(emoji, fontSize = 22.sp)
        Spacer(Modifier.height(4.dp))
        Text(value, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = color)
        Text(label, fontSize = 10.sp, color = Color.Gray)
    }
}

@Composable
private fun InfoRow(
    emoji: String,
    title: String,
    value: String,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
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
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(PrimaryColor.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Text(emoji, fontSize = 20.sp)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Text(
                    value,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                null,
                tint = Color.Gray
            )
        }
    }
}

@Composable
private fun AchievementBadgeSmall(
    emoji: String,
    title: String,
    unlocked: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(if (unlocked) 3.dp else 1.dp),
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
                    .size(38.dp)
                    .clip(CircleShape)
                    .background(
                        if (unlocked) AccentOrange.copy(alpha = 0.15f)
                        else Color.Gray.copy(alpha = 0.15f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(emoji, fontSize = 18.sp)
            }
            Spacer(Modifier.height(6.dp))
            Text(
                title,
                fontSize = 9.sp,
                fontWeight = FontWeight.Bold,
                color = if (unlocked) PrimaryColor else Color.Gray
            )
        }
    }
}

private fun formatDate(timestamp: Long): String {
    return try {
        val sdf = java.text.SimpleDateFormat("yyyy/MM/dd", java.util.Locale.getDefault())
        sdf.format(java.util.Date(timestamp))
    } catch (e: Exception) {
        "---"
    }
}