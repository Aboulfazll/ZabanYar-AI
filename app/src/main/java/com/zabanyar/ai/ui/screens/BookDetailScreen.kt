package com.zabanyar.ai.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.ProgressManager

// ============================================================
// Sealed Class for List Items
// ============================================================
sealed class BookDetailItem {
    data class GroupHeader(
        val groupIndex: Int,
        val title: String,
        val isUnlocked: Boolean
    ) : BookDetailItem()

    data class ChapterItem(
        val number: Int,
        val title: String,
        val isRead: Boolean,
        val isUnlocked: Boolean
    ) : BookDetailItem()

    data class QuizCard(
        val quizIndex: Int,
        val firstChapter: Int,
        val lastChapter: Int,
        val isUnlocked: Boolean,
        val isPassed: Boolean,
        val bestScore: Int,
        val attempts: Int
    ) : BookDetailItem()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookDetailScreen(
    bookId: String,
    onBack: () -> Unit,
    onChapterClick: (Int) -> Unit,
    onQuizClick: (Int) -> Unit = {}
) {
    val context = LocalContext.current
    val book = BookRepository.getBookById(bookId)

    if (book == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("کتاب پیدا نشد")
        }
        return
    }

    val accentColor = Color(book.gradientStart)

    // State
    var refreshKey by remember { mutableIntStateOf(0) }
    val chapterStates = remember(refreshKey) {
        ProgressManager.getChapterStates(context, bookId, book.totalChapters)
    }
    val quizStates = remember(refreshKey) {
        ProgressManager.getQuizStates(context, bookId, book.totalChapters)
    }
    val progress = remember(refreshKey) {
        ProgressManager.getBookProgress(context, bookId, book.totalChapters)
    }

