═══════════════════════════════════════════════════════════════
📦 ZABANYAR_AI — BACKUP COMPLETE
تاریخ: 1404/07/07
وضعیت: Build موفق ✅
═══════════════════════════════════════════════════════════════

# 🎯 خلاصه پروژه
ZabanYar AI — اپ یادگیری زبان
Package: com.zabanyar.ai
Min SDK: 24 | Target SDK: 34
Repo: github.com/Aboulfazll/ZabanYar-AI

═══════════════════════════════════════════════════════════════
# ✅ خلاصه تغییرات
═══════════════════════════════════════════════════════════════

## ۱۸ فایل در این سری تغییر کرد:

### 🆕 فایل‌های جدید (۸)
1. FontSizeManager.kt
2. DictionaryRepository.kt
3. WordPopupDialog.kt
4. PodcastPlayerScreen.kt
5. BookCoverImage.kt
6. assets/dictionary.json
7. PROJECT_STATUS.md (این فایل)

### 🔄 فایل‌های ویرایش‌شده (۱۰)
1. MainActivity.kt
2. AppNavHost.kt
3. LessonDetailScreen.kt
4. ReadingModeScreen.kt
5. PodcastScreen.kt
6. PodcastRepository.kt
7. SettingsScreen.kt
8. LibraryScreen.kt
9. BookDetailScreen.kt
10. SimpleStoryContent.kt
11. MainHome.kt
12. UserManager.kt

═══════════════════════════════════════════════════════════════
# 📁 فایل ۱: data/FontSizeManager.kt
═══════════════════════════════════════════════════════════════

package com.zabanyar.ai.data

import android.content.Context

object FontSizeManager {
    private const val PREFS = "zabanyar_settings"
    private const val KEY_FONT_SCALE = "font_scale"

    const val MIN_SCALE = 0.8f
    const val MAX_SCALE = 1.6f
    const val DEFAULT_SCALE = 1.0f

    fun getFontScale(context: Context): Float =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getFloat(KEY_FONT_SCALE, DEFAULT_SCALE)
            .coerceIn(MIN_SCALE, MAX_SCALE)

    fun setFontScale(context: Context, scale: Float) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putFloat(KEY_FONT_SCALE, scale.coerceIn(MIN_SCALE, MAX_SCALE))
            .apply()
    }
}

═══════════════════════════════════════════════════════════════
# 📁 فایل ۲: data/DictionaryRepository.kt
═══════════════════════════════════════════════════════════════

package com.zabanyar.ai.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

data class DictionaryEntry(
    val us: String = "",
    val uk: String = "",
    val persian: List<String> = emptyList()
)

object DictionaryRepository {

    private var cache: Map<String, DictionaryEntry>? = null

    @Synchronized
    private fun loadDictionary(context: Context): Map<String, DictionaryEntry> {
        cache?.let { return it }

        return try {
            val json = context.assets.open("dictionary.json")
                .bufferedReader()
                .use { it.readText() }

            val type = object : TypeToken<Map<String, DictionaryEntry>>() {}.type
            val map: Map<String, DictionaryEntry> = Gson().fromJson(json, type) ?: emptyMap()

            val lowercased = map.mapKeys { it.key.lowercase().trim() }
            cache = lowercased
            lowercased
        } catch (e: Exception) {
            e.printStackTrace()
            emptyMap()
        }
    }

    fun lookup(context: Context, rawWord: String): DictionaryEntry? {
        val word = cleanWord(rawWord)
        if (word.isEmpty()) return null
        return loadDictionary(context)[word]
    }

    private fun cleanWord(raw: String): String {
        return raw
            .trim()
            .lowercase()
            .trim(
                '.', ',', '!', '?', ';', ':', '"', '\'',
                '(', ')', '[', ']', '{', '}', '-', '—', '…',
                '،', '؛', '؟', '«', '»'
            )
    }
}

═══════════════════════════════════════════════════════════════
# 📁 فایل ۳: ui/screens/WordPopupDialog.kt
═══════════════════════════════════════════════════════════════

package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.zabanyar.ai.data.DictionaryEntry
import com.zabanyar.ai.data.SpeechHelper

