package com.zabanyar.ai.ui.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ═══════════════════════════════════════════════════════
//  ذخیره‌سازی تنظیمات خواندن
// ═══════════════════════════════════════════════════════
private const val PREFS_READING = "zabanyar_reading"
private const val KEY_FONT_SIZE = "reading_font_size"       // 14, 16, 18, 20, 22, 24
private const val KEY_FONT_FAMILY = "reading_font_family"   // "sans", "serif", "mono"
private const val KEY_LINE_HEIGHT = "reading_line_height"   // 1.4, 1.6, 1.8, 2.0
private const val KEY_BG_THEME = "reading_bg_theme"         // "white", "sepia", "dark", "black"
private const val KEY_SHOW_TRANSLATION = "reading_show_translation"

private fun prefs(context: Context) =
    context.getSharedPreferences(PREFS_READING, Context.MODE_PRIVATE)

object ReadingSettings {
    fun getFontSize(context: Context): Float =
        prefs(context).getFloat(KEY_FONT_SIZE, 18f)

    fun setFontSize(context: Context, v: Float) =
        prefs(context).edit().putFloat(KEY_FONT_SIZE, v).apply()

    fun getFontFamily(context: Context): String =
        prefs(context).getString(KEY_FONT_FAMILY, "sans") ?: "sans"

    fun setFontFamily(context: Context, v: String) =
        prefs(context).edit().putString(KEY_FONT_FAMILY, v).apply()

    fun getLineHeight(context: Context): Float =
        prefs(context).getFloat(KEY_LINE_HEIGHT, 1.6f)

    fun setLineHeight(context: Context, v: Float) =
        prefs(context).edit().putFloat(KEY_LINE_HEIGHT, v).apply()

    fun getBgTheme(context: Context): String =
        prefs(context).getString(KEY_BG_THEME, "white") ?: "white"

    fun setBgTheme(context: Context, v: String) =
        prefs(context).edit().putString(KEY_BG_THEME, v).apply()

    fun getShowTranslation(context: Context): Boolean =
        prefs(context).getBoolean(KEY_SHOW_TRANSLATION, true)

    fun setShowTranslation(context: Context, v: Boolean) =
        prefs(context).edit().putBoolean(KEY_SHOW_TRANSLATION, v).apply()

    /** تبدیل نام فونت به FontFamily */
    fun toFontFamily(name: String): FontFamily = when (name) {
        "serif" -> FontFamily.Serif
        "mono" -> FontFamily.Monospace
        else -> FontFamily.SansSerif
    }

    /** رنگ پس‌زمینه بر اساس تم */
    fun bgColor(theme: String): Color = when (theme) {
        "sepia" -> Color(0xFFF4ECD8)
        "dark" -> Color(0xFF1E1E1E)
        "black" -> Color(0xFF000000)
        else -> Color(0xFFFFFFFF)
    }

    /** رنگ متن بر اساس تم */
    fun textColor(theme: String): Color = when (theme) {
        "dark", "black" -> Color(0xFFE0E0E0)
        else -> Color(0xFF1A1A1A)
    }
}

