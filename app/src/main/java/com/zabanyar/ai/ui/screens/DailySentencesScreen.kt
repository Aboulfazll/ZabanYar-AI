package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
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
import com.zabanyar.ai.data.DailySentence
import com.zabanyar.ai.data.DailySentencesRepository
import com.zabanyar.ai.data.SpeechHelper

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DailySentencesScreen(
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.shutdown() }
    }

    val allSentences = remember { DailySentencesRepository.getAllSentences() }
    val categories = remember { DailySentencesRepository.getCategories() }

    var searchQuery by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("همه") }
    var bookmarkedIds by remember { mutableStateOf(setOf<Int>()) }
    var speechSpeed by remember { mutableFloatStateOf(1.0f) }

    val filteredSentences = allSentences.filter { sentence ->
        val matchesSearch = searchQuery.isEmpty() ||
                sentence.english.contains(searchQuery, true) ||
                sentence.persian.contains(searchQuery)
        val matchesCategory = selectedCategory == "همه" || sentence.category == selectedCategory
        matchesSearch && matchesCategory
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "💬 جملات روزمره",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        Text(
                            "${allSentences.size} جمله کاربردی",
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
                    modifier = Modifier.fillMaxWidth().padding(6.dp),
                    placeholder = { Text("جستجوی جمله...", fontSize = 13.sp) },
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

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(categories) { category ->
                    FilterChip(
                        selected = selectedCategory == category,
                        onClick = { selectedCategory = category },
                        label = {
                            Text(
                                category,
                                fontSize = 11.sp,
                                fontWeight = if (selectedCategory == category) FontWeight.Bold
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

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("🎙️ سرعت:", fontSize = 11.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold)
                Spacer(Modifier.width(6.dp))
                listOf(0.75f to "آهسته", 1.0f to "معمولی", 1.25f to "سریع").forEach { (speed, label) ->
                    FilterChip(
                        selected = speechSpeed == speed,
                        onClick = {
                            speechSpeed = speed
                            speechHelper.setSpeed(speed)
                        },
                        label = { Text(label, fontSize = 10.sp, fontWeight = FontWeight.Bold) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = PrimaryColor,
                            selectedLabelColor = Color.White
                        ),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            Text(
                "${filteredSentences.size} جمله یافت شد",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(Modifier.height(8.dp))

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(filteredSentences, key = { it.id }) { sentence ->
                    SentenceCard(
                        sentence = sentence,
                        isBookmarked = bookmarkedIds.contains(sentence.id),
                        onSpeakClick = {
                            speechHelper.setSpeed(speechSpeed)
                            speechHelper.speak(sentence.english)
                        },
                        onBookmarkClick = {
                            bookmarkedIds = if (bookmarkedIds.contains(sentence.id))
                                bookmarkedIds - sentence.id
                            else
                                bookmarkedIds + sentence.id
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun SentenceCard(
    sentence: DailySentence,
    isBookmarked: Boolean,
    onSpeakClick: () -> Unit,
    onBookmarkClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onSpeakClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(PrimaryColor.copy(alpha = 0.1f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(sentence.categoryEmoji, fontSize = 18.sp)
                }
                Spacer(Modifier.width(10.dp))
                Text(
                    sentence.category,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor
                )
                Spacer(Modifier.weight(1f))

                IconButton(
                    onClick = onBookmarkClick,
                    modifier = Modifier.size(36.dp)
                ) {
                    Icon(
                        imageVector = if (isBookmarked) Icons.Filled.Bookmark
                        else Icons.Filled.BookmarkBorder,
                        contentDescription = "Bookmark",
                        tint = if (isBookmarked) Color(0xFFFFA000) else Color.Gray,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    sentence.english,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    lineHeight = 24.sp,
                    modifier = Modifier.weight(1f)
                )
                Spacer(Modifier.width(8.dp))
                IconButton(
                    onClick = onSpeakClick,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(PrimaryColor.copy(alpha = 0.12f))
                ) {
                    Icon(
                        Icons.AutoMirrored.Filled.VolumeUp,
                        "Play",
                        tint = PrimaryColor,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFFF5F7FA))
                    .padding(10.dp)
            ) {
                Text(
                    sentence.persian,
                    fontSize = 13.sp,
                    color = Color(0xFF616161),
                    lineHeight = 20.sp
                )
            }
        }
    }
}