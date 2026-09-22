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
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.BookRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookDetailScreen(
    bookId: String,
    onBack: () -> Unit,
    onChapterClick: (Int) -> Unit
) {
    val book = BookRepository.getBookById(bookId)

    if (book == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("کتاب پیدا نشد")
        }
        return
    }

    val accentColor = Color(book.gradientStart)

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
            contentPadding = PaddingValues(bottom = 20.dp)
        ) {
            // هدر کتاب
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    accentColor,
                                    Color(book.gradientEnd)
                                )
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

            // نوار پیشرفت
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .offset(y = (-20).dp),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(6.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                "پیشرفت شما",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Text(
                                "۰ از ${book.totalChapters}",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                        Spacer(Modifier.height(10.dp))
                        LinearProgressIndicator(
                            progress = { 0f },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp)),
                            color = accentColor,
                            trackColor = accentColor.copy(alpha = 0.15f)
                        )
                    }
                }
            }

            // عنوان فصل‌ها
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
                        "فصل‌های کتاب (${book.totalChapters})",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
                }
            }

            // لیست فصل‌ها
            items((1..book.totalChapters).toList()) { chapterNumber ->
                ChapterItem(
                    number = chapterNumber,
                    title = getChapterTitle(bookId, chapterNumber),
                    accentColor = accentColor,
                    onClick = { onChapterClick(chapterNumber) }
                )
            }
        }
    }
}

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
private fun ChapterItem(
    number: Int,
    title: String,
    accentColor: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 5.dp)
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
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(accentColor.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "$number",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = accentColor
                )
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    "فصل $number",
                    fontSize = 11.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
            }

            Icon(
                Icons.Filled.PlayArrow,
                null,
                tint = accentColor,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}

private fun getChapterTitle(bookId: String, chapterNumber: Int): String {
    val book = BookRepository.getBookById(bookId) ?: return "درس $chapterNumber"
    return if (book.chapterTitles.isNotEmpty() && chapterNumber <= book.chapterTitles.size) {
        book.chapterTitles[chapterNumber - 1]
    } else {
        "درس $chapterNumber"
    }
}