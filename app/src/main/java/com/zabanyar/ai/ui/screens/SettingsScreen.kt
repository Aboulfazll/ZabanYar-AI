package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.ui.theme.PrimaryColor
import com.zabanyar.ai.ui.theme.SecondaryColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(onBack: () -> Unit = {}) {
    val context = LocalContext.current

    // استیت‌های تنظیمات (متصل به ProgressManager)
    var showTranslation by remember { mutableStateOf(ProgressManager.isShowTranslation(context)) }
    var isDarkMode by remember { mutableStateOf(ProgressManager.isDarkMode(context)) }
    var isSoundEnabled by remember { mutableStateOf(ProgressManager.isSoundEnabled(context)) }
    var isAutoPlay by remember { mutableStateOf(ProgressManager.isAutoPlay(context)) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("تنظیمات پیشرفته", fontWeight = FontWeight.Bold, color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
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
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // ==================== کارت هدر ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = PrimaryColor)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Brush.linearGradient(listOf(PrimaryColor, SecondaryColor)))
                        .padding(24.dp)
                ) {
                    Column {
                        Text("تنظیمات اپلیکیشن", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Spacer(Modifier.height(4.dp))
                        Text("شخصی‌سازی تجربه یادگیری", color = Color.White.copy(alpha = 0.8f), fontSize = 13.sp)
                    }
                }
            }

            // ==================== بخش یادگیری ====================
            Text("📖 تنظیمات یادگیری", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = PrimaryColor)

            SettingsToggleCard(
                icon = Icons.Filled.Translate,
                iconColor = Color(0xFFE91E63),
                title = "نمایش ترجمه (معنی)",
                subtitle = "نمایش یا مخفی کردن معنی فارسی کلمات و جملات",
                checked = showTranslation,
                onCheckedChange = {
                    showTranslation = it
                    ProgressManager.setShowTranslation(context, it)
                }
            )

            SettingsToggleCard(
                icon = Icons.Filled.AutoAwesome,
                iconColor = Color(0xFFFF9800),
                title = "یادگیری هوشمند",
                subtitle = "نمایش خودکار درس بعدی پس از اتمام",
                checked = isAutoPlay,
                onCheckedChange = {
                    isAutoPlay = it
                    ProgressManager.setAutoPlay(context, it)
                }
            )

            Spacer(Modifier.height(8.dp))

            // ==================== بخش ظاهر و صدا ====================
            Text("🎨 ظاهر و صدا", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = PrimaryColor)

            SettingsToggleCard(
                icon = Icons.Filled.DarkMode,
                iconColor = Color(0xFF3F51B5),
                title = "حالت شب (Dark Mode)",
                subtitle = "تغییر رنگ‌بندی به حالت تیره",
                checked = isDarkMode,
                onCheckedChange = {
                    isDarkMode = it
                    ProgressManager.setDarkMode(context, it)
                }
            )

            SettingsToggleCard(
                icon = Icons.Filled.VolumeUp,
                iconColor = Color(0xFF4CAF50),
                title = "جلوه‌های صوتی",
                subtitle = "پخش صدا هنگام تعامل با اپ",
                checked = isSoundEnabled,
                onCheckedChange = {
                    isSoundEnabled = it
                    ProgressManager.setSoundEnabled(context, it)
                }
            )

            Spacer(Modifier.height(16.dp))

            // ==================== دکمه ذخیره ====================
            Button(
                onClick = { onBack() },
                modifier = Modifier.fillMaxWidth().height(50.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
            ) {
                Icon(Icons.Filled.Check, null, tint = Color.White)
                Spacer(Modifier.width(8.dp))
                Text("ذخیره تغییرات", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
        }
    }
}

// ==================== کامپوننت کارت تنظیمات ====================
@Composable
fun SettingsToggleCard(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(iconColor.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, null, tint = iconColor, modifier = Modifier.size(24.dp))
            }

            Spacer(Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(title, fontWeight = FontWeight.Bold, fontSize = 14.sp, color = PrimaryColor)
                Text(subtitle, fontSize = 11.sp, color = Color.Gray, maxLines = 2)
            }

            Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White,
                    checkedTrackColor = PrimaryColor,
                    uncheckedThumbColor = Color.Gray,
                    uncheckedTrackColor = Color.LightGray.copy(alpha = 0.5f)
                )
            )
        }
    }
}