// ═══════════════════════════════════════════════════════
//  پنل تنظیمات خواندن (Bottom Sheet)
// ═══════════════════════════════════════════════════════
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingSettingsPanel(
    onDismiss: () -> Unit,
    onSettingsChanged: () -> Unit = {}
) {
    val context = LocalContext.current
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    var fontSize by remember { mutableStateOf(ReadingSettings.getFontSize(context)) }
    var fontFamily by remember { mutableStateOf(ReadingSettings.getFontFamily(context)) }
    var lineHeight by remember { mutableStateOf(ReadingSettings.getLineHeight(context)) }
    var bgTheme by remember { mutableStateOf(ReadingSettings.getBgTheme(context)) }
    var showTranslation by remember { mutableStateOf(ReadingSettings.getShowTranslation(context)) }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        containerColor = Color.White,
        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            // ─── عنوان ───
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Filled.Settings,
                    null,
                    tint = Color(0xFF1A237E),
                    modifier = Modifier.size(24.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    "تنظیمات خواندن",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
            }

            Spacer(Modifier.height(20.dp))

            // ═══════════════════════════════════════════
            //  ۱. اندازه فونت
            // ═══════════════════════════════════════════
            SettingRow(
                icon = Icons.Filled.FormatSize,
                title = "اندازه فونت",
                value = "${fontSize.toInt()}"
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = {
                        if (fontSize > 12f) {
                            fontSize -= 2f
                            ReadingSettings.setFontSize(context, fontSize)
                            onSettingsChanged()
                        }
                    },
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF0F0F0))
                ) {
                    Icon(Icons.Filled.Remove, "کوچک‌تر", tint = Color(0xFF1A237E))
                }

                Text(
                    "نمونه متن",
                    fontSize = fontSize.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF1A237E)
                )

                IconButton(
                    onClick = {
                        if (fontSize < 28f) {
                            fontSize += 2f
                            ReadingSettings.setFontSize(context, fontSize)
                            onSettingsChanged()
                        }
                    },
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF0F0F0))
                ) {
                    Icon(Icons.Filled.Add, "بزرگ‌تر", tint = Color(0xFF1A237E))
                }
            }

            Divider(Modifier.padding(vertical = 12.dp))

            // ═══════════════════════════════════════════
            //  ۲. نوع فونت
            // ═══════════════════════════════════════════
            SettingRow(
                icon = Icons.Filled.TextFields,
                title = "نوع فونت",
                value = when (fontFamily) {
                    "serif" -> "کلاسیک"
                    "mono" -> "مونو"
                    else -> "ساده"
                }
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FontChip(
                    label = "Aa ساده",
                    font = FontFamily.SansSerif,
                    isSelected = fontFamily == "sans",
                    onClick = {
                        fontFamily = "sans"
                        ReadingSettings.setFontFamily(context, "sans")
                        onSettingsChanged()
                    },
                    modifier = Modifier.weight(1f)
                )
                FontChip(
                    label = "Aa کلاسیک",
                    font = FontFamily.Serif,
                    isSelected = fontFamily == "serif",
                    onClick = {
                        fontFamily = "serif"
                        ReadingSettings.setFontFamily(context, "serif")
                        onSettingsChanged()
                    },
                    modifier = Modifier.weight(1f)
                )
                FontChip(
                    label = "Aa مونو",
                    font = FontFamily.Monospace,
                    isSelected = fontFamily == "mono",
                    onClick = {
                        fontFamily = "mono"
                        ReadingSettings.setFontFamily(context, "mono")
                        onSettingsChanged()
                    },
                    modifier = Modifier.weight(1f)
                )
            }

            Divider(Modifier.padding(vertical = 12.dp))

            // ═══════════════════════════════════════════
            //  ۳. فاصله خطوط
            // ═══════════════════════════════════════════
            SettingRow(
                icon = Icons.Filled.FormatLineSpacing,
                title = "فاصله خطوط",
                value = when (lineHeight) {
                    1.4f -> "کم"
                    1.6f -> "معمولی"
                    1.8f -> "زیاد"
                    else -> "خیلی زیاد"
                }
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                listOf(1.4f to "کم", 1.6f to "معمولی", 1.8f to "زیاد", 2.0f to "خیلی زیاد").forEach { (h, label) ->
                    ChoiceChipSmall(
                        label = label,
                        isSelected = lineHeight == h,
                        onClick = {
                            lineHeight = h
                            ReadingSettings.setLineHeight(context, h)
                            onSettingsChanged()
                        },
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            Divider(Modifier.padding(vertical = 12.dp))

            // ═══════════════════════════════════════════
            //  ۴. پس‌زمینه
            // ═══════════════════════════════════════════
            SettingRow(
                icon = Icons.Filled.Palette,
                title = "پس‌زمینه",
                value = when (bgTheme) {
                    "sepia" -> "کرم"
                    "dark" -> "تیره"
                    "black" -> "مشکی"
                    else -> "سفید"
                }
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                BgChip(
                    label = "سفید",
                    bgColor = Color.White,
                    borderColor = Color(0xFFE0E0E0),
                    isSelected = bgTheme == "white",
                    onClick = {
                        bgTheme = "white"
                        ReadingSettings.setBgTheme(context, "white")
                        onSettingsChanged()
                    },
                    modifier = Modifier.weight(1f)
                )
                BgChip(
                    label = "کرم",
                    bgColor = Color(0xFFF4ECD8),
                    borderColor = Color(0xFFE0D5B8),
                    isSelected = bgTheme == "sepia",
                    onClick = {
                        bgTheme = "sepia"
                        ReadingSettings.setBgTheme(context, "sepia")
                        onSettingsChanged()
                    },
                    modifier = Modifier.weight(1f)
                )
                BgChip(
                    label = "تیره",
                    bgColor = Color(0xFF1E1E1E),
                    borderColor = Color(0xFF333333),
                    textColor = Color.White,
                    isSelected = bgTheme == "dark",
                    onClick = {
                        bgTheme = "dark"
                        ReadingSettings.setBgTheme(context, "dark")
                        onSettingsChanged()
                    },
                    modifier = Modifier.weight(1f)
                )
                BgChip(
                    label = "مشکی",
                    bgColor = Color.Black,
                    borderColor = Color(0xFF333333),
                    textColor = Color.White,
                    isSelected = bgTheme == "black",
                    onClick = {
                        bgTheme = "black"
                        ReadingSettings.setBgTheme(context, "black")
                        onSettingsChanged()
                    },
                    modifier = Modifier.weight(1f)
                )
            }

            Divider(Modifier.padding(vertical = 12.dp))

            // ═══════════════════════════════════════════
            //  ۵. نمایش ترجمه
            // ═══════════════════════════════════════════
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Filled.Translate,
                    null,
                    tint = Color(0xFFE91E63),
                    modifier = Modifier.size(24.dp)
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        "نمایش ترجمه",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        "نمایش یا مخفی کردن معنی فارسی زیر هر پاراگراف",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
                Switch(
                    checked = showTranslation,
                    onCheckedChange = {
                        showTranslation = it
                        ReadingSettings.setShowTranslation(context, it)
                        onSettingsChanged()
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color(0xFF1A237E)
                    )
                )
            }

            Spacer(Modifier.height(20.dp))

            // ─── دکمه بستن ───
            Button(
                onClick = onDismiss,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
            ) {
                Icon(Icons.Filled.Check, null, tint = Color.White)
                Spacer(Modifier.width(8.dp))
                Text("تأیید", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(12.dp))
        }
    }
}