    val listItems = remember(chapterStates, quizStates) {
        buildBookDetailItems(chapterStates, quizStates, bookId, book.totalChapters)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            book.title,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 15.sp,
                            maxLines = 1
                        )
                        Text(
                            book.titlePersian,
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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = accentColor)
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding),
            contentPadding = PaddingValues(bottom = 30.dp)
        ) {
            // ============ هدر کتاب ============
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(accentColor, Color(book.gradientEnd))
                            )
                        )
                        .padding(20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(book.category.emoji, fontSize = 40.sp)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                book.title,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                book.author,
                                fontSize = 12.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                            Spacer(Modifier.height(8.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                InfoChip("${book.levelEmoji} ${book.level}")
                                InfoChip("${book.category.emoji} ${book.category.persianName}")
                            }
                        }
                    }
                }
            }

            // ============ کارت پیشرفت ============
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .offset(y = (-20).dp),
                    shape = RoundedCornerShape(18.dp),
                    elevation = CardDefaults.cardElevation(6.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(36.dp)
                                        .clip(CircleShape)
                                        .background(accentColor.copy(alpha = 0.15f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("📊", fontSize = 18.sp)
                                }
                                Spacer(Modifier.width(10.dp))
                                Column {
                                    Text(
                                        "پیشرفت شما",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryColor
                                    )
                                    Text(
                                        "${progress.readChapters} از ${progress.totalChapters} درس",
                                        fontSize = 10.sp,
                                        color = Color.Gray
                                    )
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(
                                        Brush.linearGradient(
                                            listOf(accentColor, Color(book.gradientEnd))
                                        )
                                    )
                                    .padding(horizontal = 12.dp, vertical = 6.dp)
                            ) {
                                Text(
                                    "${progress.overallProgressPercent}%",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }

                        Spacer(Modifier.height(12.dp))

                        LinearProgressIndicator(
                            progress = { progress.overallProgressPercent / 100f },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(10.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            color = accentColor,
                            trackColor = accentColor.copy(alpha = 0.15f)
                        )

                        Spacer(Modifier.height(14.dp))

                        Divider(color = Color.LightGray.copy(alpha = 0.3f))

                        Spacer(Modifier.height(14.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            MiniStatBox(
                                icon = "📖",
                                value = "${progress.readChapters}",
                                label = "خوانده",
                                color = Color(0xFF1976D2)
                            )
                            MiniStatBox(
                                icon = "📝",
                                value = "${progress.quizzesPassed}/${progress.totalQuizzes}",
                                label = "آزمون",
                                color = Color(0xFF00695C)
                            )
                            MiniStatBox(
                                icon = "🔓",
                                value = "${progress.unlockedGroups}/${progress.totalGroups}",
                                label = "گروه باز",
                                color = Color(0xFFF57C00)
                            )
                        }
                    }
                }
            }

            // ============ راهنما ============
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 4.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE3F2FD))
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("💡", fontSize = 18.sp)
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "هر ۳ درس بخوان، بعد آزمون بده (حداقل ۹۰٪). با قبولی، درس‌های بعدی باز می‌شن!",
                            fontSize = 11.sp,
                            color = Color(0xFF1565C0),
                            lineHeight = 17.sp
                        )
                    }
                }
            }

            // ============ عنوان فصل‌ها ============
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(4.dp, 22.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(accentColor)
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        "محتوای کتاب (${book.totalChapters} درس • ${progress.totalQuizzes} آزمون)",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
                }
            }

            // ============ لیست اصلی (نسخه اصلاح‌شده) ============
            items(
                count = listItems.size,
                key = { index -> "book_detail_$bookId$index" }
            ) { index ->
                val item = listItems[index]
                when (item) {
                    is BookDetailItem.GroupHeader -> GroupHeaderView(
                        groupIndex = item.groupIndex,
                        title = item.title,
                        isUnlocked = item.isUnlocked,
                        accentColor = accentColor
                    )

                    is BookDetailItem.ChapterItem -> ChapterCard(
                        number = item.number,
                        title = item.title,
                        isRead = item.isRead,
                        isUnlocked = item.isUnlocked,
                        accentColor = accentColor,
                        onClick = {
                            if (item.isUnlocked) {
                                onChapterClick(item.number)
                            }
                        }
                    )

                    is BookDetailItem.QuizCard -> QuizCardView(
                        quizIndex = item.quizIndex,
                        firstChapter = item.firstChapter,
                        lastChapter = item.lastChapter,
                        isUnlocked = item.isUnlocked,
                        isPassed = item.isPassed,
                        bestScore = item.bestScore,
                        attempts = item.attempts,
                        accentColor = accentColor,
                        onClick = {
                            if (item.isUnlocked) {
                                onQuizClick(item.quizIndex)
                            }
                        }
                    )
                }
            }

            // ============ پایان کتاب ============
            if (progress.quizzesPassed == progress.totalQuizzes && progress.totalQuizzes > 0) {
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9)),
                        elevation = CardDefaults.cardElevation(3.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text("🏆", fontSize = 48.sp)
                            Spacer(Modifier.height(10.dp))
                            Text(
                                "کتاب تمام شد!",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF2E7D32)
                            )
                            Spacer(Modifier.height(6.dp))
                            Text(
                                "همه درس‌ها و آزمون‌های این کتاب را با موفقیت پاس کردی",
                                fontSize = 12.sp,
                                color = Color(0xFF2E7D32).copy(alpha = 0.85f),
                                textAlign = TextAlign.Center,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

// ============================================================
// Group Header View
// ============================================================
@Composable
private fun GroupHeaderView(
    groupIndex: Int,
    title: String,
    isUnlocked: Boolean,
    accentColor: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(26.dp)
                .clip(CircleShape)
                .background(
                    if (isUnlocked) accentColor.copy(alpha = 0.15f)
                    else Color.Gray.copy(alpha = 0.15f)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                if (isUnlocked) "📂" else "🔒",
                fontSize = 13.sp
            )
        }
        Spacer(Modifier.width(8.dp))
        Text(
            title,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = if (isUnlocked) PrimaryColor else Color.Gray
        )
        Spacer(Modifier.weight(1f))
        if (!isUnlocked) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.Gray.copy(alpha = 0.15f))
                    .padding(horizontal = 8.dp, vertical = 3.dp)
            ) {
                Text(
                    "قفل",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            }
        }
    }
}

