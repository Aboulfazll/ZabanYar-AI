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
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.Podcast
import com.zabanyar.ai.data.PodcastRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastScreen(
    onBack: () -> Unit = {}
) {
    val allPodcasts = remember { PodcastRepository.getAllPodcasts() }
    var searchQuery by remember { mutableStateOf("") }
    var selectedLevel by remember { mutableStateOf("همه") }
    var currentlyPlayingId by remember { mutableStateOf<String?>(null) }

    val levels = listOf("همه", "مبتدی", "متوسط", "پیشرفته")

    val filteredPodcasts = allPodcasts.filter { podcast ->
        val matchesSearch = searchQuery.isEmpty() ||
                podcast.title.contains(searchQuery, true) ||
                podcast.titlePersian.contains(searchQuery)
        val matchesLevel = selectedLevel == "همه" || podcast.level == selectedLevel
        matchesSearch && matchesLevel
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🎧 پادکست‌ها",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        Text(
                            "${allPodcasts.size} پادکست آموزشی",
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
            // ==================== جستجو ====================
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
                    placeholder = { Text("جستجوی پادکست...", fontSize = 13.sp) },
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

            // ==================== فیلتر سطح ====================
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(levels) { level ->
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
                "${filteredPodcasts.size} پادکست",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(Modifier.height(8.dp))

            // ==================== لیست پادکست‌ها ====================
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(filteredPodcasts) { podcast ->
                    PodcastCard(
                        podcast = podcast,
                        isPlaying = currentlyPlayingId == podcast.id,
                        onClick = {
                            currentlyPlayingId = if (currentlyPlayingId == podcast.id) null
                            else podcast.id
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun PodcastCard(
    podcast: Podcast,
    isPlaying: Boolean,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // کاور گرادیان
            Box(
                modifier = Modifier
                    .size(70.dp)
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
                    Text(podcast.levelEmoji, fontSize = 22.sp)
                    Text(podcast.categoryEmoji, fontSize = 14.sp)
                }
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    podcast.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    podcast.titlePersian,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(6.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(podcast.gradientStart).copy(alpha = 0.15f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            podcast.category,
                            fontSize = 9.sp,
                            color = Color(podcast.gradientStart),
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.width(6.dp))
                    Icon(
                        Icons.Filled.Headphones,
                        null,
                        tint = Color.Gray,
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        podcast.duration,
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                }
            }

            IconButton(
                onClick = onClick,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(
                        if (isPlaying) Color(0xFFE91E63) else Color(podcast.gradientStart)
                    )
            ) {
                Icon(
                    Icons.Filled.PlayArrow,
                    "Play",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}