@Composable
fun WordPopupDialog(
    word: String,
    entry: DictionaryEntry?,
    speechHelper: SpeechHelper,
    onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Card(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .background(Brush.linearGradient(listOf(Color(0xFF3949AB), Color(0xFF1A237E))))
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(word, fontSize = 22.sp, fontWeight = FontWeight.Bold,
                            color = Color.White, modifier = Modifier.weight(1f))
                        IconButton(onClick = onDismiss, modifier = Modifier.size(32.dp)) {
                            Icon(Icons.Filled.Close, "بستن", tint = Color.White, modifier = Modifier.size(20.dp))
                        }
                    }
                }

                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    if (entry == null) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("🔍", fontSize = 20.sp)
                            Spacer(Modifier.width(8.dp))
                            Text("معنی این کلمه در دیکشنری نیست", fontSize = 14.sp, color = Color.Gray)
                        }
                        Spacer(Modifier.height(8.dp))
                        Button(
                            onClick = { speechHelper.speak(word) },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
                        ) {
                            Icon(Icons.Filled.VolumeUp, null, tint = Color.White)
                            Spacer(Modifier.width(8.dp))
                            Text("پخش تلفظ", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    } else {
                        if (entry.us.isNotEmpty()) {
                            PronunciationRow("US", entry.us, Color(0xFF1976D2)) { speechHelper.speak(word) }
                            Spacer(Modifier.height(10.dp))
                        }
                        if (entry.uk.isNotEmpty()) {
                            PronunciationRow("UK", entry.uk, Color(0xFFC62828)) { speechHelper.speak(word) }
                            Spacer(Modifier.height(16.dp))
                        }
                        Divider(color = Color(0xFFEEEEEE))
                        Spacer(Modifier.height(12.dp))
                        Text("🇮🇷 معنی", fontSize = 12.sp, color = Color.Gray, fontWeight = FontWeight.Bold)
                        Spacer(Modifier.height(8.dp))
                        entry.persian.forEach { meaning ->
                            Row(modifier = Modifier.padding(vertical = 3.dp),
                                verticalAlignment = Alignment.CenterVertically) {
                                Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFF3949AB)))
                                Spacer(Modifier.width(8.dp))
                                Text(meaning, fontSize = 15.sp, color = Color(0xFF1A237E), fontWeight = FontWeight.Medium)
                            }
                        }
                    }
                    Spacer(Modifier.height(16.dp))
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("بستن", color = Color(0xFF1A237E), fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

@Composable
private fun PronunciationRow(
    label: String, phonetic: String, accentColor: Color, onPlay: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(accentColor.copy(alpha = 0.08f))
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("$label:", fontSize = 13.sp, fontWeight = FontWeight.Bold, color = accentColor,
            modifier = Modifier.width(36.dp))
        Text(phonetic, fontSize = 14.sp, color = Color(0xFF1A237E), modifier = Modifier.weight(1f))
        IconButton(
            onClick = onPlay,
            modifier = Modifier.size(32.dp).clip(CircleShape).background(accentColor.copy(alpha = 0.15f))
        ) {
            Icon(Icons.Filled.VolumeUp, "پخش", tint = accentColor, modifier = Modifier.size(16.dp))
        }
    }
}

═══════════════════════════════════════════════════════════════
# 📁 فایل ۴: ui/screens/PodcastPlayerScreen.kt
═══════════════════════════════════════════════════════════════

