package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ⚠️ این یک نمونه دیتاکلاس است. از دیتاکلاس واقعی Book خودت استفاده کن.
data class BookSample(
    val id: String,
    val title: String,
    val titlePersian: String,
    val coverColor: Long,
    val views: String
)

@Composable
fun LibraryScreen() {
    // 👈 استیت برای نگه‌داشتن کتاب‌هایی که کاربر اضافه کرده
    val addedBooks = remember { mutableStateListOf<String>() }

    // دیتای نمونه (شما این رو از BookRepository خودت بگیری)
    val simpleBooks = listOf(
        BookSample("b1", "Love or Money?", "عشق یا پول", 0xFFE91E63, "43.2K"),
        BookSample("b2", "The Curse of the Mummy", "نفرین مومیایی", 0xFF1A237E, "32.2K"),
        BookSample("b3", "The Mystery", "معما", 0xFF4A148C, "15.7K")
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color(0xFFF8F9FC)),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // ==================== دسته کتاب‌های ساده ====================
        item {
            Column {
                Text(
                    "کتاب‌های ساده",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color(0xFF1A237E)
                )
                Text(
                    "اگر تازه کارید از اینجا شروع کنید",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(12.dp))

                // 👈 اسکرول افقی کتاب‌ها
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(end = 16.dp)
                ) {
                    items(simpleBooks) { book ->
                        BookCardBig(
                            book = book,
                            isAdded = addedBooks.contains(book.id), // 👈 چک کردن وضعیت
                            onAddClick = {
                                // 👈 اگر اضافه شده بود حذف کن، اگر نبود اضافه کن
                                if (addedBooks.contains(book.id)) {
                                    addedBooks.remove(book.id)
                                } else {
                                    addedBooks.add(book.id)
                                }
                            }
                        )
                    }
                }
            }
        }

        // ==================== دسته کتاب‌های متوسط ====================
        item {
            Column {
                Text(
                    "کتاب‌های متوسط",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color(0xFF1A237E)
                )
                Text(
                    "زبان سطح دبیرستان",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(12.dp))

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(end = 16.dp)
                ) {
                    items(simpleBooks) { book ->
                        BookCardBig(
                            book = book,
                            isAdded = addedBooks.contains(book.id),
                            onAddClick = {
                                if (addedBooks.contains(book.id)) {
                                    addedBooks.remove(book.id)
                                } else {
                                    addedBooks.add(book.id)
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}

// ==================== کارت کتاب بزرگ و شیک (با دکمه + در پایین راست) ====================
@Composable
fun BookCardBig(
    book: BookSample,
    isAdded: Boolean,
    onAddClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .width(160.dp)
            .height(240.dp)
            .clickable { /* باز کردن کتاب */ },
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            // کاور کتاب (گرادیان)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(Color(book.coverColor), Color(book.coverColor).copy(alpha = 0.6f))
                        )
                    )
            )

            // اطلاعات پایین کارت
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.Transparent, Color.Black.copy(alpha = 0.85f))
                        )
                    )
                    .padding(start = 12.dp, end = 12.dp, top = 24.dp, bottom = 12.dp) // فاصله از پایین بیشتر شد
            ) {
                Text(
                    book.title,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    book.titlePersian,
                    color = Color.White.copy(alpha = 0.8f),
                    fontSize = 11.sp,
                    maxLines = 1
                )
                Spacer(Modifier.height(6.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Filled.Visibility,
                        null,
                        tint = Color.White.copy(alpha = 0.7f),
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        book.views,
                        color = Color.White.copy(alpha = 0.7f),
                        fontSize = 10.sp
                    )
                }
            }

            // 👈 دکمه + دقیقاً مثل تصویر (گوشه پایین راست، پس‌زمینه سفید)
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd) // پایین سمت راست
                    .padding(8.dp) // کمی فاصله از لبه‌ها
                    .size(40.dp) // اندازه دکمه
                    .clip(RoundedCornerShape(12.dp)) // گوشه‌های گرد
                    .background(Color.White) // پس‌زمینه سفید
                    .clickable { onAddClick() }, // قابلیت کلیک
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    // اگر اضافه شده بود تیک، اگر نه +
                    imageVector = if (isAdded) Icons.Filled.Check else Icons.Filled.Add,
                    contentDescription = "Add to library",
                    tint = if (isAdded) Color(0xFF4CAF50) else Color.Black, // تیک سبز، + مشکی
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}