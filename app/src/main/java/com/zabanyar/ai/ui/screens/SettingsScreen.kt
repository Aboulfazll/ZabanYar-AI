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
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.NotificationHelper
import com.zabanyar.ai.data.NotificationScheduler
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.UserManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onBack: () -> Unit,
    onNavigateToApiKey: () -> Unit = {}
) {
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current
    val user = remember { UserManager.getLoggedInUser(context) }

    // ============ تنظیمات صدا ============
    var voiceSpeed by remember { mutableFloatStateOf(ProgressManager.getVoiceSpeed(context)) }
    var voicePitch by remember { mutableFloatStateOf(1.0f) }
    var autoPlayAudio by remember { mutableStateOf(true) }
    var soundEffects by remember { mutableStateOf(true) }
    var voiceGender by remember { mutableStateOf("female") }
    var voiceAccent by remember { mutableStateOf("US") }

    // ============ تنظیمات اعلان ============
    var notificationsEnabled by remember { mutableStateOf(ProgressManager.isNotificationsEnabled(context)) }
    var notificationHour by remember { mutableIntStateOf(NotificationScheduler.getNotificationHour(context)) }
    var notificationMinute by remember { mutableIntStateOf(NotificationScheduler.getNotificationMinute(context)) }
    var showTimePicker by remember { mutableStateOf(false) }

    // ============ تنظیمات ظاهر ============
    var darkModeEnabled by remember { mutableStateOf(false) }
    var fontSize by remember { mutableFloatStateOf(1.0f) }
    var selectedLanguage by remember { mutableStateOf("فارسی") }

    // ============ تنظیمات یادگیری ============
    var dailyGoal by remember { mutableIntStateOf(10) } // دقیقه
    var showTranslation by remember { mutableStateOf(true) }
    var showPronunciation by remember { mutableStateOf(true) }

    // ============ دیالوگ‌ها ============
    var showResetDialog by remember { mutableStateOf(false) }
    var showAboutDialog by remember { mutableStateOf(false) }
    var showClearChatDialog by remember { mutableStateOf(false) }
    var savedMessage by remember { mutableStateOf(false) }

    // ============ آمار ============
    val totalStars = remember { ProgressManager.getTotalStars(context) }
    val lessonsCompleted = remember { ProgressManager.getLessonsCompleted(context) }
    val dailyStreak = remember { ProgressManager.getDailyStreak(context) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "⚙️ تنظیمات",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 17.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                actions = {
                    IconButton(onClick = {
                        ProgressManager.setVoiceSpeed(context, voiceSpeed)
                        ProgressManager.setNotificationsEnabled(context, notificationsEnabled)
                        savedMessage = true
                    }) {
                        Icon(Icons.Filled.Check, "Save", tint = Color.White)
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
            // ==================== هدر ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(listOf(PrimaryColor, SecondaryColor)))
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("⚙️", fontSize = 30.sp)
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "تنظیمات پیشرفته",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "همه چیز رو شخصی‌سازی کن",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                    }
                }
            }

            // ==================== کارت آماری ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .offset(y = (-20).dp),
                shape = RoundedCornerShape(18.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    MiniStat("📚", "$lessonsCompleted", "درس")
                    Divider(modifier = Modifier.height(40.dp).width(1.dp), color = Color.LightGray.copy(alpha = 0.5f))
                    MiniStat("🔥", "$dailyStreak", "روز")
                    Divider(modifier = Modifier.height(40.dp).width(1.dp), color = Color.LightGray.copy(alpha = 0.5f))
                    MiniStat("⭐", "$totalStars", "امتیاز")
                }
            }

            Spacer(Modifier.offset(y = (-12).dp))

            // ==================== 🔑 حساب کاربری ====================
            SectionHeader("🔑 حساب کاربری")

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(Brush.linearGradient(listOf(PrimaryColor, SecondaryColor))),
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
                            Text(
                                "سطح: ${when (user?.level) {
                                    "BEGINNER" -> "🌱 مبتدی"
                                    "INTERMEDIATE" -> "🚀 متوسط"
                                    "ADVANCED" -> "🏆 پیشرفته"
                                    else -> "🌱 مبتدی"
                                }}",
                                fontSize = 11.sp,
                                color = Color.Gray
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            SettingsRow(
                emoji = "🗝️",
                title = "کلید API Groq",
                subtitle = if (user?.apiKey.isNullOrBlank()) "وارد نشده ⚠️" else "وارد شده ✅",
                onClick = onNavigateToApiKey
            )

            Spacer(Modifier.height(20.dp))

            // ==================== 🎙️ تنظیمات صدا ====================
            SectionHeader("🎙️ تنظیمات صدا")

            // سرعت صوت
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(CircleShape)
                                .background(PrimaryColor.copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🎙️", fontSize = 20.sp)
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text("سرعت پخش صوت", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                            Text("سرعت خواندن متن‌ها", fontSize = 11.sp, color = Color.Gray)
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(PrimaryColor.copy(alpha = 0.1f))
                                .padding(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Text(
                                "${String.format("%.2f", voiceSpeed)}x",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    Slider(
                        value = voiceSpeed,
                        onValueChange = { voiceSpeed = it },
                        valueRange = 0.5f..2.0f,
                        steps = 5,
                        colors = SliderDefaults.colors(
                            thumbColor = PrimaryColor,
                            activeTrackColor = PrimaryColor
                        )
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("🐢 خیلی آهسته", fontSize = 10.sp, color = Color.Gray)
                        Text("⚡ معمولی", fontSize = 10.sp, color = Color.Gray)
                        Text("🚀 خیلی سریع", fontSize = 10.sp, color = Color.Gray)
                    }

                    Spacer(Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        listOf(
                            0.5f to "0.5x", 0.75f to "0.75x", 1.0f to "1.0x",
                            1.25f to "1.25x", 1.5f to "1.5x", 2.0f to "2.0x"
                        ).forEach { (speed, label) ->
                            FilterChip(
                                selected = voiceSpeed == speed,
                                onClick = { voiceSpeed = speed },
                                label = { Text(label, fontSize = 10.sp, fontWeight = FontWeight.Bold) },
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

            Spacer(Modifier.height(8.dp))

            // زیر و بمی صدا
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(CircleShape)
                                .background(PrimaryColor.copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🎵", fontSize = 20.sp)
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text("زیر و بمی صدا", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                            Text("تنظیم صدای گوینده", fontSize = 11.sp, color = Color.Gray)
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    Slider(
                        value = voicePitch,
                        onValueChange = { voicePitch = it },
                        valueRange = 0.5f..1.5f,
                        steps = 5,
                        colors = SliderDefaults.colors(
                            thumbColor = PrimaryColor,
                            activeTrackColor = PrimaryColor
                        )
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            // جنسیت صدا
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text("👤 جنسیت صدا", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                    Spacer(Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf("female" to "👩 زن", "male" to "👨 مرد").forEach { (gender, label) ->
                            FilterChip(
                                selected = voiceGender == gender,
                                onClick = { voiceGender = gender },
                                label = { Text(label, fontSize = 12.sp, fontWeight = FontWeight.Bold) },
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

            Spacer(Modifier.height(8.dp))

            // لهجه
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text("🌍 لهجه", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                    Spacer(Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf("US" to "🇺🇸 آمریکایی", "UK" to "🇬🇧 بریتانیایی").forEach { (accent, label) ->
                            FilterChip(
                                selected = voiceAccent == accent,
                                onClick = { voiceAccent = accent },
                                label = { Text(label, fontSize = 11.sp, fontWeight = FontWeight.Bold) },
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

            Spacer(Modifier.height(8.dp))

            SettingsToggle(
                emoji = "▶️",
                title = "پخش خودکار",
                subtitle = "پخش خودکار صدا هنگام باز کردن درس",
                checked = autoPlayAudio,
                onCheckedChange = { autoPlayAudio = it }
            )

            Spacer(Modifier.height(8.dp))

            SettingsToggle(
                emoji = "🔊",
                title = "جلوه‌های صوتی",
                subtitle = "صدای کلیک و اعلان‌ها",
                checked = soundEffects,
                onCheckedChange = { soundEffects = it }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== 🔔 اعلان‌ها ====================
            SectionHeader("🔔 اعلان‌ها")

            SettingsToggle(
                emoji = "🔔",
                title = "اعلان‌های یادگیری",
                subtitle = "یادآوری روزانه برای تمرین",
                checked = notificationsEnabled,
                onCheckedChange = { enabled ->
                    notificationsEnabled = enabled
                    ProgressManager.setNotificationsEnabled(context, enabled)
                    if (enabled) {
                        NotificationScheduler.scheduleDailyNotification(context)
                    } else {
                        NotificationScheduler.cancelDailyNotification(context)
                    }
                }
            )

            Spacer(Modifier.height(8.dp))

            // زمان اعلان
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp)
                    .clickable { showTimePicker = true },
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                            .background(PrimaryColor.copy(alpha = 0.1f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("🕐", fontSize = 20.sp)
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text("زمان اعلان", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                        Text(
                            String.format("%02d:%02d", notificationHour, notificationMinute),
                            fontSize = 13.sp,
                            color = SecondaryColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Icon(
                        Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        null,
                        tint = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            SettingsRow(
                emoji = "🧪",
                title = "تست اعلان",
                subtitle = "یه اعلان نمونه نمایش بده",
                onClick = { NotificationHelper.showDailyReminder(context) }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== 🎨 ظاهر و زبان ====================
            SectionHeader("🎨 ظاهر و زبان")

            SettingsToggle(
                emoji = "🌙",
                title = "حالت شب",
                subtitle = "استفاده در محیط کم‌نور",
                checked = darkModeEnabled,
                onCheckedChange = { darkModeEnabled = it }
            )

            Spacer(Modifier.height(8.dp))

            // اندازه فونت
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(CircleShape)
                                .background(PrimaryColor.copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🔤", fontSize = 20.sp)
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text("اندازه فونت", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                            Text("اندازه متن اپلیکیشن", fontSize = 11.sp, color = Color.Gray)
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(PrimaryColor.copy(alpha = 0.1f))
                                .padding(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Text(
                                "${(fontSize * 100).toInt()}%",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    Slider(
                        value = fontSize,
                        onValueChange = { fontSize = it },
                        valueRange = 0.8f..1.3f,
                        steps = 4,
                        colors = SliderDefaults.colors(
                            thumbColor = PrimaryColor,
                            activeTrackColor = PrimaryColor
                        )
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("کوچک", fontSize = 10.sp, color = Color.Gray)
                        Text("معمولی", fontSize = 10.sp, color = Color.Gray)
                        Text("بزرگ", fontSize = 10.sp, color = Color.Gray)
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // زبان
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text("🌐 زبان اپلیکیشن", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                    Spacer(Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        listOf("فارسی", "English", "العربية").forEach { lang ->
                            FilterChip(
                                selected = selectedLanguage == lang,
                                onClick = { selectedLanguage = lang },
                                label = { Text(lang, fontSize = 11.sp, fontWeight = FontWeight.Bold) },
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

            Spacer(Modifier.height(20.dp))

            // ==================== 📖 تنظیمات یادگیری ====================
            SectionHeader("📖 تنظیمات یادگیری")

            // هدف روزانه
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(CircleShape)
                                .background(PrimaryColor.copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🎯", fontSize = 20.sp)
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text("هدف روزانه", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                            Text("چند دقیقه در روز تمرین کنی؟", fontSize = 11.sp, color = Color.Gray)
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(PrimaryColor.copy(alpha = 0.1f))
                                .padding(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Text(
                                "$dailyGoal دقیقه",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        listOf(5, 10, 15, 20, 30).forEach { minutes ->
                            FilterChip(
                                selected = dailyGoal == minutes,
                                onClick = { dailyGoal = minutes },
                                label = { Text("$minutes", fontSize = 11.sp, fontWeight = FontWeight.Bold) },
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

            Spacer(Modifier.height(8.dp))

            SettingsToggle(
                emoji = "🇮🇷",
                title = "نمایش ترجمه",
                subtitle = "نمایش ترجمه فارسی کنار متن انگلیسی",
                checked = showTranslation,
                onCheckedChange = { showTranslation = it }
            )

            Spacer(Modifier.height(8.dp))

            SettingsToggle(
                emoji = "🔤",
                title = "نمایش تلفظ",
                subtitle = "نمایش تلفظ فونتیک کنار کلمات",
                checked = showPronunciation,
                onCheckedChange = { showPronunciation = it }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== 📊 مدیریت داده‌ها ====================
            SectionHeader("📊 مدیریت داده‌ها")

            SettingsRow(
                emoji = "💬",
                title = "پاک کردن تاریخچه چت",
                subtitle = "حذف تمام مکالمات با AI",
                onClick = { showClearChatDialog = true }
            )

            Spacer(Modifier.height(8.dp))

            SettingsRow(
                emoji = "🗑️",
                title = "پاک کردن پیشرفت",
                subtitle = "حذف تمام امتیازات و درس‌ها",
                onClick = { showResetDialog = true },
                danger = true
            )

            Spacer(Modifier.height(20.dp))

            // ==================== ℹ️ اطلاعات ====================
            SectionHeader("ℹ️ اطلاعات")

            SettingsRow(
                emoji = "📄",
                title = "درباره اپلیکیشن",
                subtitle = "نسخه ۱.۰.۰",
                onClick = { showAboutDialog = true }
            )

            Spacer(Modifier.height(8.dp))

            SettingsRow(
                emoji = "⭐",
                title = "امتیاز به اپلیکیشن",
                subtitle = "در کافه‌بازار / مایکت",
                onClick = { }
            )

            Spacer(Modifier.height(8.dp))

            SettingsRow(
                emoji = "📧",
                title = "تماس با ما",
                subtitle = "پشتیبانی و انتقادات",
                onClick = {
                    try {
                        uriHandler.openUri("mailto:support@zabanyar.ai")
                    } catch (e: Exception) { }
                }
            )

            Spacer(Modifier.height(8.dp))

            SettingsRow(
                emoji = "🔄",
                title = "بررسی به‌روزرسانی",
                subtitle = "آخرین نسخه رو چک کن",
                onClick = { }
            )

            Spacer(Modifier.height(24.dp))

            // ==================== دکمه ذخیره ====================
            Button(
                onClick = {
                    ProgressManager.setVoiceSpeed(context, voiceSpeed)
                    ProgressManager.setNotificationsEnabled(context, notificationsEnabled)
                    NotificationScheduler.setNotificationTime(context, notificationHour, notificationMinute)
                    savedMessage = true
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
            ) {
                Icon(Icons.Filled.Check, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(8.dp))
                Text("ذخیره تنظیمات", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 15.sp)
            }

            if (savedMessage) {
                Spacer(Modifier.height(12.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("✅", fontSize = 18.sp)
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "تنظیمات با موفقیت ذخیره شد!",
                            fontSize = 12.sp,
                            color = Color(0xFF2E7D32),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(Modifier.height(30.dp))
        }
    }

    // ==================== دیالوگ انتخاب زمان ====================
    if (showTimePicker) {
        AlertDialog(
            onDismissRequest = { showTimePicker = false },
            title = {
                Text("🕐 زمان اعلان", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            },
            text = {
                Column {
                    Text("ساعتی که می‌خوای اعلان بگیری رو انتخاب کن:", fontSize = 13.sp)
                    Spacer(Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf(8 to "۸ صبح", 12 to "ظهر", 15 to "۳ عصر", 20 to "۸ شب", 22 to "۱۰ شب").forEach { (hour, label) ->
                            FilterChip(
                                selected = notificationHour == hour,
                                onClick = {
                                    notificationHour = hour
                                    notificationMinute = 0
                                },
                                label = { Text(label, fontSize = 10.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = PrimaryColor,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        NotificationScheduler.setNotificationTime(context, notificationHour, notificationMinute)
                        showTimePicker = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
                ) {
                    Text("تأیید", color = Color.White, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { showTimePicker = false }) {
                    Text("انصراف", color = PrimaryColor)
                }
            }
        )
    }

    // ==================== دیالوگ پاک کردن پیشرفت ====================
    if (showResetDialog) {
        AlertDialog(
            onDismissRequest = { showResetDialog = false },
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("⚠️", fontSize = 24.sp)
                    Spacer(Modifier.width(8.dp))
                    Text("پاک کردن پیشرفت", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }
            },
            text = {
                Text(
                    "آیا مطمئنی می‌خوای تمام پیشرفتت رو پاک کنی؟\n\nاین عمل قابل بازگشت نیست!",
                    fontSize = 13.sp,
                    lineHeight = 20.sp
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        ProgressManager.resetAllProgress(context)
                        showResetDialog = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC62828))
                ) {
                    Text("بله، پاک کن", color = Color.White, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { showResetDialog = false }) {
                    Text("انصراف", color = PrimaryColor)
                }
            }
        )
    }

    // ==================== دیالوگ پاک کردن چت ====================
    if (showClearChatDialog) {
        AlertDialog(
            onDismissRequest = { showClearChatDialog = false },
            title = {
                Text("💬 پاک کردن تاریخچه چت", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            },
            text = {
                Text("تاریخچه چت با معلم هوشمند پاک بشه؟", fontSize = 13.sp)
            },
            confirmButton = {
                Button(
                    onClick = { showClearChatDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC62828))
                ) {
                    Text("بله", color = Color.White, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { showClearChatDialog = false }) {
                    Text("انصراف", color = PrimaryColor)
                }
            }
        )
    }

    // ==================== دیالوگ درباره ====================
    if (showAboutDialog) {
        AlertDialog(
            onDismissRequest = { showAboutDialog = false },
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("🎓", fontSize = 28.sp)
                    Spacer(Modifier.width(8.dp))
                    Column {
                        Text("زبان‌یار AI", fontWeight = FontWeight.Bold, fontSize = 17.sp, color = PrimaryColor)
                        Text("نسخه ۱.۰.۰", fontSize = 11.sp, color = Color.Gray)
                    }
                }
            },
            text = {
                Column {
                    Text("دستیار هوشمند یادگیری زبان انگلیسی", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "با استفاده از هوش مصنوعی Groq، به شما در یادگیری گرامر، لغات، مکالمه و تلفظ کمک می‌کند.",
                        fontSize = 12.sp,
                        lineHeight = 20.sp,
                        color = Color(0xFF424242)
                    )
                    Spacer(Modifier.height(14.dp))
                    Divider()
                    Spacer(Modifier.height(14.dp))
                    Text("✨ امکانات:", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                    Spacer(Modifier.height(6.dp))
                    listOf(
                        "📚 ۵۳+ کتاب آموزشی",
                        "🤖 معلم هوشمند AI",
                        "🎧 پادکست‌های آموزشی",
                        "🗣️ تمرین اسپیکینگ",
                        "📝 بانک واژگان",
                        "🏆 سیستم امتیازدهی",
                        "📖 حالت خوانش تعاملی",
                        "🔔 اعلان‌های روزانه"
                    ).forEach { feature ->
                        Text(feature, fontSize = 12.sp, color = Color(0xFF424242), lineHeight = 20.sp)
                    }
                }
            },
            confirmButton = {
                Button(
                    onClick = { showAboutDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
                ) {
                    Text("بستن", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }
        )
    }
}

// ==================== کامپوزبل‌های کمکی ====================

@Composable
private fun SectionHeader(text: String) {
    Text(
        text,
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        color = PrimaryColor,
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 8.dp, bottom = 12.dp)
    )
}

@Composable
private fun SettingsToggle(
    emoji: String,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp),
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
                Text(title, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                Text(subtitle, fontSize = 11.sp, color = Color.Gray)
            }
            Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                colors = SwitchDefaults.colors(checkedTrackColor = PrimaryColor)
            )
        }
    }
}

@Composable
private fun SettingsRow(
    emoji: String,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    danger: Boolean = false
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (danger) Color(0xFFFFEBEE) else Color.White
        ),
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
                    .background(
                        if (danger) Color(0xFFC62828).copy(alpha = 0.1f)
                        else PrimaryColor.copy(alpha = 0.1f)
                    ),
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
                    color = if (danger) Color(0xFFC62828) else PrimaryColor
                )
                Text(subtitle, fontSize = 11.sp, color = Color.Gray)
            }
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                null,
                tint = if (danger) Color(0xFFC62828) else Color.Gray
            )
        }
    }
}

@Composable
private fun MiniStat(emoji: String, value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(emoji, fontSize = 20.sp)
        Spacer(Modifier.height(4.dp))
        Text(value, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
        Text(label, fontSize = 10.sp, color = Color.Gray)
    }
}