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
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

// ⚠️ دیتاکلاس نمونه (فیلد badgeText اضافه شد)
data class BookItem(
    val id: String,
    val title: String,
    val titlePersian: String,
    val imageUrl: String,
    val views: String,
    val badgeText: String? = null, // 👈 برای نمایش تگ US
    val isAudio: Boolean = false
)

@Composable
fun LibraryScreen() {
    val addedBooks = remember { mutableStateListOf<String>() }
    var selectedTab by remember { mutableStateOf("کتاب‌های شنیداری") } // پیش‌فرض روی شنیداری

    // ==================== دیتای کتاب‌های شنیداری (طبق تصویر) ====================
    val listeningBooks = listOf(
        BookItem(
            id = "l1",
            title = "Basic Tactics for Listening",
            titlePersian = "تاکتیک‌های پایه گوش دادن",
            imageUrl = "https://picsum.photos/seed/basic/400/600", // 👈 عکس واقعی رو اینجا بذار
            views = "55.3K",
            badgeText = "US",
            isAudio = true
        ),
        BookItem(
            id = "l2",
            title = "Developing Tactics for Listening",
            titlePersian = "تاکتیک‌های متوسط گوش دادن",
            imageUrl = "https://picsum.photos/seed/developing/400/600", // 👈 عکس واقعی رو اینجا بذار
            views = "20.3K",
            badgeText = "US",
            isAudio = true
        ),
        BookItem(
            id = "l3",
            title = "Expanding Tactics for Listening",
            titlePersian = "تاکتیک‌های پیشرفته گوش دادن",
            imageUrl = "https://picsum.photos/seed/expanding/400/600", // 👈 عکس واقعی رو اینجا بذار
            views = "12.6K",
            badgeText = "US",
            isAudio = true
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F9FC))
    ) {
        // ==================== تب‌های بالای صفحه ====================
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val tabs = listOf("کتاب‌های ساده", "کتاب‌های متوسط", "کتاب‌های پیشرفته", "کتاب‌های شنیداری")
            items(tabs) { tab ->
                Button(
                    onClick = { selectedTab = tab },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedTab == tab) Color(0xFF2E4A9E) else Color(0xFF2E4A9E).copy(alpha = 0.6f),
                        contentColor = Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    Text(tab, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                }
            }
        }

        // ==================== لیست اصلی ====================
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            when (selectedTab) {
                "کتاب‌های شنیداری" -> {
                    item {
                        BookSection(
                            title = "دوره‌های آموزشی",
                            subtitle = "دوره‌های متداول در آموزش زبان‌های زبان",
                            books = listeningBooks,
                            addedBooks = addedBooks,
                            onAddClick = { id -> if (addedBooks.contains(id)) addedBooks.remove(id) else addedBooks.add(id) }
                        )
                    }
                }
                // 👈 بقیه تب‌ها (ساده، متوسط، پیشرفته) رو می‌تونی اینجا اضافه کنی
                else -> {
                    item {
                        Box(modifier = Modifier.fillMaxSize().padding(32.dp), contentAlignment = Alignment.Center) {
                            Text("به زودی...", color = Color.Gray)
                        }
                    }
                }
            }
        }
    }
}

// ==================== کامپوننت بخش (هدر + لیست افقی) ====================
@Composable
fun BookSection(
    title: String,
    subtitle: String,
    books: List<BookItem>,
    addedBooks: List<String>,
    onAddClick: (String) -> Unit
) {
    Column {
        // هدر (دقیقاً مثل تصویر: عنوان بزرگ و زیرعنوان خاکستری)
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(title, fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color(0xFF1A237E))
            Text(subtitle, fontSize = 13.sp, color = Color.Gray)
        }
        Spacer(Modifier.height(16.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(books) { book ->
                BookCardDesign(
                    book = book,
                    isAdded = addedBooks.contains(book.id),
                    onAddClick = { onAddClick(book.id) }
                )
            }
        }
    }
}

// ==================== کارت کتاب (دقیقاً طبق تصاویر) ====================
@Composable
fun BookCardDesign(
    book: BookItem,
    isAdded: Boolean,
    onAddClick: () -> Unit
) {
    // 👈 عرض و ارتفاع بزرگ (مثل تصویر)
    Column(modifier = Modifier.width(170.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp) // ارتفاع بزرگ برای کاور
                .clip(RoundedCornerShape(20.dp))
                .background(Color.LightGray)
        ) {
            // عکس کاور
            AsyncImage(
                model = book.imageUrl,
                contentDescription = book.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // 👈 آیکون هدفون (چون کتاب صوتیه)
            if (book.isAudio) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp)
                        .size(30.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Black.copy(alpha = 0.5f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Filled.Headphones,
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            // 👈 دکمه + سفید در گوشه پایین راست (دقیقاً مثل عکس)
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .size(44.dp) // دکمه بزرگ
                    .clip(RoundedCornerShape(14.dp)) // گوشه‌های گرد
                    .background(Color.White) // پس‌زمینه سفید
                    .clickable { onAddClick() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (isAdded) Icons.Filled.Check else Icons.Filled.Add,
                    contentDescription = "Add",
                    tint = Color.Black, // آیکون مشکی
                    modifier = Modifier.size(24.dp)
                )
            }
        }

        Spacer(Modifier.height(10.dp))

        // 👈 عنوان انگلیسی (زیر عکس)
        Text(
            book.title,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(Modifier.height(6.dp))

        // 👈 ردیف پایین: تعداد بازدید + تگ US (مثل تصویر)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Filled.Visibility,
                null,
                tint = Color.Gray,
                modifier = Modifier.size(14.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(book.views, fontSize = 12.sp, color = Color.Gray)

            // تگ US (اگر وجود داشته باشه)
            if (book.badgeText != null) {
                Spacer(Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color(0xFF607D8B)) // رنگ خاکستری تیره
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        book.badgeText,
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}