package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.Podcast
import com.zabanyar.ai.data.SpeechHelper
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastPlayerScreen(
    podcast: Podcast,
    transcript: List<String>,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }
    val listState = rememberLazyListState()

    var isPlaying by remember { mutableStateOf(false) }
    var currentLineIndex by remember { mutableIntStateOf(-1) }
    var skipSeconds by remember { mutableIntStateOf(10) }
    var playbackSpeed by remember { mutableFloatStateOf(1.0f) }
    var showSettingsPopup by remember { mutableStateOf(false) }
    var isMuted by remember { mutableStateOf(false) }
    var currentSeconds by remember { mutableIntStateOf(0) }
    val totalSeconds = remember(podcast) { maxOf(transcript.size * 5, 60) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.stop(); speechHelper.shutdown() }
    }

    LaunchedEffect(isPlaying) {
        if (isPlaying) {
            speechHelper.setSpeed(playbackSpeed)
            for (i in (currentLineIndex.coerceAtLeast(0)) until transcript.size) {
                if (!isPlaying) break
                currentLineIndex = i
                currentSeconds = i * 5
                listState.animateScrollToItem(i)
                speechHelper.speak(transcript[i])
                val waitTime = (transcript[i].length * 60 / playbackSpeed).toLong().coerceIn(1500, 8000)
                delay(waitTime)
            }
            if (currentLineIndex >= transcript.size - 1) {
                isPlaying = false; currentLineIndex = -1; currentSeconds = 0
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("پلیر پادکست", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 16.sp) },
                navigationIcon = {
                    IconButton(onClick = { speechHelper.stop(); onBack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF2E4A9E))
            )
        },
        containerColor = Color(0xFFF0F4F8)
    ) { padding ->
        Box(modifier = Modifier.fillMaxSize().padding(padding)) {
            Column(modifier = Modifier.fillMaxSize()) {
                Card(
                    modifier = Modifier.fillMaxWidth().padding(12.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(3.dp)
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier.size(80.dp).clip(RoundedCornerShape(14.dp))
                                    .background(Brush.linearGradient(listOf(
                                        Color(podcast.gradientStart), Color(podcast.gradientEnd)))),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(podcast.levelEmoji, fontSize = 24.sp)
                                    Text(podcast.categoryEmoji, fontSize = 14.sp)
                                }
                            }
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(podcast.title, fontSize = 15.sp, fontWeight = FontWeight.Bold,
                                    color = Color(0xFF1A237E), maxLines = 2)
                                Spacer(Modifier.height(2.dp))
                                Text(podcast.titlePersian, fontSize = 12.sp, color = Color.Gray, maxLines = 1)
                                Spacer(Modifier.height(6.dp))
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(Icons.Filled.Star, null, tint = Color(0xFFFF9800), modifier = Modifier.size(14.dp))
                                    Spacer(Modifier.width(3.dp))
                                    Text("4.0", fontSize = 11.sp, color = Color(0xFFFF9800), fontWeight = FontWeight.Bold)
                                    Spacer(Modifier.width(10.dp))
                                    Text("• ${podcast.duration}", fontSize = 11.sp, color = Color.Gray)
                                }
                            }
                        }
                        Spacer(Modifier.height(12.dp))
                        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Person, null, tint = Color(0xFF3949AB), modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(6.dp))
                            Text("گوینده: ZabanYar AI", fontSize = 11.sp, color = Color(0xFF3949AB),
                                fontWeight = FontWeight.Medium)
                            Spacer(Modifier.weight(1f))
                            Box(modifier = Modifier.clip(RoundedCornerShape(8.dp))
                                .background(Color(0xFFF0F0F0)).padding(horizontal = 8.dp, vertical = 3.dp)) {
                                Text(podcast.level, fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
                            }
                        }
                    }
                }

                LazyColumn(
                    state = listState,
                    modifier = Modifier.weight(1f).fillMaxWidth().padding(horizontal = 16.dp),
                    contentPadding = PaddingValues(vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    itemsIndexed(transcript) { index, line ->
                        val isActive = index == currentLineIndex
                        val isPast = index < currentLineIndex
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(when {
                                    isActive -> Color(0xFFFFE0B2)
                                    isPast -> Color(0xFFF5F5F5)
                                    else -> Color(0xFFF8F9FA)
                                })
                                .clickable {
                                    currentLineIndex = index; currentSeconds = index * 5
                                    speechHelper.stop(); speechHelper.setSpeed(playbackSpeed)
                                    speechHelper.speak(transcript[index])
                                }
                                .padding(12.dp)
                        ) {
                            Text(
                                text = line,
                                fontSize = if (isActive) 15.sp else 14.sp,
                                fontWeight = if (isActive) FontWeight.Bold else FontWeight.Normal,
                                color = when {
                                    isActive -> Color(0xFFBF360C)
                                    isPast -> Color(0xFF9E9E9E)
                                    else -> Color(0xFF1A237E)
                                },
                                lineHeight = 22.sp
                            )
                        }
                    }
                }

                Card(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Waveform(progress = if (totalSeconds > 0) currentSeconds.toFloat() / totalSeconds else 0f)
                        Spacer(Modifier.height(8.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(formatTime(currentSeconds), fontSize = 11.sp, color = Color(0xFF00695C), fontWeight = FontWeight.Bold)
                            Text(formatTime(totalSeconds), fontSize = 11.sp, color = Color.Gray)
                        }
                        Spacer(Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(onClick = { isMuted = !isMuted; if (isMuted) speechHelper.stop() },
                                modifier = Modifier.size(44.dp)) {
                                Icon(if (isMuted) Icons.Filled.VolumeOff else Icons.Filled.VolumeUp,
                                    "صدا", tint = Color(0xFF455A64), modifier = Modifier.size(22.dp))
                            }
                            IconButton(onClick = {
                                val ni = (currentLineIndex - 1).coerceAtLeast(0)
                                currentLineIndex = ni; currentSeconds = ni * 5
                                speechHelper.stop(); isPlaying = true
                            }, modifier = Modifier.size(44.dp)) {
                                Icon(Icons.Filled.Replay, "عقب", tint = Color(0xFF455A64), modifier = Modifier.size(26.dp))
                            }
                            Box(
                                modifier = Modifier.size(64.dp).clip(CircleShape).background(Color(0xFF00695C))
                                    .clickable {
                                        if (isPlaying) { speechHelper.stop(); isPlaying = false }
                                        else { if (currentLineIndex < 0) currentLineIndex = 0; isPlaying = true }
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                                    "پخش", tint = Color.White, modifier = Modifier.size(34.dp)
                                )
                            }
                            IconButton(onClick = {
                                val ni = (currentLineIndex + 1).coerceAtMost(transcript.size - 1)
                                currentLineIndex = ni; currentSeconds = ni * 5
                                speechHelper.stop(); isPlaying = true
                            }, modifier = Modifier.size(44.dp)) {
                                Icon(Icons.Filled.Forward, "جلو", tint = Color(0xFF455A64), modifier = Modifier.size(26.dp))
                            }
                            IconButton(onClick = { showSettingsPopup = true }, modifier = Modifier.size(44.dp)) {
                                Icon(Icons.Filled.Settings, "تنظیمات", tint = Color(0xFF455A64), modifier = Modifier.size(22.dp))
                            }
                        }
                    }
                }
            }

            if (showSettingsPopup) {
                PlayerSettingsPopup(
                    currentSkip = skipSeconds,
                    currentSpeed = playbackSpeed,
                    onSkipSelected = { skipSeconds = it },
                    onSpeedSelected = { playbackSpeed = it; speechHelper.setSpeed(it) },
                    onDismiss = { showSettingsPopup = false }
                )
            }
        }
    }
}

