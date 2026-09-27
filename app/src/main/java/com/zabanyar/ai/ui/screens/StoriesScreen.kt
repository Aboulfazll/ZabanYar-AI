package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.FavoritesManager
import com.zabanyar.ai.data.books.story.AdvancedStories
import com.zabanyar.ai.data.books.story.IntermediateStories
import com.zabanyar.ai.data.books.story.SimpleStories

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoriesScreen(
    onBack: () -> Unit = {},
    onStoryClick: (String) -> Unit = {}
) {
    val context = LocalContext.current

    var addedBooks by remember { mutableStateOf(FavoritesManager.getAddedBooks(context)) }
    var selectedTab by remember { mutableStateOf("همه") }

    // ✅ ترکیب همه داستان‌ها از منابع مختلف
    val allStories: List<Book> = remember {
        (BookRepository.getAllStories() +
        SimpleStories.getAll() +
        IntermediateStories.getAll() +
        AdvancedStories.getAll()).distinctBy { it.id }
    }

    val tabs = listOf("همه", "ساده", "متوسط", "پیشرفته", "🇬🇧 انگلیسی")

    val filteredStories = remember(selectedTab, allStories) {
        when (selectedTab) {
            "همه" -> allStories
            "ساده" -> allStories.filter { it.level == "مبتدی" || it.level == "Simple" }
            "متوسط" -> allStories.filter { it.level == "متوسط" || it.level == "Intermediate" }
            "پیشرفته" -> allStories.filter { (it.level == "پیشرفته" || it.level == "Advanced") && it.titlePersian.isNotBlank() }
            "🇬🇧 انگلیسی" -> allStories.filter { it.titlePersian.isBlank() }
            else -> allStories
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("📖 داستان‌ها", color = Color.White, fontSize = 17.sp, fontWeight = FontWeight.Bold)
                        Text("${allStories.size} داستان در سطوح مختلف", color = Color.White.copy(alpha = 0.8f), fontSize = 11.sp)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF2E4A9E))
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FC))
                .padding(padding)
        ) {
            // ==================== تب‌ها ====================
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(tabs) { tab ->
                    Button(
                        onClick = { selectedTab = tab },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedTab == tab) Color(0xFF2E4A9E)
                            else Color(0xFF2E4A9E).copy(alpha = 0.6f),
                            contentColor = Color.White
                        ),
                        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp)
                    ) {
                        Text(tab, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            // ==================== لیست داستان‌ها ====================
            if (filteredStories.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("📭", fontSize = 48.sp)
                        Spacer(Modifier.height(8.dp))
                        Text("داستانی در این سطح وجود ندارد", color = Color.Gray, fontSize = 14.sp)
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(bottom = 32.dp),
                    verticalArrangement = Arrangement.spacedBy(28.dp)
                ) {
                    items(filteredStories.chunked(10)) { chunk ->
                        StorySection(
                            stories = chunk,
                            addedBooks = addedBooks,
                            onAddClick = { id ->
                                FavoritesManager.toggleBook(context, id)
                                addedBooks = FavoritesManager.getAddedBooks(context)
                            },
                            onStoryClick = onStoryClick
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun StorySection(
    stories: List<Book>,
    addedBooks: List<String>,
    onAddClick: (String) -> Unit,
    onStoryClick: (String) -> Unit
) {
    if (stories.isEmpty()) return

    val grouped = stories.groupBy {
        when (it.level) {
            "مبتدی", "Simple" -> "مبتدی"
            "متوسط", "Intermediate" -> "متوسط"
            "پیشرفته", "Advanced" -> if (it.titlePersian.isBlank()) "انگلیسی" else "پیشرفته"
            else -> it.level
        }
    }

    grouped.forEach { (level, storiesInLevel) ->
        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val emoji = when (level) {
                    "مبتدی" -> "🌱"
                    "متوسط" -> "🚀"
                    "پیشرفته" -> "🏆"
                    "انگلیسی" -> "🇬🇧"
                    else -> "📚"
                }
                Text(emoji, fontSize = 18.sp)
                Spacer(Modifier.width(8.dp))
                Column {
                    Text("داستان‌های $level", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color(0xFF1A237E))
                    Text("${storiesInLevel.size} داستان", fontSize = 12.sp, color = Color.Gray)
                }
            }

            Spacer(Modifier.height(12.dp))

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(storiesInLevel) { story ->
                    StoryCard(
                        story = story,
                        isAdded = addedBooks.contains(story.id),
                        onAddClick = { onAddClick(story.id) },
                        onStoryClick = { onStoryClick(story.id) }
                    )
                }
            }
        }
    }
}

@Composable
fun StoryCard(
    story: Book,
    isAdded: Boolean,
    onAddClick: () -> Unit,
    onStoryClick: () -> Unit
) {
    Column(modifier = Modifier.width(170.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .clip(RoundedCornerShape(20.dp))
                .clickable { onStoryClick() }
                .background(
                    Brush.linearGradient(
                        listOf(Color(story.gradientStart), Color(story.gradientEnd))
                    )
                )
        ) {
            // لایه پس‌زمینه
            Column(
                modifier = Modifier.fillMaxSize().padding(12.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(story.levelEmoji.ifBlank { "📕" }, fontSize = 26.sp)
                Column {
                    Text(story.title, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp, maxLines = 3, overflow = TextOverflow.Ellipsis)
                    Spacer(Modifier.height(4.dp))
                    Text(story.titlePersian, color = Color.White.copy(alpha = 0.85f), fontSize = 11.sp, maxLines = 2)
                }
            }

            // 🖼️ عکس (اول محلی، بعد URL)
            BookCoverImage(
                book = story,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            // دکمه +
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(10.dp)
                    .size(42.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .clickable { onAddClick() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (isAdded) Icons.Filled.Check else Icons.Filled.Add,
                    contentDescription = "Add",
                    tint = if (isAdded) Color(0xFF4CAF50) else Color.Black,
                    modifier = Modifier.size(22.dp)
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        Text(story.title, fontWeight = FontWeight.Bold, fontSize = 13.sp, color = Color(0xFF1A237E), maxLines = 1, overflow = TextOverflow.Ellipsis)
        Text(story.titlePersian, fontSize = 11.sp, color = Color.Gray, maxLines = 1, overflow = TextOverflow.Ellipsis)

        Spacer(Modifier.height(6.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Visibility, null, tint = Color.Gray, modifier = Modifier.size(13.dp))
            Spacer(Modifier.width(4.dp))
            Text("${story.totalChapters} فصل", fontSize = 11.sp, color = Color.Gray)
        }
    }
}