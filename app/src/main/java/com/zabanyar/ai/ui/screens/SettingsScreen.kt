package com.zabanyar.ai.ui.screens

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.UserManager

// ═══════════════════════════════════════════════════════
//  ذخیره‌سازی محلی
// ═══════════════════════════════════════════════════════
private const val PREFS_SETTINGS = "zabanyar_settings"
private const val KEY_TTS_SPEED = "tts_speed"
private const val KEY_FONT_SIZE = "font_size"
private const val KEY_VOICE_GENDER = "voice_gender"
private const val KEY_VIBRATION = "vibration"
private const val KEY_AUTO_SAVE = "auto_save"
private const val KEY_SHOW_PRONUNCIATION = "show_pronunciation"
private const val KEY_LANGUAGE = "app_language"

private fun prefs(context: Context) =
    context.getSharedPreferences(PREFS_SETTINGS, Context.MODE_PRIVATE)

private fun getTtsSpeed(context: Context): Float =
    prefs(context).getFloat(KEY_TTS_SPEED, 1.0f)
private fun setTtsSpeed(context: Context, v: Float) =
    prefs(context).edit().putFloat(KEY_TTS_SPEED, v).apply()

private fun getFontSize(context: Context): String =
    prefs(context).getString(KEY_FONT_SIZE, "medium") ?: "medium"
private fun setFontSize(context: Context, v: String) =
    prefs(context).edit().putString(KEY_FONT_SIZE, v).apply()

private fun getVoiceGender(context: Context): String =
    prefs(context).getString(KEY_VOICE_GENDER, "female") ?: "female"
private fun setVoiceGender(context: Context, v: String) =
    prefs(context).edit().putString(KEY_VOICE_GENDER, v).apply()

private fun getVibration(context: Context): Boolean =
    prefs(context).getBoolean(KEY_VIBRATION, true)
private fun setVibration(context: Context, v: Boolean) =
    prefs(context).edit().putBoolean(KEY_VIBRATION, v).apply()

private fun getAutoSave(context: Context): Boolean =
    prefs(context).getBoolean(KEY_AUTO_SAVE, true)
private fun setAutoSave(context: Context, v: Boolean) =
    prefs(context).edit().putBoolean(KEY_AUTO_SAVE, v).apply()

private fun getShowPronunciation(context: Context): Boolean =
    prefs(context).getBoolean(KEY_SHOW_PRONUNCIATION, true)
private fun setShowPronunciation(context: Context, v: Boolean) =
    prefs(context).edit().putBoolean(KEY_SHOW_PRONUNCIATION, v).apply()

private fun getAppLanguage(context: Context): String =
    prefs(context).getString(KEY_LANGUAGE, "fa") ?: "fa"
private fun setAppLanguage(context: Context, v: String) =
    prefs(context).edit().putString(KEY_LANGUAGE, v).apply()

