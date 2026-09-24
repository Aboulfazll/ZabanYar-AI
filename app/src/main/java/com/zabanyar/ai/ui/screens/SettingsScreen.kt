package com.zabanyar.ai.ui.screens

import android.content.Context
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.draw.rotate
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

// ============================================================
// Advanced Settings Storage (Self-contained, no breakage)
// ============================================================
private object AdvancedSettings {
    private const val PREF_NAME = "zabanyar_advanced_settings"

    fun getString(context: Context, key: String, default: String = ""): String =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .getString(key, default) ?: default

    fun setString(context: Context, key: String, value: String) {
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .edit().putString(key, value).apply()
    }

    fun getBool(context: Context, key: String, default: Boolean = false): Boolean =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .getBoolean(key, default)

    fun setBool(context: Context, key: String, value: Boolean) {
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .edit().putBoolean(key, value).apply()
    }

    fun getInt(context: Context, key: String, default: Int = 0): Int =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .getInt(key, default)

    fun setInt(context: Context, key: String, value: Int) {
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .edit().putInt(key, value).apply()
    }

    fun getFloat(context: Context, key: String, default: Float = 0f): Float =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .getFloat(key, default)

    fun setFloat(context: Context, key: String, value: Float) {
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .edit().putFloat(key, value).apply()
    }

    fun clearAll(context: Context) {
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            .edit().clear().apply()
    }
}

// ============================================================
// Settings Section Enum
// ============================================================
private enum class SettingsSection(val title: String, val emoji: String, val key: String) {
    ACCOUNT("حساب کاربری", "🔑", "account"),
    APPEARANCE("ظاهر و تم", "🎨", "appearance"),
    VOICE("صدا و تلفظ", "🎙️", "voice"),
    NOTIFICATIONS("اعلان‌ها", "🔔", "notifications"),
    LEARNING("یادگیری", "📖", "learning"),
    AI("هوش مصنوعی", "🤖", "ai"),
    DATA("مدیریت داده", "📊", "data"),
    ABOUT("درباره", "ℹ️", "about")
}