// ============================================================
// Chapter Card
// ============================================================
@Composable
private fun ChapterCard(
    number: Int,
    title: String,
    isRead: Boolean,
    isUnlocked: Boolean,
    accentColor: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 5.dp)
            .clickable(enabled = isUnlocked) { onClick() },
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(
            if (isUnlocked) 3.dp else 1.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = if (isUnlocked) Color.White else Color(0xFFF0F0F0)
        )
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
                    .background(
                        when {
                            !isUnlocked -> Color.Gray.copy(alpha = 0.2f)
                            isRead -> Color(0xFF4CAF50).copy(alpha = 0.15f)
                            else -> accentColor.copy(alpha = 0.15f)
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (isRead) {
                    Icon(
                        Icons.Filled.Check,
                        null,
                        tint = Color(0xFF4CAF50),
                        modifier = Modifier.size(22.dp)
                    )
                } else {
                    Text(
                        "$number",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isUnlocked) accentColor else Color.Gray
                    )
                }
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "درس $number",
                        fontSize = 11.sp,
                        color = if (isUnlocked) Color.Gray else Color.Gray.copy(alpha = 0.6f),
                        fontWeight = FontWeight.SemiBold
                    )
                    if (isRead) {
                        Spacer(Modifier.width(6.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(Color(0xFF4CAF50).copy(alpha = 0.15f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                "خوانده‌شده ✓",
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF2E7D32)
                            )
                        }
                    }
                }
                Spacer(Modifier.height(2.dp))
                Text(
                    title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isUnlocked) Color(0xFF1A237E) else Color.Gray
                )
            }

            if (isUnlocked) {
                Icon(
                    Icons.Filled.PlayArrow,
                    null,
                    tint = accentColor,
                    modifier = Modifier.size(28.dp)
                )
            } else {
                Icon(
                    Icons.Filled.Lock,
                    null,
                    tint = Color.Gray,
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}

// ============================================================
// Quiz Card View
// ============================================================
@Composable
private fun QuizCardView(
    quizIndex: Int,
    firstChapter: Int,
    lastChapter: Int,
    isUnlocked: Boolean,
    isPassed: Boolean,
    bestScore: Int,
    attempts: Int,
    accentColor: Color,
    onClick: () -> Unit
) {
    val gradientColors = when {
        isPassed -> listOf(Color(0xFF4CAF50), Color(0xFF66BB6A))
        isUnlocked -> listOf(Color(0xFFF57C00), Color(0xFFFFB74D))
        else -> listOf(Color(0xFF9E9E9E), Color(0xFFBDBDBD))
    }

    val infiniteTransition = rememberInfiniteTransition(label = "quiz_pulse")
    val pulseScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = if (isUnlocked && !isPassed) 1.03f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .scale(pulseScale)
            .clickable(enabled = isUnlocked && !isPassed) { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(
            if (isUnlocked) 6.dp else 2.dp
        )
    ) {
        Column {
            // Header
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(gradientColors))
                    .padding(16.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            when {
                                isPassed -> "🏆"
                                isUnlocked -> "📝"
                                else -> "🔒"
                            },
                            fontSize = 26.sp
                        )
                    }

                    Spacer(Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "آزمون ${quizIndex + 1}",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(Modifier.height(2.dp))
                        Text(
                            "درس‌های $firstChapter تا $lastChapter",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                    }

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(Color.White.copy(alpha = 0.25f))
                            .padding(horizontal = 10.dp, vertical = 5.dp)
                    ) {
                        Text(
                            when {
                                isPassed -> "قبول ✓"
                                isUnlocked -> "${ProgressManager.QUESTIONS_PER_QUIZ} سوال"
                                else -> "قفل"
                            },
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            // Body
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(14.dp)
            ) {
                when {
                    isPassed -> {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    Icons.Filled.CheckCircle,
                                    null,
                                    tint = Color(0xFF4CAF50),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    "با موفقیت پاس شد",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF2E7D32)
                                )
                            }
                            Text(
                                "بهترین: $bestScore%",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF4CAF50)
                            )
                        }
                    }

                    isUnlocked -> {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    if (attempts > 0) "دفعه قبل: ${bestScore}%" else "آماده برای شروع",
                                    fontSize = 11.sp,
                                    color = Color.Gray
                                )
                                Spacer(Modifier.height(2.dp))
                                Text(
                                    "حداقل ${ProgressManager.PASS_THRESHOLD_PERCENT}% برای قبولی",
                                    fontSize = 10.sp,
                                    color = Color(0xFFF57C00),
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                            Button(
                                onClick = onClick,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFF57C00)
                                ),
                                shape = RoundedCornerShape(10.dp),
                                contentPadding = PaddingValues(
                                    horizontal = 16.dp,
                                    vertical = 6.dp
                                )
                            ) {
                                Text(
                                    "شروع آزمون",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Spacer(Modifier.width(4.dp))
                                Icon(
                                    Icons.Filled.ArrowForward,
                                    null,
                                    modifier = Modifier.size(14.dp),
                                    tint = Color.White
                                )
                            }
                        }

                        if (attempts > 0) {
                            Spacer(Modifier.height(8.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color(0xFFFFF3E0))
                                    .padding(8.dp)
                            ) {
                                Text(
                                    "🔁 قبلاً $attempts بار تلاش کرده‌ای",
                                    fontSize = 10.sp,
                                    color = Color(0xFFE65100)
                                )
                            }
                        }
                    }

                    else -> {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Filled.Lock,
                                null,
                                tint = Color.Gray,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                "برای باز شدن، ابتدا ۳ درس این گروه را بخوان",
                                fontSize = 11.sp,
                                color = Color.Gray,
                                lineHeight = 16.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

// ============================================================
// Helper Composables
// ============================================================
@Composable
private fun InfoChip(text: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White.copy(alpha = 0.25f))
            .padding(horizontal = 8.dp, vertical = 3.dp)
    ) {
        Text(
            text,
            fontSize = 10.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun MiniStatBox(
    icon: String,
    value: String,
    label: String,
    color: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(38.dp)
                .clip(CircleShape)
                .background(color.copy(alpha = 0.12f)),
            contentAlignment = Alignment.Center
        ) {
            Text(icon, fontSize = 18.sp)
        }
        Spacer(Modifier.height(4.dp))
        Text(
            value,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = color
        )
        Text(
            label,
            fontSize = 9.sp,
            color = Color.Gray
        )
    }
}