@Composable
private fun Waveform(progress: Float) {
    val bars = remember { List(48) { (0.3f + (0..100).random() / 130f).coerceAtMost(1f) } }
    Canvas(modifier = Modifier.fillMaxWidth().height(44.dp)) {
        val barWidth = 3.dp.toPx()
        val gap = (size.width - barWidth * bars.size) / (bars.size - 1).coerceAtLeast(1)
        val centerY = size.height / 2
        bars.forEachIndexed { i, h ->
            val x = i * (barWidth + gap)
            val barHeight = size.height * h
            val color = if (i.toFloat() / bars.size <= progress) Color(0xFF00695C) else Color(0xFFCFD8DC)
            drawRoundRect(
                color = color,
                topLeft = Offset(x, centerY - barHeight / 2),
                size = Size(barWidth, barHeight),
                cornerRadius = CornerRadius(barWidth / 2)
            )
        }
    }
}

@Composable
private fun PlayerSettingsPopup(
    currentSkip: Int, currentSpeed: Float,
    onSkipSelected: (Int) -> Unit, onSpeedSelected: (Float) -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = Color.White,
        shape = RoundedCornerShape(20.dp),
        title = null,
        text = {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Skip", fontSize = 14.sp, fontWeight = FontWeight.Bold,
                        color = Color(0xFF37474F), modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                    Spacer(Modifier.height(10.dp))
                    listOf(5, 10, 20, 30).forEach { sec ->
                        val selected = currentSkip == sec
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected) Color(0xFF00695C) else Color(0xFFF5F5F5))
                                .clickable { onSkipSelected(sec) }
                                .padding(vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("${sec}S", fontSize = 14.sp, fontWeight = FontWeight.Bold,
                                color = if (selected) Color.White else Color(0xFF37474F))
                        }
                    }
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("Speed", fontSize = 14.sp, fontWeight = FontWeight.Bold,
                        color = Color(0xFF37474F), modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                    Spacer(Modifier.height(10.dp))
                    listOf(0.75f, 1.0f, 1.25f, 1.5f, 2.0f).forEach { sp ->
                        val selected = kotlin.math.abs(currentSpeed - sp) < 0.01f
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected) Color(0xFF00695C) else Color(0xFFF5F5F5))
                                .clickable { onSpeedSelected(sp) }
                                .padding(vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("${sp}x", fontSize = 14.sp, fontWeight = FontWeight.Bold,
                                color = if (selected) Color.White else Color(0xFF37474F))
                        }
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("بستن", color = Color(0xFF00695C), fontWeight = FontWeight.Bold)
            }
        }
    )
}

