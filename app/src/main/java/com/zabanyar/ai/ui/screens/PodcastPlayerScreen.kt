package com.zabanyar.ai.ui.screens

import android.net.Uri
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
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackParameters
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.zabanyar.ai.data.Podcast
import com.zabanyar.ai.data.PodcastCache
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastPlayerScreen(
    podcast: Podcast,
    transcript: List<String>,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val listState = rememberLazyListState()

    // ─── ساخت ExoPlayer با کش آفلاین ───
    val exoPlayer = remember {
        ExoPlayer.Builder(context)
            .setMediaSourceFactory(PodcastCache.mediaSourceFactory(context))
            .build()
            .apply {
                val audioUrl = "https://github.com/Aboulfazll/ZabanYar-AI/releases/download/v1.0-podcasts/${podcast.id}.mp3"
                setMediaItem(MediaItem.fromUri(Uri.parse(audioUrl)))
                prepare()
            }
    }

    // ─── حالت‌ها ───
    var isPlaying by remember { mutableStateOf(false) }
    var currentLineIndex by remember { mutableIntStateOf(-1) }
    var skipSeconds by remember { mutableIntStateOf(10) }
    var playbackSpeed by remember { mutableFloatStateOf(1.0f) }
    var showSettingsPopup by remember { mutableStateOf(false) }
    var isMuted by remember { mutableStateOf(false) }
    var currentSeconds by remember { mutableIntStateOf(0) }
    var totalSeconds by remember { mutableIntStateOf(60) }

    // ─── گوش دادن به وضعیت پلیر ───
    DisposableEffect(exoPlayer) {
        val listener = object : Player.Listener {
            override fun onIsPlayingChanged(playing: Boolean) {
                isPlaying = playing
            }
        }
        exoPlayer.addListener(listener)
        onDispose {
            exoPlayer.removeListener(listener)
            exoPlayer.release()
        }
    }

    // ─── به‌روزرسانی زمان و خط فعال ───
    LaunchedEffect(Unit) {
        while (true) {
            currentSeconds = (exoPlayer.currentPosition / 1000).toInt()
            val dur = (exoPlayer.duration / 1000).toInt()
            if (dur > 0) totalSeconds = dur

            if (transcript.isNotEmpty() && totalSeconds > 0) {
                val line = ((currentSeconds.toFloat() / totalSeconds) * transcript.size)
                    .toInt().coerceIn(0, transcript.size - 1)
                if (line != currentLineIndex) {
                    currentLineIndex = line
                    try {
                        listState.animateScrollToItem(line)
                    } catch (_: Exception) {}
                }
            }
            delay(300)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "پلیر پادکست",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 16.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        exoPlayer.pause()
                        onBack()
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF2E4A9E))
            )
        },
        containerColor = Color(0xFFF0F4F8)
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

                // ═══════════════════════════════════
                //  کارت هدر پادکست
                // ═══════════════════════════════════
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(3.dp)
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Box(
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(
                                        Brush.linearGradient(
                                            listOf(
                                                Color(podcast.gradientStart),
                                                Color(podcast.gradientEnd)
                                            )
                                        )
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(podcast.levelEmoji, fontSize = 24.sp)
                                    Text(podcast.categoryEmoji, fontSize = 14.sp)
                                }
                            }

                            Spacer(Modifier.width(12.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    podcast.title,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF1A237E),
                                    maxLines = 2
                                )
                                Spacer(Modifier.height(2.dp))
                                Text(
                                    podcast.titlePersian,
                                    fontSize = 12.sp,
                                    color = Color.Gray,
                                    maxLines = 1
                                )
                                Spacer(Modifier.height(6.dp))

                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        Icons.Filled.Star, null,
                                        tint = Color(0xFFFF9800),
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(Modifier.width(3.dp))
                                    Text(
                                        "4.0",
                                        fontSize = 11.sp,
                                        color = Color(0xFFFF9800),
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(Modifier.width(10.dp))
                                    Text(
                                        "• ${podcast.duration}",
                                        fontSize = 11.sp,
                                        color = Color.Gray
                                    )
                                }
                            }
                        }

                        Spacer(Modifier.height(12.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Filled.Person, null,
                                tint = Color(0xFF3949AB),
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                "گوینده: ZabanYar AI",
                                fontSize = 11.sp,
                                color = Color(0xFF3949AB),
                                fontWeight = FontWeight.Medium
                            )
                            Spacer(Modifier.weight(1f))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color(0xFFF0F0F0))
                                    .padding(horizontal = 8.dp, vertical = 3.dp)
                            ) {
                                Text(
                                    podcast.level,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )
                            }
                        }
                    }
                }

                // ═══════════════════════════════════
                //  Transcript
                // ═══════════════════════════════════
                LazyColumn(
                    state = listState,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    contentPadding = PaddingValues(vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    itemsIndexed(transcript) { index, line ->
                        val isActive = index == currentLineIndex
                        val isPast = index < currentLineIndex

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(
                                    when {
                                        isActive -> Color(0xFFFFE0B2)
                                        isPast -> Color(0xFFF5F5F5)
                                        else -> Color(0xFFF8F9FA)
                                    }
                                )
                                .clickable {
                                    if (transcript.isNotEmpty() && totalSeconds > 0) {
                                        val seekTo = ((index.toFloat() / transcript.size) * totalSeconds * 1000).toLong()
                                        exoPlayer.seekTo(seekTo)
                                        currentLineIndex = index
                                        exoPlayer.play()
                                    }
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

                // ═══════════════════════════════════
                //  نوار پخش
                // ═══════════════════════════════════
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {

                        Waveform(
                            progress = if (totalSeconds > 0)
                                currentSeconds.toFloat() / totalSeconds else 0f
                        )

                        Spacer(Modifier.height(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                formatTime(currentSeconds),
                                fontSize = 11.sp,
                                color = Color(0xFF00695C),
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                formatTime(totalSeconds),
                                fontSize = 11.sp,
                                color = Color.Gray
                            )
                        }

                        Spacer(Modifier.height(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Volume
                            IconButton(
                                onClick = {
                                    isMuted = !isMuted
                                    exoPlayer.volume = if (isMuted) 0f else 1f
                                },
                                modifier = Modifier.size(44.dp)
                            ) {
                                Icon(
                                    if (isMuted) Icons.Filled.VolumeOff else Icons.Filled.VolumeUp,
                                    "صدا",
                                    tint = Color(0xFF455A64),
                                    modifier = Modifier.size(22.dp)
                                )
                            }

                            // Rewind
                            IconButton(
                                onClick = {
                                    val newPos = (exoPlayer.currentPosition - skipSeconds * 1000L)
                                        .coerceAtLeast(0)
                                    exoPlayer.seekTo(newPos)
                                },
                                modifier = Modifier.size(44.dp)
                            ) {
                                Icon(
                                    Icons.Filled.Replay, "عقب",
                                    tint = Color(0xFF455A64),
                                    modifier = Modifier.size(26.dp)
                                )
                            }

                            // Play/Pause
                            Box(
                                modifier = Modifier
                                    .size(64.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF00695C))
                                    .clickable {
                                        if (exoPlayer.isPlaying) exoPlayer.pause()
                                        else exoPlayer.play()
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = if (isPlaying) Icons.Filled.Pause
                                    else Icons.Filled.PlayArrow,
                                    contentDescription = "پخش",
                                    tint = Color.White,
                                    modifier = Modifier.size(34.dp)
                                )
                            }

                            // Forward
                            IconButton(
                                onClick = {
                                    val newPos = (exoPlayer.currentPosition + skipSeconds * 1000L)
                                        .coerceAtMost(exoPlayer.duration)
                                    exoPlayer.seekTo(newPos)
                                },
                                modifier = Modifier.size(44.dp)
                            ) {
                                Icon(
                                    Icons.Filled.Forward, "جلو",
                                    tint = Color(0xFF455A64),
                                    modifier = Modifier.size(26.dp)
                                )
                            }

                            // Settings
                            IconButton(
                                onClick = { showSettingsPopup = true },
                                modifier = Modifier.size(44.dp)
                            ) {
                                Icon(
                                    Icons.Filled.Settings, "تنظیمات",
                                    tint = Color(0xFF455A64),
                                    modifier = Modifier.size(22.dp)
                                )
                            }
                        }
                    }
                }
            }

            // ═══════════════════════════════════
            //  پاپ‌آپ تنظیمات
            // ═══════════════════════════════════
            if (showSettingsPopup) {
                PlayerSettingsPopup(
                    currentSkip = skipSeconds,
                    currentSpeed = playbackSpeed,
                    onSkipSelected = { skipSeconds = it },
                    onSpeedSelected = {
                        playbackSpeed = it
                        exoPlayer.playbackParameters = PlaybackParameters(it)
                    },
                    onDismiss = { showSettingsPopup = false }
                )
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  Waveform
// ═══════════════════════════════════════════════════════
@Composable
private fun Waveform(progress: Float) {
    val bars = remember { List(48) { (0.3f + (0..100).random() / 130f).coerceAtMost(1f) } }

    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
    ) {
        val barWidth = 3.dp.toPx()
        val gap = (size.width - barWidth * bars.size) / (bars.size - 1).coerceAtLeast(1)
        val centerY = size.height / 2

        bars.forEachIndexed { i, h ->
            val x = i * (barWidth + gap)
            val barHeight = size.height * h
            val color = if (i.toFloat() / bars.size <= progress)
                Color(0xFF00695C)
            else Color(0xFFCFD8DC)

            drawRoundRect(
                color = color,
                topLeft = Offset(x, centerY - barHeight / 2),
                size = Size(barWidth, barHeight),
                cornerRadius = CornerRadius(barWidth / 2)
            )
        }
    }
}

// ═══════════════════════════════════════════════════════
//  پاپ‌آپ تنظیمات
// ═══════════════════════════════════════════════════════
@Composable
private fun PlayerSettingsPopup(
    currentSkip: Int,
    currentSpeed: Float,
    onSkipSelected: (Int) -> Unit,
    onSpeedSelected: (Float) -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = Color.White,
        shape = RoundedCornerShape(20.dp),
        title = null,
        text = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        "Skip",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF37474F),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(10.dp))

                    listOf(5, 10, 20, 30).forEach { sec ->
                        val selected = currentSkip == sec
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(
                                    if (selected) Color(0xFF00695C)
                                    else Color(0xFFF5F5F5)
                                )
                                .clickable { onSkipSelected(sec) }
                                .padding(vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "${sec}S",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (selected) Color.White else Color(0xFF37474F)
                            )
                        }
                    }
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        "Speed",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF37474F),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(10.dp))

                    listOf(0.75f, 1.0f, 1.25f, 1.5f, 2.0f).forEach { sp ->
                        val selected = playbackEquals(currentSpeed, sp)
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(
                                    if (selected) Color(0xFF00695C)
                                    else Color(0xFFF5F5F5)
                                )
                                .clickable { onSpeedSelected(sp) }
                                .padding(vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "${sp}x",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (selected) Color.White else Color(0xFF37474F)
                            )
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

// ═══════════════════════════════════════════════════════
//  Helper
// ═══════════════════════════════════════════════════════
private fun playbackEquals(a: Float, b: Float) = kotlin.math.abs(a - b) < 0.01f

private fun formatTime(seconds: Int): String {
    val m = seconds / 60
    val s = seconds % 60
    return String.format("%02d:%02d", m, s)
}