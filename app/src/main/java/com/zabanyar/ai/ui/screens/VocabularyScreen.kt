package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.SpeechHelper

data class VocabItem(
    val english: String,
    val persian: String,
    val pronunciation: String,
    val level: String,
    val emoji: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VocabularyScreen(
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.shutdown() }
    }

    var searchQuery by remember { mutableStateOf("") }
    var selectedLevel by remember { mutableStateOf("همه") }

    val allWords = remember {
        listOf(
            VocabItem("Teacher", "معلم", "ˈtiːtʃər", "مبتدی", "👨‍🏫"),
            VocabItem("Student", "دانش‌آموز", "ˈstuːdənt", "مبتدی", "👨‍🎓"),
            VocabItem("Doctor", "دکتر", "ˈdɑːktər", "مبتدی", "👨‍⚕️"),
            VocabItem("Nurse", "پرستار", "nɜːrs", "مبتدی", "👩‍⚕️"),
            VocabItem("Engineer", "مهندس", "ˌendʒɪˈnɪr", "مبتدی", "👷"),
            VocabItem("Architect", "معمار", "ˈɑːrkɪtekt", "مبتدی", "🏛️"),
            VocabItem("Actor", "بازیگر", "ˈæktər", "مبتدی", "🎭"),
            VocabItem("Singer", "خواننده", "ˈsɪŋər", "مبتدی", "🎤"),
            VocabItem("Chef", "سرآشپز", "ʃef", "مبتدی", "👨‍🍳"),
            VocabItem("Pilot", "خلبان", "ˈpaɪlət", "مبتدی", "✈️"),
            VocabItem("Achieve", "دست یافتن", "əˈtʃiːv", "متوسط", "🎯"),
            VocabItem("Consider", "در نظر گرفتن", "kənˈsɪdər", "متوسط", "🤔"),
            VocabItem("Determine", "تعیین کردن", "dɪˈtɜːrmɪn", "متوسط", "📌"),
            VocabItem("Establish", "تأسیس کردن", "ɪˈstæblɪʃ", "متوسط", "🏗️"),
            VocabItem("Generate", "تولید کردن", "ˈdʒenəreɪt", "متوسط", "⚡"),
            VocabItem("Analyze", "تحلیل کردن", "ˈænəlaɪz", "پیشرفته", "📊"),
            VocabItem("Comprehensive", "جامع", "ˌkɑːmprɪˈhensɪv", "پیشرفته", "📚"),
            VocabItem("Significant", "قابل توجه", "sɪɡˈnɪfɪkənt", "پیشرفته", "💡"),
            VocabItem("Sophisticated", "پیچیده", "səˈfɪstɪkeɪtɪd", "پیشرفته", "🎩"),
            VocabItem("Perspective", "چشم‌انداز", "pərˈspektɪv", "پیشرفته", "🔭")
        )
    }

    val levels = listOf("همه", "مبتدی", "متوسط", "پیشرفته")

    val filteredWords = allWords.filter { word ->
        val matchesSearch = searchQuery.isEmpty() ||
                word.english.contains(searchQuery, true) ||
                word.persian.contains(searchQuery)
        val matchesLevel = selectedLevel == "همه" || word.level == selectedLevel
        matchesSearch && matchesLevel
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "📚 بانک واژگان",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        Text(
                            "${allWords.size} لغت آموزشی",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
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
        ) {
            // نوار جستجو
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    placeholder = { Text("جستجوی لغت...", fontSize = 13.sp) },
                    leadingIcon = {
                        Icon(Icons.Filled.Search, null, tint = PrimaryColor)
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(Icons.Filled.Clear, "Clear", tint = Color.Gray)
                            }
                        }
                    },
                    singleLine = true,
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = PrimaryColor,
                        unfocusedBorderColor = Color.Transparent
                    )
                )
            }

            // فیلتر سطح
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                levels.forEach { level ->
                    FilterChip(
                        selected = selectedLevel == level,
                        onClick = { selectedLevel = level },
                        label = {
                            Text(
                                level,
                                fontSize = 11.sp,
                                fontWeight = if (selectedLevel == level) FontWeight.Bold
                                else FontWeight.Normal
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = PrimaryColor,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            Text(
                "${filteredWords.size} لغت یافت شد",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(Modifier.height(8.dp))

            // لیست لغات
            if (filteredWords.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("🔍", fontSize = 64.sp)
                        Spacer(Modifier.height(12.dp))
                        Text("لغتی یافت نشد", fontSize = 14.sp, color = Color.Gray)
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(filteredWords) { word ->
                        VocabCard(
                            word = word,
                            onClick = { speechHelper.speak(word.english) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun VocabCard(word: VocabItem, onClick: () -> Unit) {
    val levelColor = when (word.level) {
        "مبتدی" -> Color(0xFF43A047)
        "متوسط" -> Color(0xFFFF9800)
        "پیشرفته" -> Color(0xFFE53935)
        else -> PrimaryColor
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
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
                    .size(46.dp)
                    .clip(CircleShape)
                    .background(levelColor.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Text(word.emoji, fontSize = 22.sp)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        word.english,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color(0xFF1A237E)
                    )
                    Spacer(Modifier.width(6.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(levelColor.copy(alpha = 0.15f))
                            .padding(horizontal = 6.dp, vertical = 1.dp)
                    ) {
                        Text(
                            word.level,
                            fontSize = 9.sp,
                            color = levelColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                if (word.pronunciation.isNotEmpty()) {
                    Text(
                        "/${word.pronunciation}/",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
                Spacer(Modifier.height(3.dp))
                Text(
                    word.persian,
                    fontSize = 13.sp,
                    color = PrimaryColor,
                    fontWeight = FontWeight.SemiBold
                )
            }
            IconButton(
                onClick = onClick,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(PrimaryColor.copy(alpha = 0.12f))
            ) {
                Icon(
                    Icons.AutoMirrored.Filled.VolumeUp,
                    "Play",
                    tint = PrimaryColor,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}