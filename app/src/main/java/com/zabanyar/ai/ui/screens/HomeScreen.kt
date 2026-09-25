				




‌‌‌،package.com.zabanyar.ai.ui.sceerns
 import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.ProgressManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToLibrary: () -> Unit = {},
    onNavigateToAIChat: () -> Unit = {},
    onNavigateToSpeaking: () -> Unit = {},
    onNavigateToVocabulary: () -> Unit = {},
    onNavigateToProfile: () -> Unit = {},
    onNavigateToSettings: () -> Unit = {},
    onNavigateToPodcast: () -> Unit = {},
    onNavigateToDailySentences: () -> Unit = {},
    onNavigateToLevelTest: () -> Unit = {},
    onNavigateToAchievements: () -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val context = LocalContext.current
    var refreshKey by remember { mutableIntStateOf(0) }

    val totalStars = remember(refreshKey) { ProgressManager.getTotalStars(context) }
    val lessonsCompleted = remember(refreshKey) { ProgressManager.getLessonsCompleted(context) }
    val dailyStreak = remember(refreshKey) { ProgressManager.getDailyStreak(context) }
    val quizzesPassed = remember(refreshKey) { ProgressManager.getTotalQuizzesPassed(context) }

    val currentLevel = (totalStars / 100) + 1
    val xpInLevel = totalStars % 100
    val xpForNextLevel = 100
    val levelProgress = xpInLevel.toFloat() / xpForNextLevel.toFloat()

    val allBooks = remember { BookRepository.getAllBooks() }
    val featuredBooks = remember { allBooks.take(10) }

    val dailyGoalMinutes = 10
    val todayMinutes = remember(refreshKey) { minOf((lessonsCompleted % 10) * 3, dailyGoalMinutes) }

    var selectedTab by remember { mutableIntStateOf(3) }

    Scaffold(
        containerColor = Color(0xFFF8F9FC),
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                tonalElevation = 8.dp
            ) {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0; onNavigateToSpeaking() },
                    icon = { Icon(Icons.Filled.Mic, "اسپیکینگ", modifier = Modifier.size(24.dp)) },
                    label = { Text("اسپیکینگ", fontSize = 10.sp) },
                    colors = navItemColors()
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1; onNavigateToAIChat() },
                    icon = { Icon(Icons.Filled.ChatBubble, "چت", modifier = Modifier.size(24.dp)) },
                    label = { Text("چت", fontSize = 10.sp) },
                    colors = navItemColors()
                )
                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2; onNavigateToLibrary() },
                    icon = { Icon(Icons.Filled.List, "کتابخانه", modifier = Modifier.size(24.dp)) },
                    label = { Text("کتابخانه", fontSize = 10.sp) },
                    colors = navItemColors()
                )
                NavigationBarItem(
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 },
                    icon = { Icon(Icons.Filled.Home, "خانه", modifier = Modifier.size(24.dp)) },
                    label = { Text("خانه", fontSize = 10.sp) },
                    colors = navItemColors()
                )
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            item {
                BlueHeaderCard(
                    level = currentLevel,
                    xpInLevel = xpInLevel,
                    xpForNextLevel = xpForNextLevel,
                    levelProgress = levelProgress,
                    streak = dailyStreak,
                    todayMinutes = todayMinutes,
                    dailyGoal = dailyGoalMinutes,
                    onProfileClick = onNavigateToProfile,
                    onStatsClick = { }
                )
            }

            if (featuredBooks.isNotEmpty()) {
                item {
                    Spacer(Modifier.height(16.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(featuredBooks) { book ->
                            BookCoverSmall(
                                book = book,
                                onClick = onNavigateToLibrary
                            )
                        }
                    }
                    Spacer(Modifier.height(24.dp))
                }
            }

            item {
                Text(
                    "📖 کتاب‌های شما",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 12.dp)
                )
            }

            items(allBooks.take(10)) { book ->
                ContentListItem(
                    book = book,
                    onClick = { onNavigateToLibrary() }
                )
                Spacer(Modifier.height(10.dp))
            }

            item { Spacer(Modifier.height(16.dp)) }
        }
    }
}