// ============================================================
// Main Settings Screen
// ============================================================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onBack: () -> Unit,
    onNavigateToApiKey: () -> Unit = {}
) {
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current
    val user = remember { UserManager.getLoggedInUser(context) }

    // ============ حالت جستجو ============
    var searchQuery by remember { mutableStateOf("") }
    var isSearching by remember { mutableStateOf(false) }

    // ============ تنظیمات صدا ============
    var voiceSpeed by remember { mutableFloatStateOf(ProgressManager.getVoiceSpeed(context)) }
    var voicePitch by remember { mutableFloatStateOf(AdvancedSettings.getFloat(context, "voice_pitch", 1.0f)) }
    var autoPlayAudio by remember { mutableStateOf(AdvancedSettings.getBool(context, "auto_play", true)) }
    var soundEffects by remember { mutableStateOf(AdvancedSettings.getBool(context, "sound_effects", true)) }
    var voiceGender by remember { mutableStateOf(AdvancedSettings.getString(context, "voice_gender", "female")) }
    var voiceAccent by remember { mutableStateOf(AdvancedSettings.getString(context, "voice_accent", "US")) }
    var repeatMode by remember { mutableStateOf(AdvancedSettings.getString(context, "repeat_mode", "off")) }

    // ============ تنظیمات اعلان ============
    var notificationsEnabled by remember { mutableStateOf(ProgressManager.isNotificationsEnabled(context)) }
    var notificationHour by remember { mutableIntStateOf(NotificationScheduler.getNotificationHour(context)) }
    var notificationMinute by remember { mutableIntStateOf(NotificationScheduler.getNotificationMinute(context)) }
    var notificationSound by remember { mutableStateOf(AdvancedSettings.getBool(context, "notif_sound", true)) }
    var notificationVibrate by remember { mutableStateOf(AdvancedSettings.getBool(context, "notif_vibrate", true)) }
    var showTimePicker by remember { mutableStateOf(false) }
    val notificationDays = remember { mutableStateListOf<Int>().apply {
        addAll(listOf(0, 1, 2, 3, 4, 5, 6))
    } }

    // ============ تنظیمات ظاهر ============
    var darkModeEnabled by remember { mutableStateOf(AdvancedSettings.getBool(context, "dark_mode", false)) }
    var fontSize by remember { mutableFloatStateOf(AdvancedSettings.getFloat(context, "font_size", 1.0f)) }
    var selectedLanguage by remember { mutableStateOf(AdvancedSettings.getString(context, "app_lang", "فارسی")) }
    var selectedTheme by remember { mutableStateOf(AdvancedSettings.getString(context, "theme", "blue")) }
    var animationsEnabled by remember { mutableStateOf(AdvancedSettings.getBool(context, "animations", true)) }
    var roundedCorners by remember { mutableStateOf(AdvancedSettings.getBool(context, "rounded", true)) }

    // ============ تنظیمات یادگیری ============
    var dailyGoal by remember { mutableIntStateOf(AdvancedSettings.getInt(context, "daily_goal", 10)) }
    var showTranslation by remember { mutableStateOf(AdvancedSettings.getBool(context, "show_translation", true)) }
    var showPronunciation by remember { mutableStateOf(AdvancedSettings.getBool(context, "show_pronunciation", true)) }
    var showExamples by remember { mutableStateOf(AdvancedSettings.getBool(context, "show_examples", true)) }
    var autoNextChapter by remember { mutableStateOf(AdvancedSettings.getBool(context, "auto_next", false)) }
    var difficultyLevel by remember { mutableStateOf(AdvancedSettings.getString(context, "difficulty", "متوسط")) }

    // ============ تنظیمات AI ============
    var aiModel by remember { mutableStateOf(AdvancedSettings.getString(context, "ai_model", "llama-3.3-70b")) }
    var aiTemperature by remember { mutableFloatStateOf(AdvancedSettings.getFloat(context, "ai_temp", 0.7f)) }
    var aiResponseLang by remember { mutableStateOf(AdvancedSettings.getString(context, "ai_lang", "فارسی")) }
    var aiMaxTokens by remember { mutableIntStateOf(AdvancedSettings.getInt(context, "ai_tokens", 1024)) }

    // ============ دیالوگ‌ها ============
    var showResetDialog by remember { mutableStateOf(false) }
    var showAboutDialog by remember { mutableStateOf(false) }
    var showClearChatDialog by remember { mutableStateOf(false) }
    var showExportDialog by remember { mutableStateOf(false) }
    var showThemeDialog by remember { mutableStateOf(false) }
    var savedMessage by remember { mutableStateOf(false) }
    var expandedSections = remember { mutableStateMapOf<String, Boolean>() }

    // Initialize all sections as expanded
    LaunchedEffect(Unit) {
        SettingsSection.values().forEach { section ->
            if (!expandedSections.containsKey(section.key)) {
                expandedSections[section.key] = true
            }
        }
    }

    // ============ آمار ============
    val totalStars = remember { ProgressManager.getTotalStars(context) }
    val lessonsCompleted = remember { ProgressManager.getLessonsCompleted(context) }
    val dailyStreak = remember { ProgressManager.getDailyStreak(context) }

    // ============ Save Function ============
    fun saveAllSettings() {
        ProgressManager.setVoiceSpeed(context, voiceSpeed)
        ProgressManager.setNotificationsEnabled(context, notificationsEnabled)
        NotificationScheduler.setNotificationTime(context, notificationHour, notificationMinute)

        AdvancedSettings.setFloat(context, "voice_pitch", voicePitch)
        AdvancedSettings.setBool(context, "auto_play", autoPlayAudio)
        AdvancedSettings.setBool(context, "sound_effects", soundEffects)
        AdvancedSettings.setString(context, "voice_gender", voiceGender)
        AdvancedSettings.setString(context, "voice_accent", voiceAccent)
        AdvancedSettings.setString(context, "repeat_mode", repeatMode)

        AdvancedSettings.setBool(context, "notif_sound", notificationSound)
        AdvancedSettings.setBool(context, "notif_vibrate", notificationVibrate)

        AdvancedSettings.setBool(context, "dark_mode", darkModeEnabled)
        AdvancedSettings.setFloat(context, "font_size", fontSize)
        AdvancedSettings.setString(context, "app_lang", selectedLanguage)
        AdvancedSettings.setString(context, "theme", selectedTheme)
        AdvancedSettings.setBool(context, "animations", animationsEnabled)
        AdvancedSettings.setBool(context, "rounded", roundedCorners)

        AdvancedSettings.setInt(context, "daily_goal", dailyGoal)
        AdvancedSettings.setBool(context, "show_translation", showTranslation)
        AdvancedSettings.setBool(context, "show_pronunciation", showPronunciation)
        AdvancedSettings.setBool(context, "show_examples", showExamples)
        AdvancedSettings.setBool(context, "auto_next", autoNextChapter)
        AdvancedSettings.setString(context, "difficulty", difficultyLevel)

        AdvancedSettings.setString(context, "ai_model", aiModel)
        AdvancedSettings.setFloat(context, "ai_temp", aiTemperature)
        AdvancedSettings.setString(context, "ai_lang", aiResponseLang)
        AdvancedSettings.setInt(context, "ai_tokens", aiMaxTokens)

        savedMessage = true
    }

    // Filter sections based on search
    val visibleSections = remember(searchQuery) {
        if (searchQuery.isEmpty()) SettingsSection.values().toList()
        else SettingsSection.values().filter {
            it.title.contains(searchQuery, true) ||
            it.emoji.contains(searchQuery)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    if (isSearching) {
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            placeholder = {
                                Text("جستجو در تنظیمات...", fontSize = 13.sp, color = Color.White.copy(alpha = 0.7f))
                            },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true,
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedTextColor = Color.White,
                                unfocusedTextColor = Color.White,
                                cursorColor = Color.White,
                                focusedBorderColor = Color.Transparent,
                                unfocusedBorderColor = Color.Transparent
                            )
                        )
                    } else {
                        Text(
                            "⚙️ تنظیمات",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 17.sp
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
                        if (isSearching) {
                            isSearching = false
                            searchQuery = ""
                        } else {
                            onBack()
                        }
                    }) {
                        Icon(
                            if (isSearching) Icons.Filled.Clear
                            else Icons.AutoMirrored.Filled.ArrowBack,
                            "Back",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    if (!isSearching) {
                        IconButton(onClick = { isSearching = true }) {
                            Icon(Icons.Filled.Search, "Search", tint = Color.White)
                        }
                        IconButton(onClick = { saveAllSettings() }) {
                            Icon(Icons.Filled.Check, "Save", tint = Color.White)
                        }
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
            // ==================== هدر پیشرفته ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(listOf(PrimaryColor, SecondaryColor)))
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    // آواتار با انیمیشن
                    val infiniteTransition = rememberInfiniteTransition(label = "avatar")
                    val rotation by infiniteTransition.animateFloat(
                        initialValue = 0f,
                        targetValue = 360f,
                        animationSpec = infiniteRepeatable(
                            animation = tween(20000, easing = LinearEasing),
                            repeatMode = RepeatMode.Restart
                        ),
                        label = "rotation"
                    )
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .background(
                                Brush.linearGradient(
                                    listOf(Color.White.copy(alpha = 0.3f), Color.White.copy(alpha = 0.1f))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("⚙️", fontSize = 32.sp, modifier = Modifier.rotate(rotation))
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "تنظیمات فوق پیشرفته",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "کنترل کامل بر روی تجربه یادگیری",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                        Spacer(Modifier.height(6.dp))
                        Row {
                            ChipsmallInfo("🎨 ${selectedTheme}")
                            Spacer(Modifier.width(6.dp))
                            ChipsmallInfo(if (darkModeEnabled) "🌙 شب" else "☀️ روز")
                        }
                    }
                }
            }

            // ==================== کارت آماری با انیمیشن ====================
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
                    VerticalDivider()
                    MiniStat("🔥", "$dailyStreak", "روز پیوسته")
                    VerticalDivider()
                    MiniStat("⭐", "$totalStars", "امتیاز")
                }
            }

            Spacer(Modifier.offset(y = (-12).dp))

            // ==================== بدون نتیجه ====================
            if (visibleSections.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("🔍", fontSize = 48.sp)
                        Spacer(Modifier.height(12.dp))
                        Text("تنظیمی یافت نشد", fontSize = 14.sp, color = Color.Gray)
                    }
                }
            }

            // ============================================================
            // 🔑 حساب کاربری
            // ============================================================
            if (visibleSections.contains(SettingsSection.ACCOUNT)) {
                CollapsibleSection(
                    section = SettingsSection.ACCOUNT,
                    expanded = expandedSections[SettingsSection.ACCOUNT.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.ACCOUNT.key] = it }
                ) {
                    // پروفایل کاربری
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
                                        .size(56.dp)
                                        .clip(CircleShape)
                                        .background(
                                            Brush.linearGradient(listOf(PrimaryColor, SecondaryColor))
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        user?.name?.firstOrNull()?.uppercase() ?: "U",
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                }
                                Spacer(Modifier.width(14.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        user?.name ?: "کاربر مهمان",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        user?.email ?: "بدون ایمیل",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                    Spacer(Modifier.height(4.dp))
                                    Row {
                                        Badge(
                                            text = when (user?.level) {
                                                "BEGINNER" -> "🌱 مبتدی"
                                                "INTERMEDIATE" -> "🚀 متوسط"
                                                "ADVANCED" -> "🏆 پیشرفته"
                                                else -> "🌱 مبتدی"
                                            },
                                            color = PrimaryColor
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(6.dp))

                    SettingsRow(
                        emoji = "🗝️",
                        title = "کلید API Groq",
                        subtitle = if (user?.apiKey.isNullOrBlank()) "وارد نشده — برای فعال‌سازی AI بزن ⚠️" else "وارد شده ✅",
                        onClick = onNavigateToApiKey,
                        badge = if (user?.apiKey.isNullOrBlank()) "نیاز" else null
                    )

                    SettingsRow(
                        emoji = "👤",
                        title = "ویرایش پروفایل",
                        subtitle = "نام، ایمیل و اطلاعات شخصی",
                        onClick = { }
                    )

                    SettingsRow(
                        emoji = "🔒",
                        title = "تغییر رمز عبور",
                        subtitle = "امنیت حساب کاربری",
                        onClick = { }
                    )
                }
            }

            // ============================================================
            // 🎨 ظاهر و تم
            // ============================================================
            if (visibleSections.contains(SettingsSection.APPEARANCE)) {
                CollapsibleSection(
                    section = SettingsSection.APPEARANCE,
                    expanded = expandedSections[SettingsSection.APPEARANCE.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.APPEARANCE.key] = it }
                ) {
                    SettingsToggle(
                        emoji = "🌙",
                        title = "حالت شب",
                        subtitle = "کاهش فشار چشم در نور کم",
                        checked = darkModeEnabled,
                        onCheckedChange = { darkModeEnabled = it }
                    )

                    SettingsToggle(
                        emoji = "✨",
                        title = "انیمیشن‌ها",
                        subtitle = "افکت‌های حرکتی در اپلیکیشن",
                        checked = animationsEnabled,
                        onCheckedChange = { animationsEnabled = it }
                    )

                    SettingsToggle(
                        emoji = "🔘",
                        title = "گوشه‌های گرد",
                        subtitle = "کارت‌ها با گوشه‌های نرم",
                        checked = roundedCorners,
                        onCheckedChange = { roundedCorners = it }
                    )

                    // تم رنگی
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp)
                            .clickable { showThemeDialog = true },
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
                                Text("🎨", fontSize = 20.sp)
                            }
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    "تم رنگی",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryColor
                                )
                                Text(
                                    "رنگ اصلی اپلیکیشن را انتخاب کن",
                                    fontSize = 11.sp,
                                    color = Color.Gray
                                )
                            }
                            Row {
                                ThemeColorDot(PrimaryColor, selectedTheme == "blue")
                                Spacer(Modifier.width(4.dp))
                                ThemeColorDot(Color(0xFF8E24AA), selectedTheme == "purple")
                                Spacer(Modifier.width(4.dp))
                                ThemeColorDot(Color(0xFF00897B), selectedTheme == "teal")
                                Spacer(Modifier.width(4.dp))
                                ThemeColorDot(Color(0xFFF57C00), selectedTheme == "orange")
                            }
                        }
                    }

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
                                    Text(
                                        "اندازه فونت",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "اندازه متن در کل اپلیکیشن",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
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
                                valueRange = 0.8f..1.5f,
                                steps = 6,
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
                                Text("خیلی بزرگ", fontSize = 10.sp, color = Color.Gray)
                            }
                        }
                    }

                    // زبان اپلیکیشن
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(42.dp)
                                        .clip(CircleShape)
                                        .background(PrimaryColor.copy(alpha = 0.1f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("🌐", fontSize = 20.sp)
                                }
                                Spacer(Modifier.width(12.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        "زبان اپلیکیشن",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "زبان نمایش متن‌ها",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                }
                            }
                            Spacer(Modifier.height(10.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf(
                                    "فارسی" to "🇮🇷",
                                    "English" to "🇬🇧",
                                    "العربية" to "🇸🇦"
                                ).forEach { (lang, flag) ->
                                    FilterChip(
                                        selected = selectedLanguage == lang,
                                        onClick = { selectedLanguage = lang },
                                        label = {
                                            Text(
                                                "$flag $lang",
                                                fontSize = 11.sp,
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
                }
            }

            // ============================================================
            // 🎙️ صدا و تلفظ
            // ============================================================
            if (visibleSections.contains(SettingsSection.VOICE)) {
                CollapsibleSection(
                    section = SettingsSection.VOICE,
                    expanded = expandedSections[SettingsSection.VOICE.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.VOICE.key] = it }
                ) {
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
                                    Text(
                                        "سرعت پخش صوت",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "سرعت خواندن متن‌ها",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(PrimaryColor.copy(alpha = 0.1f))
                                        .padding(horizontal = 10.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        String.format("%.2f", voiceSpeed) + "x",
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
                                Text("🚀 سریع", fontSize = 10.sp, color = Color.Gray)
                            }

                            Spacer(Modifier.height(10.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf(
                                    0.5f to "0.5x", 0.75f to "0.75x",
                                    1.0f to "1.0x", 1.25f to "1.25x",
                                    1.5f to "1.5x", 2.0f to "2.0x"
                                ).forEach { (speed, label) ->
                                    FilterChip(
                                        selected = voiceSpeed == speed,
                                        onClick = { voiceSpeed = speed },
                                        label = {
                                            Text(label, fontSize = 10.sp, fontWeight = FontWeight.Bold)
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
                                    Text(
                                        "زیر و بمی صدا",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "تنظیم صدای گوینده",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(PrimaryColor.copy(alpha = 0.1f))
                                        .padding(horizontal = 10.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        String.format("%.1f", voicePitch),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                }
                            }

                            Spacer(Modifier.height(12.dp))

                            Slider(
                                value = voicePitch,
                                onValueChange = { voicePitch = it },
                                valueRange = 0.5f..1.5f,
                                steps = 10,
                                colors = SliderDefaults.colors(
                                    thumbColor = PrimaryColor,
                                    activeTrackColor = PrimaryColor
                                )
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("🔉 بم", fontSize = 10.sp, color = Color.Gray)
                                Text("🎵 معمولی", fontSize = 10.sp, color = Color.Gray)
                                Text("🔊 زیر", fontSize = 10.sp, color = Color.Gray)
                            }
                        }
                    }

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
                            Text(
                                "👤 جنسیت صدا",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Spacer(Modifier.height(10.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                listOf(
                                    "female" to "👩 زن",
                                    "male" to "👨 مرد"
                                ).forEach { (gender, label) ->
                                    FilterChip(
                                        selected = voiceGender == gender,
                                        onClick = { voiceGender = gender },
                                        label = {
                                            Text(label, fontSize = 12.sp, fontWeight = FontWeight.Bold)
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
                            Text(
                                "🌍 لهجه",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Spacer(Modifier.height(10.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                listOf(
                                    "US" to "🇺🇸 آمریکایی",
                                    "UK" to "🇬🇧 بریتانیایی"
                                ).forEach { (accent, label) ->
                                    FilterChip(
                                        selected = voiceAccent == accent,
                                        onClick = { voiceAccent = accent },
                                        label = {
                                            Text(label, fontSize = 11.sp, fontWeight = FontWeight.Bold)
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

                    // حالت تکرار
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                "🔁 حالت تکرار پخش",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Spacer(Modifier.height(10.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf(
                                    "off" to "⏹️ خاموش",
                                    "once" to "🔂 یکبار",
                                    "twice" to "🔁 دوبار",
                                    "loop" to "♾️ حلقه"
                                ).forEach { (mode, label) ->
                                    FilterChip(
                                        selected = repeatMode == mode,
                                        onClick = { repeatMode = mode },
                                        label = {
                                            Text(label, fontSize = 10.sp, fontWeight = FontWeight.Bold)
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

                    SettingsToggle(
                        emoji = "▶️",
                        title = "پخش خودکار",
                        subtitle = "پخش خودکار صدا هنگام باز کردن درس",
                        checked = autoPlayAudio,
                        onCheckedChange = { autoPlayAudio = it }
                    )

                    SettingsToggle(
                        emoji = "🔊",
                        title = "جلوه‌های صوتی",
                        subtitle = "صدای کلیک و اعلان‌ها",
                        checked = soundEffects,
                        onCheckedChange = { soundEffects = it }
                    )
                }
            }

            // ============================================================
            // 🔔 اعلان‌ها
            // ============================================================
            if (visibleSections.contains(SettingsSection.NOTIFICATIONS)) {
                CollapsibleSection(
                    section = SettingsSection.NOTIFICATIONS,
                    expanded = expandedSections[SettingsSection.NOTIFICATIONS.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.NOTIFICATIONS.key] = it }
                ) {
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
                                Text(
                                    "زمان اعلان روزانه",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryColor
                                )
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

                    // روزهای هفته
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(42.dp)
                                        .clip(CircleShape)
                                        .background(PrimaryColor.copy(alpha = 0.1f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("📅", fontSize = 20.sp)
                                }
                                Spacer(Modifier.width(12.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        "روزهای اعلان",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "${notificationDays.size} روز انتخاب شده",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                }
                            }
                            Spacer(Modifier.height(10.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                val dayLabels = listOf("ش", "ی", "د", "س", "چ", "پ", "ج")
                                dayLabels.forEachIndexed { index, day ->
                                    val selected = notificationDays.contains(index)
                                    FilterChip(
                                        selected = selected,
                                        onClick = {
                                            if (selected) notificationDays.remove(index)
                                            else notificationDays.add(index)
                                        },
                                        label = {
                                            Text(day, fontSize = 11.sp, fontWeight = FontWeight.Bold)
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

                    SettingsToggle(
                        emoji = "🔔",
                        title = "صدای اعلان",
                        subtitle = "پخش صدا هنگام اعلان",
                        checked = notificationSound,
                        onCheckedChange = { notificationSound = it }
                    )

                    SettingsToggle(
                        emoji = "📳",
                        title = "لرزش",
                        subtitle = "لرزش گوشی هنگام اعلان",
                        checked = notificationVibrate,
                        onCheckedChange = { notificationVibrate = it }
                    )

                    SettingsRow(
                        emoji = "🧪",
                        title = "تست اعلان",
                        subtitle = "یک اعلان نمونه نمایش بده",
                        onClick = { NotificationHelper.showDailyReminder(context) },
                        badge = "تجربه"
                    )
                }
            }

            // ============================================================
            // 📖 یادگیری
            // ============================================================
            if (visibleSections.contains(SettingsSection.LEARNING)) {
                CollapsibleSection(
                    section = SettingsSection.LEARNING,
                    expanded = expandedSections[SettingsSection.LEARNING.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.LEARNING.key] = it }
                ) {
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
                                    Text(
                                        "هدف روزانه",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "چند دقیقه در روز تمرین کنی؟",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
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
                                listOf(5, 10, 15, 20, 30, 60).forEach { minutes ->
                                    FilterChip(
                                        selected = dailyGoal == minutes,
                                        onClick = { dailyGoal = minutes },
                                        label = {
                                            Text("$minutes", fontSize = 11.sp, fontWeight = FontWeight.Bold)
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

                    // سطح دشواری
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                "📊 سطح دشواری پیش‌فرض",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Spacer(Modifier.height(10.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf(
                                    "مبتدی" to "🌱",
                                    "متوسط" to "🚀",
                                    "پیشرفته" to "🏆"
                                ).forEach { (level, emoji) ->
                                    FilterChip(
                                        selected = difficultyLevel == level,
                                        onClick = { difficultyLevel = level },
                                        label = {
                                            Text(
                                                "$emoji $level",
                                                fontSize = 11.sp,
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

                    SettingsToggle(
                        emoji = "🇮🇷",
                        title = "نمایش ترجمه",
                        subtitle = "نمایش ترجمه فارسی کنار متن انگلیسی",
                        checked = showTranslation,
                        onCheckedChange = { showTranslation = it }
                    )

                    SettingsToggle(
                        emoji = "🔤",
                        title = "نمایش تلفظ",
                        subtitle = "نمایش تلفظ فونتیک کنار کلمات",
                        checked = showPronunciation,
                        onCheckedChange = { showPronunciation = it }
                    )

                    SettingsToggle(
                        emoji = "💬",
                        title = "نمایش مثال",
                        subtitle = "نمایش جمله مثال برای لغات",
                        checked = showExamples,
                        onCheckedChange = { showExamples = it }
                    )

                    SettingsToggle(
                        emoji = "⏭️",
                        title = "فصل خودکار بعدی",
                        subtitle = "پس از اتمام، فصل بعدی باز شود",
                        checked = autoNextChapter,
                        onCheckedChange = { autoNextChapter = it }
                    )
                }
            }

            // ============================================================
            // 🤖 هوش مصنوعی
            // ============================================================
            if (visibleSections.contains(SettingsSection.AI)) {
                CollapsibleSection(
                    section = SettingsSection.AI,
                    expanded = expandedSections[SettingsSection.AI.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.AI.key] = it }
                ) {
                    // مدل AI
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(42.dp)
                                        .clip(CircleShape)
                                        .background(PrimaryColor.copy(alpha = 0.1f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("🤖", fontSize = 20.sp)
                                }
                                Spacer(Modifier.width(12.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        "مدل هوش مصنوعی",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "مدل Groq برای پاسخ‌دهی",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                }
                            }
                            Spacer(Modifier.height(10.dp))
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                listOf(
                                    "llama-3.3-70b" to "🦙 Llama 3.3 70B (پیشرفته)",
                                    "llama-3.1-8b" to "⚡ Llama 3.1 8B (سریع)",
                                    "mixtral-8x7b" to "🎯 Mixtral 8x7B (متوسط)",
                                    "gemma2-9b" to "💎 Gemma 2 9B (سبک)"
                                ).forEach { (model, label) ->
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { aiModel = model }
                                            .padding(vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        RadioButton(
                                            selected = aiModel == model,
                                            onClick = { aiModel = model },
                                            colors = RadioButtonDefaults.colors(selectedColor = PrimaryColor)
                                        )
                                        Spacer(Modifier.width(6.dp))
                                        Text(label, fontSize = 12.sp, color = Color(0xFF1A1A2E))
                                    }
                                }
                            }
                        }
                    }

                    // دمای پاسخ (خلاقیت)
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
                                    Text("🌡️", fontSize = 20.sp)
                                }
                                Spacer(Modifier.width(12.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        "خلاقیت پاسخ",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        when {
                                            aiTemperature < 0.4f -> "🎯 دقیق و محافظه‌کار"
                                            aiTemperature < 0.8f -> "⚖️ متعادل"
                                            else -> "🎨 خلاق و متنوع"
                                        },
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(PrimaryColor.copy(alpha = 0.1f))
                                        .padding(horizontal = 10.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        String.format("%.1f", aiTemperature),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                }
                            }

                            Spacer(Modifier.height(12.dp))

                            Slider(
                                value = aiTemperature,
                                onValueChange = { aiTemperature = it },
                                valueRange = 0f..1.5f,
                                steps = 14,
                                colors = SliderDefaults.colors(
                                    thumbColor = PrimaryColor,
                                    activeTrackColor = PrimaryColor
                                )
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("🎯 دقیق", fontSize = 10.sp, color = Color.Gray)
                                Text("⚖️ متعادل", fontSize = 10.sp, color = Color.Gray)
                                Text("🎨 خلاق", fontSize = 10.sp, color = Color.Gray)
                            }
                        }
                    }

                    // زبان پاسخ AI
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                "💬 زبان پاسخ AI",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Spacer(Modifier.height(10.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf(
                                    "فارسی" to "🇮🇷",
                                    "English" to "🇬🇧",
                                    "دوزبانه" to "🌐"
                                ).forEach { (lang, flag) ->
                                    FilterChip(
                                        selected = aiResponseLang == lang,
                                        onClick = { aiResponseLang = lang },
                                        label = {
                                            Text(
                                                "$flag $lang",
                                                fontSize = 11.sp,
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

                    SettingsRow(
                        emoji = "🗝️",
                        title = "کلید API Groq",
                        subtitle = "برای استفاده از AI، کلید وارد کن",
                        onClick = onNavigateToApiKey,
                        badge = if (user?.apiKey.isNullOrBlank()) "نیاز" else "فعال"
                    )
                }
            }

            // ============================================================
            // 📊 مدیریت داده‌ها
            // ============================================================
            if (visibleSections.contains(SettingsSection.DATA)) {
                CollapsibleSection(
                    section = SettingsSection.DATA,
                    expanded = expandedSections[SettingsSection.DATA.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.DATA.key] = it }
                ) {
                    SettingsRow(
                        emoji = "📤",
                        title = "خروجی گرفتن داده‌ها",
                        subtitle = "ذخیره پیشرفت در فایل",
                        onClick = { showExportDialog = true }
                    )

                    SettingsRow(
                        emoji = "📥",
                        title = "بازیابی داده‌ها",
                        subtitle = "بازیابی از فایل پشتیبان",
                        onClick = { }
                    )

                    SettingsRow(
                        emoji = "💬",
                        title = "پاک کردن تاریخچه چت",
                        subtitle = "حذف تمام مکالمات با AI",
                        onClick = { showClearChatDialog = true }
                    )

                    SettingsRow(
                        emoji = "🗑️",
                        title = "پاک کردن پیشرفت",
                        subtitle = "حذف تمام امتیازات و درس‌ها",
                        onClick = { showResetDialog = true },
                        danger = true
                    )
                }
            }

            // ============================================================
            // ℹ️ درباره
            // ============================================================
            if (visibleSections.contains(SettingsSection.ABOUT)) {
                CollapsibleSection(
                    section = SettingsSection.ABOUT,
                    expanded = expandedSections[SettingsSection.ABOUT.key] ?: true,
                    onToggle = { expandedSections[SettingsSection.ABOUT.key] = it }
                ) {
                    SettingsRow(
                        emoji = "📄",
                        title = "درباره اپلیکیشن",
                        subtitle = "نسخه ۱.۰.۰ — ZabanYar AI",
                        onClick = { showAboutDialog = true }
                    )

                    SettingsRow(
                        emoji = "⭐",
                        title = "امتیاز به اپلیکیشن",
                        subtitle = "در کافه‌بازار / مایکت",
                        onClick = { }
                    )

                    SettingsRow(
                        emoji = "📧",
                        title = "تماس با ما",
                        subtitle = "support@zabanyar.ai",
                        onClick = {
                            try {
                                uriHandler.openUri("mailto:support@zabanyar.ai")
                            } catch (_: Exception) { }
                        }
                    )

                    SettingsRow(
                        emoji = "🔄",
                        title = "بررسی به‌روزرسانی",
                        subtitle = "آخرین نسخه را چک کن",
                        onClick = { }
                    )

                    SettingsRow(
                        emoji = "📜",
                        title = "قوانین و مقررات",
                        subtitle = "شرایط استفاده از سرویس",
                        onClick = { }
                    )
                }
            }

            Spacer(Modifier.height(24.dp))

            // ==================== دکمه ذخیره بزرگ ====================
            Button(
                onClick = { saveAllSettings() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(56.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
            ) {
                Icon(Icons.Filled.Check, null, modifier = Modifier.size(22.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    "ذخیره تمام تنظیمات",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }

            // پیام ذخیره موفق
            AnimatedVisibility(
                visible = savedMessage,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("✅", fontSize = 20.sp)
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                "تنظیمات با موفقیت ذخیره شد!",
                                fontSize = 13.sp,
                                color = Color(0xFF2E7D32),
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                "تغییرات به‌طور خودکار اعمال می‌شوند",
                                fontSize = 10.sp,
                                color = Color(0xFF2E7D32).copy(alpha = 0.8f)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(30.dp))
        }
    }

    // ============================================================
    // دیالوگ‌ها
    // ============================================================

    // Time Picker
    if (showTimePicker) {
        AlertDialog(
            onDismissRequest = { showTimePicker = false },
            title = {
                Text("🕐 زمان اعلان", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            },
            text = {
                Column {
                    Text("ساعتی که می‌خواهی اعلان بگیری:", fontSize = 13.sp)
                    Spacer(Modifier.height(16.dp))
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        listOf(
                            6 to "🌅 ۶ صبح",
                            8 to "☀️ ۸ صبح",
                            10 to "🌤️ ۱۰ صبح",
                            12 to "🌞 ۱۲ ظهر",
                            15 to "🌇 ۳ عصر",
                            18 to "🌆 ۶ عصر",
                            20 to "🌃 ۸ شب",
                            22 to "🌙 ۱۰ شب"
                        ).forEach { (hour, label) ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        notificationHour = hour
                                        notificationMinute = 0
                                    }
                                    .padding(vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = notificationHour == hour,
                                    onClick = {
                                        notificationHour = hour
                                        notificationMinute = 0
                                    },
                                    colors = RadioButtonDefaults.colors(selectedColor = PrimaryColor)
                                )
                                Spacer(Modifier.width(6.dp))
                                Text(label, fontSize = 13.sp)
                            }
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

    // Reset Dialog
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
                Column {
                    Text(
                        "آیا مطمئنی می‌خواهی تمام پیشرفتت پاک بشه؟",
                        fontSize = 13.sp,
                        lineHeight = 20.sp
                    )
                    Spacer(Modifier.height(10.dp))
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text("🚨 مواردی که پاک می‌شن:", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            Spacer(Modifier.height(4.dp))
                            Text("• تمام امتیازات و ستاره‌ها", fontSize = 11.sp)
                            Text("• درس‌های تکمیل‌شده", fontSize = 11.sp)
                            Text("• روزهای پیوسته (Streak)", fontSize = 11.sp)
                            Text("• تمام تنظیمات شخصی", fontSize = 11.sp)
                        }
                    }
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "این عمل قابل بازگشت نیست!",
                        fontSize = 12.sp,
                        color = Color(0xFFC62828),
                        fontWeight = FontWeight.Bold
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        ProgressManager.resetAllProgress(context)
                        AdvancedSettings.clearAll(context)
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

    // Clear Chat Dialog
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

    // Export Dialog
    if (showExportDialog) {
        AlertDialog(
            onDismissRequest = { showExportDialog = false },
            title = {
                Text("📤 خروجی داده‌ها", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            },
            text = {
                Text(
                    "داده‌های پیشرفتت به‌صورت فایل ذخیره می‌شه.\n\nمی‌تونی بعداً از همون فایل بازیابی کنی.",
                    fontSize = 13.sp,
                    lineHeight = 20.sp
                )
            },
            confirmButton = {
                Button(
                    onClick = { showExportDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
                ) {
                    Text("ذخیره", color = Color.White, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { showExportDialog = false }) {
                    Text("انصراف", color = PrimaryColor)
                }
            }
        )
    }

    // Theme Picker Dialog
    if (showThemeDialog) {
        AlertDialog(
            onDismissRequest = { showThemeDialog = false },
            title = {
                Text("🎨 انتخاب تم رنگی", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf(
                        "blue" to ("🔵 آبی" to Color(0xFF1976D2)),
                        "purple" to ("🟣 بنفش" to Color(0xFF8E24AA)),
                        "teal" to ("🟢 سبز آبی" to Color(0xFF00897B)),
                        "orange" to ("🟠 نارنجی" to Color(0xFFF57C00)),
                        "red" to ("🔴 قرمز" to Color(0xFFC62828)),
                        "green" to ("🟩 سبز" to Color(0xFF388E3C))
                    ).forEach { (key, data) ->
                        val (label, color) = data
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    selectedTheme = key
                                    showThemeDialog = false
                                }
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(32.dp)
                                    .clip(CircleShape)
                                    .background(color)
                            )
                            Spacer(Modifier.width(12.dp))
                            Text(label, fontSize = 14.sp, color = Color(0xFF1A1A2E))
                            Spacer(Modifier.weight(1f))
                            if (selectedTheme == key) {
                                Icon(
                                    Icons.Filled.Check,
                                    null,
                                    tint = PrimaryColor,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                }
            },
            confirmButton = {
                Button(
                    onClick = { showThemeDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
                ) {
                    Text("بستن", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }
        )
    }

    // About Dialog
    if (showAboutDialog) {
        AlertDialog(
            onDismissRequest = { showAboutDialog = false },
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("🎓", fontSize = 28.sp)
                    Spacer(Modifier.width(8.dp))
                    Column {
                        Text(
                            "زبان‌یار AI",
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp,
                            color = PrimaryColor
                        )
                        Text("نسخه ۱.۰.۰", fontSize = 11.sp, color = Color.Gray)
                    }
                }
            },
            text = {
                Column {
                    Text(
                        "دستیار هوشمند یادگیری زبان انگلیسی",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
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
                    Text(
                        "✨ امکانات:",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
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
                        Text(
                            feature,
                            fontSize = 12.sp,
                            color = Color(0xFF424242),
                            lineHeight = 20.sp
                        )
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

// ============================================================
// Composables کمکی
// ============================================================

@Composable
private fun CollapsibleSection(
    section: SettingsSection,
    expanded: Boolean,
    onToggle: (Boolean) -> Unit,
    content: @Composable () -> Unit
) {
    Column {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onToggle(!expanded) }
                .padding(horizontal = 20.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(PrimaryColor.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Text(section.emoji, fontSize = 16.sp)
            }
            Spacer(Modifier.width(10.dp))
            Text(
                section.title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor,
                modifier = Modifier.weight(1f)
            )
            Icon(
                if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                null,
                tint = PrimaryColor,
                modifier = Modifier.size(20.dp)
            )
        }

        // Content with animation
        AnimatedVisibility(
            visible = expanded,
            enter = expandVertically() + fadeIn(),
            exit = shrinkVertically() + fadeOut()
        ) {
            Column(
                modifier = Modifier.padding(bottom = 12.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                content()
            }
        }
    }
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
                Text(
                    title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor
                )
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
    danger: Boolean = false,
    badge: String? = null
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
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (danger) Color(0xFFC62828) else PrimaryColor
                    )
                    if (badge != null) {
                        Spacer(Modifier.width(6.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(
                                    if (badge == "نیاز") Color(0xFFFFC107)
                                    else PrimaryColor.copy(alpha = 0.15f)
                                )
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                badge,
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (badge == "نیاز") Color.Black else PrimaryColor
                            )
                        }
                    }
                }
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
        Text(
            value,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = PrimaryColor
        )
        Text(label, fontSize = 10.sp, color = Color.Gray)
    }
}

@Composable
private fun VerticalDivider() {
    Divider(
        modifier = Modifier
            .height(40.dp)
            .width(1.dp),
        color = Color.LightGray.copy(alpha = 0.5f)
    )
}

@Composable
private fun ChipsmallInfo(text: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White.copy(alpha = 0.25f))
            .padding(horizontal = 8.dp, vertical = 3.dp)
    ) {
        Text(
            text,
            fontSize = 10.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
private fun ThemeColorDot(color: Color, selected: Boolean) {
    Box(
        modifier = Modifier
            .size(if (selected) 22.dp else 18.dp)
            .clip(CircleShape)
            .background(color)
    )
}

@Composable
private fun Badge(text: String, color: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(color.copy(alpha = 0.15f))
            .padding(horizontal = 8.dp, vertical = 3.dp)
    ) {
        Text(
            text,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            color = color
        )
    }
}