// ═══════════════════════════════════════════════════════
//  کامپوننت‌های کمکی
// ═══════════════════════════════════════════════════════

@Composable
fun SettingRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(icon, null, tint = Color(0xFF1A237E), modifier = Modifier.size(22.dp))
        Spacer(Modifier.width(10.dp))
        Text(
            title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E),
            modifier = Modifier.weight(1f)
        )
        Text(
            value,
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun FontChip(
    label: String,
    font: FontFamily,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(48.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(
                if (isSelected) Color(0xFF1A237E)
                else Color(0xFFF0F0F0)
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            label,
            fontFamily = font,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = if (isSelected) Color.White else Color.Gray
        )
    }
}

@Composable
fun ChoiceChipSmall(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(40.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(
                if (isSelected) Color(0xFF1A237E)
                else Color(0xFFF0F0F0)
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            label,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            color = if (isSelected) Color.White else Color.Gray
        )
    }
}

@Composable
fun BgChip(
    label: String,
    bgColor: Color,
    borderColor: Color,
    isSelected: Boolean,
    onClick: () -> Unit,
    textColor: Color = Color(0xFF1A237E),
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(56.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(bgColor)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .matchParentSize()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Transparent)
                .then(
                    if (isSelected) Modifier.background(Color(0xFF1A237E).copy(alpha = 0.15f))
                    else Modifier
                )
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                label,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = textColor
            )
            if (isSelected) {
                Spacer(Modifier.height(2.dp))
                Icon(
                    Icons.Filled.Check,
                    null,
                    tint = if (bgColor == Color.Black || bgColor == Color(0xFF1E1E1E)) Color.White else Color(0xFF1A237E),
                    modifier = Modifier.size(14.dp)
                )
            }
        }
    }
}