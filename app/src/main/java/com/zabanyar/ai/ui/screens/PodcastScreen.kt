package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.FavoriteBorder
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

enum class ViewMode { LIST, GRID }
enum class SortType(val label: String) {
    TITLE("عنوان"), LEVEL("سطح"), DURATION("مدت زمان")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastScreen(
    onBack: () -> Unit = {},
    onPodcastClick: (Podcast) -> Unit = {}
) {
    val allPodcasts = remember { PodcastRepository.getAllPodcasts() }

    // ==================== استیت‌های UI ====================
    var searchQuery by remember { mutableStateOf("") }
    var selectedLevel by remember { mutableStateOf("همه") }
    var selectedCategory by remember { mutableStateOf("همه") }
    var viewMode by remember { mutableStateOf(ViewMode.LIST) }
    var sortType by remember { mutableStateOf(SortType.TITLE) }
    val favoriteIds = remember { mutableStateListOf<String>() }

    // ==================== فیلتر و مرتب‌سازی ====================
    val categories = remember { listOf("همه") + allPodcasts.map { it.category }.distinct() }
    val levels = listOf("همه", "مبتدی", "متوسط", "پیشرفته")

    val filteredPodcasts by remember(searchQuery, selectedLevel, selectedCategory, sortType) {
        derivedStateOf {
            allPodcasts.filter { podcast ->
                val matchesSearch = searchQuery.isEmpty() ||
                        podcast.title.contains(searchQuery, true) ||
                        podcast.titlePersian.contains(searchQuery)
                val matchesLevel = selectedLevel == "همه" || podcast.level == selectedLevel
                val matchesCategory = selectedCategory == "همه" || podcast.category == selectedCategory
                matchesSearch && matchesLevel && matchesCategory
            }.sortedWith(
                when (sortType) {
                    SortType.TITLE -> compareBy { it.title }
                    SortType.LEVEL -> compareBy { it.level }
                    SortType.DURATION -> compareBy { it.duration }
                }
            )
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🎧 پادکست‌های آموزشی",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        Text(
                            "${filteredPodcasts.size} پادکست",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                actions = {
                    IconButton(onClick = {
                        viewMode = if (viewMode == ViewMode.LIST) ViewMode.GRID else ViewMode.LIST
                    }) {
                        Icon(
                            if (viewMode == ViewMode.LIST) Icons.Filled.GridView else Icons.Filled.ViewList,
                            "Toggle View",
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
                .background(Color(0xFFF8F9FC))
                .padding(padding)
        ) {
            // ==================== هدر جستجو و فیلتر ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(PrimaryColor)
                    .padding(bottom = 16.dp)
            ) {
                Column {
                    OutlinedTextField(
                        value = searchQuery,
                        onValueChange = { searchQuery = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .padding(top = 8.dp),
                        placeholder = { Text("جستجوی پادکست...", fontSize = 13.sp) },
                        leadingIcon = { Icon(Icons.Filled.Search, null, tint = PrimaryColor) },
                        trailingIcon = {
                            if (searchQuery.isNotEmpty()) {
                                IconButton(onClick = { searchQuery = "" }) {
                                    Icon(Icons.Filled.Clear, "Clear", tint = Color.Gray)
                                }
                            }
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(16.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent
                        )
                    )
                    Spacer(Modifier.height(12.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        item {
                            SortDropdown(currentSort = sortType, onSortChange = { sortType = it })
                        }
                        items(levels) { level ->
                            FilterChip(
                                selected = selectedLevel == level,
                                onClick = { selectedLevel = level },
                                label = { Text(level, fontSize = 11.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    containerColor = Color.White.copy(alpha = 0.2f),
                                    labelColor = Color.White,
                                    selectedContainerColor = Color.White,
                                    selectedLabelColor = PrimaryColor
                                )
                            )
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(categories) { category ->
                            FilterChip(
                                selected = selectedCategory == category,
                                onClick = { selectedCategory = category },
                                label = { Text(category, fontSize = 11.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    containerColor = Color.Transparent,
                                    labelColor = Color.White.copy(alpha = 0.7f),
                                    selectedContainerColor = Color.White.copy(alpha = 0.2f),
                                    selectedLabelColor = Color.White
                                ),
                                border = null
                            )
                        }
                    }
                }
            }

            // ==================== لیست پادکست‌ها ====================
            if (filteredPodcasts.isEmpty()) {
                EmptyState()
            } else {
                if (viewMode == ViewMode.LIST) {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        item {
                            Text(
                                "✨ ویژه و پیشنهادی",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = PrimaryColor,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                            FeaturedCarousel(
                                podcasts = filteredPodcasts.take(3),
                                onPodcastClick = onPodcastClick
                            )
                            Spacer(Modifier.height(16.dp))
                            Text(
                                "📚 همه پادکست‌ها",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = PrimaryColor,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                        }
                        items(filteredPodcasts, key = { it.id }) { podcast ->
                            PodcastListItem(
                                podcast = podcast,
                                isPlaying = false,
                                isFavorite = favoriteIds.contains(podcast.id),
                                onFavoriteClick = {
                                    if (favoriteIds.contains(podcast.id)) favoriteIds.remove(podcast.id)
                                    else favoriteIds.add(podcast.id)
                                },
                                onClick = { onPodcastClick(podcast) }
                            )
                        }
                    }
                } else {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(filteredPodcasts, key = { it.id }) { podcast ->
                            PodcastGridItem(
                                podcast = podcast,
                                isPlaying = false,
                                onClick = { onPodcastClick(podcast) }
                            )
                        }
                    }
                }
            }
        }
    }
}

// ==================== توابع کمکی ====================

@Composable
fun SortDropdown(currentSort: SortType, onSortChange: (SortType) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        FilterChip(
            selected = false,
            onClick = { expanded = true },
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Sort, null, modifier = Modifier.size(14.dp), tint = Color.White)
                    Spacer(Modifier.width(4.dp))
                    Text("مرتب‌سازی", fontSize = 11.sp, color = Color.White)
                }
            },
            colors = FilterChipDefaults.filterChipColors(containerColor = Color.White.copy(alpha = 0.2f))
        )
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            SortType.values().forEach { sort ->
                DropdownMenuItem(
                    text = { Text(sort.label, fontSize = 13.sp) },
                    onClick = { onSortChange(sort); expanded = false }
                )
            }
        }
    }
}

@Composable
fun FeaturedCarousel(podcasts: List<Podcast>, onPodcastClick: (Podcast) -> Unit) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        items(podcasts) { podcast ->
            Card(
                modifier = Modifier
                    .width(280.dp)
                    .height(140.dp)
                    .clickable { onPodcastClick(podcast) },
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize().background(
                        Brush.linearGradient(
                            listOf(Color(podcast.gradientStart), Color(podcast.gradientEnd))
                        )
                    )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(16.dp),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text(
                            podcast.title,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            maxLines = 1
                        )
                        Text(
                            podcast.titlePersian,
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 12.sp
                        )
                    }
                    Icon(
                        Icons.Filled.PlayCircle,
                        null,
                        tint = Color.White,
                        modifier = Modifier.align(Alignment.TopEnd).padding(12.dp).size(36.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun PodcastListItem(
    podcast: Podcast,
    isPlaying: Boolean,
    isFavorite: Boolean,
    onFavoriteClick: () -> Unit,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable { onClick() },
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(Color(podcast.gradientStart), Color(podcast.gradientEnd))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(podcast.levelEmoji, fontSize = 20.sp)
                    Text(podcast.categoryEmoji, fontSize = 12.sp)
                }
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        podcast.title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                    IconButton(onClick = onFavoriteClick, modifier = Modifier.size(24.dp)) {
                        Icon(
                            if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                            null,
                            tint = if (isFavorite) Color(0xFFE91E63) else Color.Gray,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                Text(podcast.titlePersian, fontSize = 12.sp, color = Color.Gray)
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
                    Spacer(Modifier.width(8.dp))
                    Icon(Icons.Filled.Headphones, null, tint = Color.Gray, modifier = Modifier.size(12.dp))
                    Spacer(Modifier.width(4.dp))
                    Text(podcast.duration, fontSize = 10.sp, color = Color.Gray)
                }
            }
            Spacer(Modifier.width(8.dp))
            IconButton(
                onClick = onClick,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(if (isPlaying) Color(0xFFE91E63) else Color(podcast.gradientStart))
            ) {
                Icon(
                    if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                    "Play",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}

@Composable
fun PodcastGridItem(podcast: Podcast, isPlaying: Boolean, onClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().height(200.dp).clickable { onClick() },
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize().background(
                Brush.verticalGradient(
                    listOf(Color(podcast.gradientStart), Color(podcast.gradientEnd))
                )
            )
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(12.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(podcast.levelEmoji, fontSize = 20.sp)
                    if (isPlaying) Icon(
                        Icons.Filled.GraphicEq,
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                }
                Column {
                    Text(
                        podcast.title,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        podcast.duration,
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 11.sp
                    )
                }
            }
        }
    }
}

@Composable
fun EmptyState() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                Icons.Filled.SearchOff,
                null,
                modifier = Modifier.size(64.dp),
                tint = Color.LightGray
            )
            Spacer(Modifier.height(16.dp))
            Text(
                "پادکستی یافت نشد!",
                color = Color.Gray,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                "فیلترها را تغییر دهید یا عبارت دیگری جستجو کنید.",
                color = Color.LightGray,
                fontSize = 12.sp
            )
        }
    }
}