// ============================================================
// Helper Functions
// ============================================================
private fun buildBookDetailItems(
    chapterStates: List<ProgressManager.ChapterState>,
    quizStates: List<ProgressManager.QuizState>,
    bookId: String,
    totalChapters: Int
): List<BookDetailItem> {
    val items = mutableListOf<BookDetailItem>()
    val chaptersPerGroup = ProgressManager.CHAPTERS_PER_GROUP
    val totalGroups = (totalChapters + chaptersPerGroup - 1) / chaptersPerGroup

    for (groupIndex in 0 until totalGroups) {
        val firstCh = groupIndex * chaptersPerGroup + 1
        val lastCh = minOf(firstCh + chaptersPerGroup - 1, totalChapters)
        val isGroupUnlocked = groupIndex == 0 ||
                (quizStates.getOrNull(groupIndex - 1)?.isPassed == true)

        // Group Header
        items.add(
            BookDetailItem.GroupHeader(
                groupIndex = groupIndex,
                title = "گروه ${groupIndex + 1}: درس $firstCh تا $lastCh",
                isUnlocked = isGroupUnlocked
            )
        )

        // Chapters
        for (ch in firstCh..lastCh) {
            val chapterState = chapterStates.firstOrNull { it.chapterNumber == ch }
            val title = getChapterTitle(bookId, ch)
            items.add(
                BookDetailItem.ChapterItem(
                    number = ch,
                    title = title,
                    isRead = chapterState?.isRead == true,
                    isUnlocked = chapterState?.isUnlocked == true
                )
            )
        }

        // Quiz (بعد از گروه، به‌جز آخرین)
        if (groupIndex < totalGroups - 1) {
            val quizState = quizStates.getOrNull(groupIndex)
            if (quizState != null) {
                items.add(
                    BookDetailItem.QuizCard(
                        quizIndex = quizState.quizIndex,
                        firstChapter = quizState.firstChapter,
                        lastChapter = quizState.lastChapter,
                        isUnlocked = quizState.isUnlocked,
                        isPassed = quizState.isPassed,
                        bestScore = quizState.bestScore,
                        attempts = quizState.attempts
                    )
                )
            }
        }
    }

    return items
}

private fun getChapterTitle(bookId: String, chapterNumber: Int): String {
    val book = BookRepository.getBookById(bookId) ?: return "درس $chapterNumber"
    return if (book.chapterTitles.isNotEmpty() && chapterNumber <= book.chapterTitles.size) {
        book.chapterTitles[chapterNumber - 1]
    } else {
        "درس $chapterNumber"
    }
}