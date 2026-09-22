package com.zabanyar.ai.ui.screens

import android.Manifest
import android.content.pm.PackageManager
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
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
import androidx.core.content.ContextCompat
import com.zabanyar.ai.data.SpeechHelper

data class SpeakingSentence(
    val english: String,
    val persian: String,
    val level: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpeakingScreen(
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.shutdown() }
    }

    var currentIndex by remember { mutableIntStateOf(0) }
    var isRecording by remember { mutableStateOf(false) }
    var score by remember { mutableIntStateOf(-1) }
    var hasPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.RECORD_AUDIO
            ) == PackageManager.PERMISSION_GRANTED
        )
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { granted ->
        hasPermission = granted
    }

    val sentences = remember {
        listOf(
            SpeakingSentence("Hello, how are you today?", "سلام، امروز حالت چطوره؟", "مبتدی"),
            SpeakingSentence("My name is Ali and I'm a teacher.", "اسم من علی هست و من معلمم.", "مبتدی"),
            SpeakingSentence("I wake up at seven every morning.", "هر روز صبح ساعت هفت بیدار می‌شوم.", "مبتدی"),
            SpeakingSentence("Where is the nearest train station?", "نزدیک‌ترین ایستگاه قطار کجاست؟", "متوسط"),
            SpeakingSentence("Could you please recommend a good restaurant?", "می‌تونید یه رستوران خوب پیشنهاد کنید؟", "متوسط"),
            SpeakingSentence("I would like to book a table for two.", "می‌خوام یه میز برای دو نفر رزرو کنم.", "متوسط")
        )
    }

    val current = sentences[currentIndex]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "🗣️ تمرین اسپیکینگ",
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
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // شماره جمله
            Text(
                "جمله ${currentIndex + 1} از ${sentences.size}",
                fontSize = 13.sp,
                color = Color.Gray,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(Modifier.height(8.dp))

            LinearProgressIndicator(
                progress = { (currentIndex + 1).toFloat() / sentences.size },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = PrimaryColor,
                trackColor = PrimaryColor.copy(alpha = 0.15f)
            )

            Spacer(Modifier.height(24.dp))

            // کارت جمله
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                listOf(PrimaryColor, SecondaryColor)
                            )
                        )
                        .padding(24.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(current.level, fontSize = 11.sp, color = Color.White.copy(alpha = 0.85f))
                        Spacer(Modifier.height(10.dp))
                        Text(
                            current.english,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                            lineHeight = 30.sp
                        )
                        Spacer(Modifier.height(12.dp))
                        Divider(color = Color.White.copy(alpha = 0.3f))
                        Spacer(Modifier.height(12.dp))
                        Text(
                            current.persian,
                            fontSize = 14.sp,
                            color = Color.White.copy(alpha = 0.95f),
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                            lineHeight = 22.sp
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // دکمه پخش صدا
            Button(
                onClick = { speechHelper.speak(current.english) },
                modifier = Modifier.fillMaxWidth().height(50.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = SecondaryColor)
            ) {
                Icon(Icons.AutoMirrored.Filled.VolumeUp, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(8.dp))
                Text("🔊 گوش کن", color = Color.White, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(20.dp))

            // میکروفون
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(
                        if (isRecording) Color(0xFFE53935).copy(alpha = 0.15f)
                        else PrimaryColor.copy(alpha = 0.1f)
                    )
                    .clickable {
                        if (!hasPermission) {
                            permissionLauncher.launch(Manifest.permission.RECORD_AUDIO)
                        } else {
                            isRecording = !isRecording
                            if (isRecording) {
                                score = -1
                            } else {
                                // شبیه‌سازی نمره‌دهی (بعداً با SpeechRecognizer واقعی جایگزین میشه)
                                score = (75..100).random()
                            }
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Filled.Mic,
                        contentDescription = "Record",
                        tint = if (isRecording) Color(0xFFE53935) else PrimaryColor,
                        modifier = Modifier.size(56.dp)
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        if (isRecording) "ضبط..." else "بزن و بخون",
                        fontSize = 11.sp,
                        color = if (isRecording) Color(0xFFE53935) else PrimaryColor,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (isRecording) {
                Spacer(Modifier.height(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(16.dp),
                        color = Color(0xFFE53935),
                        strokeWidth = 2.dp
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "صدای شما ضبط می‌شود...",
                        fontSize = 12.sp,
                        color = Color(0xFFE53935),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            // نمایش نمره
            if (score >= 0) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFE8F5E9)
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "🎉 عالی بود!",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF2E7D32)
                        )
                        Spacer(Modifier.height(10.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("امتیاز شما: ", fontSize = 14.sp, color = Color(0xFF424242))
                            Text(
                                "$score",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF2E7D32)
                            )
                            Text(" / ۱۰۰", fontSize = 13.sp, color = Color.Gray)
                        }
                        Spacer(Modifier.height(8.dp))
                        Row {
                            repeat(5) { i ->
                                Icon(
                                    Icons.Filled.Star,
                                    null,
                                    tint = if (i < score / 20) Color(0xFFFFC107)
                                    else Color.LightGray,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // دکمه‌های ناوبری
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                OutlinedButton(
                    onClick = {
                        if (currentIndex > 0) {
                            currentIndex--
                            score = -1
                        }
                    },
                    modifier = Modifier.weight(1f).height(50.dp),
                    shape = RoundedCornerShape(14.dp),
                    enabled = currentIndex > 0
                ) {
                    Text("← قبلی", color = PrimaryColor, fontWeight = FontWeight.Bold)
                }
                Button(
                    onClick = {
                        if (currentIndex < sentences.size - 1) {
                            currentIndex++
                            score = -1
                        }
                    },
                    modifier = Modifier.weight(1f).height(50.dp),
                    shape = RoundedCornerShape(14.dp),
                    enabled = currentIndex < sentences.size - 1,
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
                ) {
                    Text("بعدی →", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }

            Spacer(Modifier.height(20.dp))

            // راهنما
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFF3E0)
                )
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Text("💡", fontSize = 20.sp)
                    Spacer(Modifier.width(10.dp))
                    Column {
                        Text(
                            "راهنمای تمرین",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFE65100)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            "۱. اول گوش کن\n۲. بعد با صدای بلند بخون\n۳. میکروفون رو بزن و دوباره بخون\n۴. امتیازت رو ببین",
                            fontSize = 11.sp,
                            color = Color(0xFF5D4037),
                            lineHeight = 18.sp
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}