// ═══════════════════════════════════════════════════════
//  صفحه اصلی تنظیمات
// ═══════════════════════════════════════════════════════
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onBack: () -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val context = LocalContext.current

    var showTranslation by remember { mutableStateOf(ProgressManager.isShowTranslation(context)) }
    var isDarkMode by remember { mutableStateOf(ProgressManager.isDarkMode(context)) }
    var isSoundEnabled by remember { mutableStateOf(ProgressManager.isSoundEnabled(context)) }
    var isAutoPlay by remember { mutableStateOf(ProgressManager.isAutoPlay(context)) }
    var isNotificationsEnabled by remember { mutableStateOf(ProgressManager.isNotificationsEnabled(context)) }

    var ttsSpeed by remember { mutableStateOf(getTtsSpeed(context)) }
    var fontSize by remember { mutableStateOf(getFontSize(context)) }
    var voiceGender by remember { mutableStateOf(getVoiceGender(context)) }
    var vibration by remember { mutableStateOf(getVibration(context)) }
    var autoSave by remember { mutableStateOf(getAutoSave(context)) }
    var showPronunciation by remember { mutableStateOf(getShowPronunciation(context)) }
    var appLanguage by remember { mutableStateOf(getAppLanguage(context)) }

    var showResetDialog by remember { mutableStateOf(false) }
    var showLogoutDialog by remember { mutableStateOf(false) }
    val currentUser = remember { UserManager.getLoggedInUser(context) }
    var itemIndex = 0

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "تنظیمات",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 18.sp
                    )
                },
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
                .background(Color(0xFFF8F9FC))
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {

            // ═══════════════
            //  👤 حساب کاربری
            // ═══════════════
            SectionHeader("👤 حساب کاربری")

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(1.dp),
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
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(PrimaryColor.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.Person,
                            null,
                            tint = PrimaryColor,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            currentUser?.name ?: "کاربر مهمان",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Spacer(Modifier.height(2.dp))
                        Text(
                            currentUser?.email ?: "وارد نشده",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            // ═══════════════
            //  📖 یادگیری
            // ═══════════════
            SectionHeader("📖 تنظیمات یادگیری")

            NumberedCard {
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "نمایش ترجمه",
                    subtitle = "نمایش معنی فارسی کلمات و جملات",
                    checked = showTranslation,
                    onCheckedChange = {
                        showTranslation = it
                        ProgressManager.setShowTranslation(context, it)
                    }
                )
                ItemDivider()
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "نمایش تلفظ",
                    subtitle = "نمایش فونتیک کلمات جدید",
                    checked = showPronunciation,
                    onCheckedChange = {
                        showPronunciation = it
                        setShowPronunciation(context, it)
                    }
                )
                ItemDivider()
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "یادگیری هوشمند",
                    subtitle = "نمایش خودکار درس بعدی",
                    checked = isAutoPlay,
                    onCheckedChange = {
                        isAutoPlay = it
                        ProgressManager.setAutoPlay(context, it)
                    }
                )
                ItemDivider()
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "ذخیره خودکار",
                    subtitle = "ذخیره پیشرفت هنگام مطالعه",
                    checked = autoSave,
                    onCheckedChange = {
                        autoSave = it
                        setAutoSave(context, it)
                    }
                )
            }

            // ═══════════════
            //  🔊 صدا
            // ═══════════════
            SectionHeader("🔊 صدا و گویش")

            NumberedCard {
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "جلوه‌های صوتی",
                    subtitle = "پخش صدا هنگام تعامل با اپ",
                    checked = isSoundEnabled,
                    onCheckedChange = {
                        isSoundEnabled = it
                        ProgressManager.setSoundEnabled(context, it)
                    }
                )
                ItemDivider()
                NumberedChoiceItem(
                    index = ++itemIndex,
                    title = "سرعت پخش",
                    subtitle = "سرعت خواندن متن‌ها",
                    options = listOf(
                        ChoiceOption("آهسته", "slow"),
                        ChoiceOption("معمولی", "normal"),
                        ChoiceOption("سریع", "fast")
                    ),
                    selectedValue = when {
                        ttsSpeed < 0.9f -> "slow"
                        ttsSpeed > 1.1f -> "fast"
                        else -> "normal"
                    },
                    onSelected = { value ->
                        val speed = when (value) {
                            "slow" -> 0.75f
                            "fast" -> 1.3f
                            else -> 1.0f
                        }
                        ttsSpeed = speed
                        setTtsSpeed(context, speed)
                    }
                )
                ItemDivider()
                NumberedChoiceItem(
                    index = ++itemIndex,
                    title = "جنسیت گوینده",
                    subtitle = "انتخاب صدای زن یا مرد",
                    options = listOf(
                        ChoiceOption("زن", "female"),
                        ChoiceOption("مرد", "male")
                    ),
                    selectedValue = voiceGender,
                    onSelected = {
                        voiceGender = it
                        setVoiceGender(context, it)
                    }
                )
            }

            // ═══════════════
            //  🎨 ظاهر
            // ═══════════════
            SectionHeader("🎨 ظاهر و نمایش")

            NumberedCard {
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "حالت شب",
                    subtitle = "رنگ‌بندی تیره",
                    checked = isDarkMode,
                    onCheckedChange = {
                        isDarkMode = it
                        ProgressManager.setDarkMode(context, it)
                    }
                )
                ItemDivider()
                NumberedChoiceItem(
                    index = ++itemIndex,
                    title = "اندازه فونت",
                    subtitle = "اندازه متن درس‌ها",
                    options = listOf(
                        ChoiceOption("کوچک", "small"),
                        ChoiceOption("متوسط", "medium"),
                        ChoiceOption("بزرگ", "large")
                    ),
                    selectedValue = fontSize,
                    onSelected = {
                        fontSize = it
                        setFontSize(context, it)
                    }
                )
                ItemDivider()
                NumberedChoiceItem(
                    index = ++itemIndex,
                    title = "زبان اپلیکیشن",
                    subtitle = "زبان رابط کاربری",
                    options = listOf(
                        ChoiceOption("فارسی", "fa"),
                        ChoiceOption("English", "en")
                    ),
                    selectedValue = appLanguage,
                    onSelected = {
                        appLanguage = it
                        setAppLanguage(context, it)
                    }
                )
            }

            // ═══════════════
            //  🔔 اعلان‌ها
            // ═══════════════
            SectionHeader("🔔 اعلان‌ها و لرزش")

            NumberedCard {
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "یادآوری روزانه",
                    subtitle = "اعلان مطالعه هر روز",
                    checked = isNotificationsEnabled,
                    onCheckedChange = {
                        isNotificationsEnabled = it
                        ProgressManager.setNotificationsEnabled(context, it)
                    }
                )
                ItemDivider()
                NumberedToggleItem(
                    index = ++itemIndex,
                    title = "لرزش",
                    subtitle = "لرزش هنگام پاسخ",
                    checked = vibration,
                    onCheckedChange = {
                        vibration = it
                        setVibration(context, it)
                    }
                )
            }

            // ═══════════════
            //  🗑️ مدیریت داده‌ها
            // ═══════════════
            SectionHeader("🗑️ مدیریت داده‌ها")

            NumberedCard {
                NumberedActionItem(
                    index = ++itemIndex,
                    title = "ریست پیشرفت",
                    subtitle = "پاک کردن تمام آمار و تاریخچه",
                    titleColor = Color(0xFFC62828),
                    onClick = { showResetDialog = true }
                )
                ItemDivider()
                NumberedActionItem(
                    index = ++itemIndex,
                    title = "پاک کردن حافظه کش",
                    subtitle = "آزادسازی فضای ذخیره‌سازی",
                    titleColor = Color(0xFFFF6F00),
                    onClick = { /* TODO */ }
                )
            }

            // ═══════════════
            //  ℹ️ اطلاعات
            // ═══════════════
            SectionHeader("ℹ️ اطلاعات")

            NumberedCard {
                NumberedActionItem(
                    index = ++itemIndex,
                    title = "درباره زبان‌یار AI",
                    subtitle = "نسخه ۱.۰.۰",
                    titleColor = PrimaryColor,
                    onClick = { /* TODO */ }
                )
                ItemDivider()
                NumberedActionItem(
                    index = ++itemIndex,
                    title = "امتیازدهی به اپ",
                    subtitle = "حمایت از ما",
                    titleColor = Color(0xFFFF9800),
                    onClick = { /* TODO */ }
                )
                ItemDivider()
                NumberedActionItem(
                    index = ++itemIndex,
                    title = "اشتراک‌گذاری",
                    subtitle = "دعوت از دوستان",
                    titleColor = Color(0xFF11998E),
                    onClick = {
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/plain"
                            putExtra(Intent.EXTRA_TEXT, "زبان‌یار AI رو نصب کن! 🚀")
                        }
                        context.startActivity(Intent.createChooser(intent, "اشتراک‌گذاری"))
                    }
                )
                ItemDivider()
                NumberedActionItem(
                    index = ++itemIndex,
                    title = "تماس با ما",
                    subtitle = "نظرات و پیشنهادات",
                    titleColor = Color(0xFF0288D1),
                    onClick = { /* TODO */ }
                )
            }

            // ═══════════════
            //  🚪 خروج از حساب
            // ═══════════════
            if (currentUser != null) {
                Spacer(Modifier.height(20.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .clickable { showLogoutDialog = true },
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(1.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFFEBEE))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.AutoMirrored.Filled.Logout,
                            null,
                            tint = Color(0xFFC62828),
                            modifier = Modifier.size(22.dp)
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "خروج از حساب کاربری",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFC62828)
                        )
                    }
                }
            }

            Spacer(Modifier.height(32.dp))
        }
    }

    // ─── دیالوگ ریست ───
    if (showResetDialog) {
        AlertDialog(
            onDismissRequest = { showResetDialog = false },
            icon = { Icon(Icons.Filled.Warning, null, tint = Color(0xFFC62828)) },
            title = { Text("ریست پیشرفت؟", fontWeight = FontWeight.Bold) },
            text = { Text("تمام آمار، ستاره‌ها و تاریخچه پاک می‌شود. این عملیات قابل بازگشت نیست.") },
            confirmButton = {
                TextButton(onClick = { showResetDialog = false }) {
                    Text("بله، پاک کن", color = Color(0xFFC62828), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetDialog = false }) {
                    Text("انصراف", color = Color.Gray)
                }
            }
        )
    }

    // ─── دیالوگ خروج ───
    if (showLogoutDialog) {
        AlertDialog(
            onDismissRequest = { showLogoutDialog = false },
            icon = { Icon(Icons.AutoMirrored.Filled.Logout, null, tint = Color(0xFFC62828)) },
            title = { Text("خروج از حساب؟", fontWeight = FontWeight.Bold) },
            text = { Text("آیا مطمئنی می‌خواهی از حساب کاربری خارج شوی؟") },
            confirmButton = {
                TextButton(onClick = {
                    showLogoutDialog = false
                    UserManager.logout(context)
                    onLogout()
                }) {
                    Text("بله، خروج", color = Color(0xFFC62828), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showLogoutDialog = false }) {
                    Text("انصراف", color = Color.Gray)
                }
            }
        )
    }
}