private fun formatTime(seconds: Int): String {
    val m = seconds / 60
    val s = seconds % 60
    return String.format("%02d:%02d", m, s)
}

═══════════════════════════════════════════════════════════════
# 📁 فایل ۵: ui/screens/BookCoverImage.kt
═══════════════════════════════════════════════════════════════

package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.getCoverUrl

@Composable
fun BookCoverImage(
    book: Book,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop
) {
    val context = LocalContext.current
    val localResId = remember(book.id) {
        context.resources.getIdentifier(book.id, "drawable", context.packageName)
    }
    val onlineUrl = remember(book.id, book.coverUrl, book.title) { book.getCoverUrl() }

    when {
        localResId != 0 -> {
            androidx.compose.foundation.Image(
                painter = painterResource(id = localResId),
                contentDescription = book.title,
                modifier = modifier,
                contentScale = contentScale
            )
        }
        onlineUrl.isNotBlank() -> {
            AsyncImage(
                model = ImageRequest.Builder(context).data(onlineUrl).crossfade(true).build(),
                contentDescription = book.title,
                modifier = modifier,
                contentScale = contentScale
            )
        }
        else -> {
            Box(
                modifier = modifier.background(Brush.linearGradient(
                    listOf(Color(book.gradientStart), Color(book.gradientEnd)))),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = book.title,
                    color = Color.White,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}

═══════════════════════════════════════════════════════════════
# 📁 فایل ۶: data/BookCoverHelper.kt
═══════════════════════════════════════════════════════════════

package com.zabanyar.ai.data

import java.net.URLEncoder

fun Book.getCoverUrl(): String {
    if (coverUrl.isNotBlank()) {
        return coverUrl
    }
    val cleanTitle = title.replace(":", "").replace("&", "and").trim()
    val encodedTitle = URLEncoder.encode(cleanTitle, "UTF-8").replace("+", "%20")
    return "https://covers.openlibrary.org/b/title/$encodedTitle-L.jpg"
}

═══════════════════════════════════════════════════════════════
# 🚦 کارهای باقی‌مانده
═══════════════════════════════════════════════════════════════

- [ ] آپلود ۲۴ فایل MP3 در GitHub Release با tag: v1.0-podcasts
      نام‌ها: p1_greetings.mp3 تا p24_future_work.mp3
      
- [ ] بعد از آپلود MP3، پلیر را برای پخش MP3 به جای TTS تغییر بده

- [ ] گسترش dictionary.json

═══════════════════════════════════════════════════════════════
# 📝 روش ادامه در چت جدید
═══════════════════════════════════════════════════════════════

۱. این فایل را بفرست
۲. بگو: «پروژه زبان‌یار AI، ادامه بدیم»
۳. کار بعدی: آپلود MP3

═══════════════════════════════════════════════════════════════
✅ Build: موفق
🚀 توسعه ادامه دارد
═══════════════════════════════════════════════════════════════