@Composable
fun BlueHeaderCard(
    level: Int,
    xpInLevel: Int,
    xpForNextLevel: Int,
    levelProgress: Float,
    streak: Int,
    todayMinutes: Int,
    dailyGoal: Int,
    onProfileClick: () -> Unit,
    onStatsClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        listOf(Color(0xFF2E4A9E), Color(0xFF1A237E))
                    )
                )
                .padding(20.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onProfileClick,
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.15f))
                    ) {
                        Icon(Icons.Filled.Person, null, tint = Color.White, modifier = Modifier.size(20.dp))
                    }
                    Spacer(Modifier.width(8.dp))
                    IconButton(
                        onClick = onStatsClick,
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.15f))
                    ) {
                        Icon(Icons.Filled.ShowChart, null, tint = Color.White, modifier = Modifier.size(20.dp))
                    }
                }

                Spacer(Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color(0xFF3F51B5))
                                .padding(horizontal = 12.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(22.dp)
                                    .clip(CircleShape)
                                    .background(Color.White),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("🔥", fontSize = 12.sp)
                            }
                            Spacer(Modifier.width(8.dp))
                            Text(
                                "$streak-day",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                "Streak",
                                fontSize = 13.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }

                        Spacer(Modifier.height(14.dp))

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            repeat(5) { index ->
                                val isChecked = index < (todayMinutes / 2)
                                Box(
                                    modifier = Modifier
                                        .padding(end = 5.dp)
                                        .size(26.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(
                                            if (isChecked) Color.White
                                            else Color.White.copy(alpha = 0.2f)
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    if (isChecked) {
                                        Icon(
                                            Icons.Filled.Check,
                                            null,
                                            tint = Color(0xFF2E4A9E),
                                            modifier = Modifier.size(16.dp)
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(Modifier.height(10.dp))

                        Text(
                            "${String.format("%02d", todayMinutes / 60)}:${String.format("%02d", todayMinutes % 60)}/$dailyGoal min",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }

                    Box(
                        modifier = Modifier.size(120.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Canvas(modifier = Modifier.fillMaxSize()) {
                            drawArc(
                                color = Color.White.copy(alpha = 0.15f),
                                startAngle = 135f,
                                sweepAngle = 270f,
                                useCenter = false,
                                style = Stroke(width = 8.dp.toPx(), cap = StrokeCap.Round)
                            )
                            drawArc(
                                color = Color.White,
                                startAngle = 135f,
                                sweepAngle = 270f * levelProgress,
                                useCenter = false,
                                style = Stroke(width = 8.dp.toPx(), cap = StrokeCap.Round)
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                "Level $level",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(Modifier.height(2.dp))
                            Text(
                                "$xpInLevel.$xpForNextLevel/$xpForNextLevel",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.85f)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BookCoverSmall(
    book: Book,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .width(78.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(78.dp, 110.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(
                    Brush.linearGradient(
                        listOf(Color(book.gradientStart), Color(book.gradientEnd))
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(book.levelEmoji, fontSize = 24.sp)
                Spacer(Modifier.height(4.dp))
                Text(
                    book.title.split(" ").firstOrNull() ?: "",
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    maxLines = 1,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun ContentListItem(
    book: Book,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(Alignment.End)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xFFF0F0F0))
                        .padding(horizontal = 10.dp, vertical = 3.dp)
                ) {
                    Text(
                        book.level,
                        fontSize = 10.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(Modifier.height(8.dp))

                Text(
                    book.title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(Modifier.height(2.dp))

                Text(
                    book.titlePersian,
                    fontSize = 11.sp,
                    color = Color.Gray,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(Modifier.weight(1f))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        Icons.Filled.AccessTime,
                        null,
                        tint = Color.Gray,
                        modifier = Modifier.size(13.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        "${book.totalChapters} فصل",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.width(10.dp))
                    LinearProgressIndicator(
                        progress = { 0.35f },
                        modifier = Modifier
                            .weight(1f)
                            .height(4.dp)
                            .clip(RoundedCornerShape(2.dp)),
                        color = Color(book.gradientStart),
                        trackColor = Color(book.gradientStart).copy(alpha = 0.15f)
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(end = 12.dp)
                    .width(95.dp)
                    .height(130.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(Color(book.gradientStart), Color(book.gradientEnd))
                        )
                    )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        book.levelEmoji,
                        fontSize = 40.sp
                    )
                }

                Box(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(6.dp)
                        .size(26.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.9f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Filled.MoreVert,
                        null,
                        tint = Color.Gray,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun navItemColors(): NavigationBarItemColors {
    return NavigationBarItemDefaults.colors(
        selectedIconColor = Color(0xFF1A237E),
        selectedTextColor = Color(0xFF1A237E),
        unselectedIconColor = Color.Gray,
        unselectedTextColor = Color.Gray,
        indicatorColor = Color(0xFF1A237E).copy(alpha = 0.15f)
    )
}