// ═══════════════════════════════════════════════════════
//  کامپوننت‌های کمکی
// ═══════════════════════════════════════════════════════

@Composable
fun SectionHeader(title: String) {
    Text(
        title,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = PrimaryColor,
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 10.dp)
    )
}

@Composable
fun NumberedCard(content: @Composable ColumnScope.() -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(1.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.fillMaxWidth(), content = content)
    }
}

@Composable
fun ItemDivider() {
    Divider(
        modifier = Modifier.padding(start = 60.dp),
        color = Color(0xFFEEEEEE),
        thickness = 1.dp
    )
}

@Composable
fun NumberedToggleItem(
    index: Int,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(34.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(PrimaryColor.copy(alpha = 0.1f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "$index",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )
        }

        Spacer(Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )
            Spacer(Modifier.height(2.dp))
            Text(
                subtitle,
                fontSize = 11.sp,
                color = Color.Gray,
                lineHeight = 15.sp
            )
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

data class ChoiceOption(val label: String, val value: String)

@Composable
fun NumberedChoiceItem(
    index: Int,
    title: String,
    subtitle: String,
    options: List<ChoiceOption>,
    selectedValue: String,
    onSelected: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 14.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(PrimaryColor.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "$index",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor
                )
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    subtitle,
                    fontSize = 11.sp,
                    color = Color.Gray,
                    lineHeight = 15.sp
                )
            }
        }

        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 46.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            options.forEach { opt ->
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(10.dp))
                        .background(
                            if (selectedValue == opt.value) PrimaryColor
                            else Color(0xFFF0F0F0)
                        )
                        .clickable { onSelected(opt.value) }
                        .padding(vertical = 10.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        opt.label,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (selectedValue == opt.value) Color.White else Color.Gray,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
fun NumberedActionItem(
    index: Int,
    title: String,
    subtitle: String,
    titleColor: Color,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(34.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(titleColor.copy(alpha = 0.1f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "$index",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = titleColor
            )
        }

        Spacer(Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = titleColor
            )
            Spacer(Modifier.height(2.dp))
            Text(
                subtitle,
                fontSize = 11.sp,
                color = Color.Gray,
                lineHeight = 15.sp
            )
        }

        Icon(
            Icons.Filled.ChevronLeft,
            null,
            tint = Color.Gray,
            modifier = Modifier.size(20.dp)
        )
    }
}