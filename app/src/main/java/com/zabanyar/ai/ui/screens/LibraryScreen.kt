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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage // 👈 نیاز به کتابخانه Coil برای نمایش عکس

// ⚠️ این دیتاکلاس نمونه است. باید با دیتاکلاس واقعی Book خودت جایگزین بشه.
data class BookItem(
    val id: String,
    val title: String,
    val titlePersian: String,
    val imageUrl: String,
    val views: String,
    val isNew: Boolean = false
)

@Composable
fun LibraryScreen() {
    // 👈 استیت برای نگه‌داشتن کتاب‌های اضافه شده
    val addedBooks = remember { mutableStateListOf<String>() }
    var selectedTab by remember { mutableStateOf("کتاب‌های ساده") }

    // دیتای نمونه (عکس‌ها تستی هستند)
    val simpleBooks = listOf(
        BookItem("b1", "Love or Money?", "عشق یا پول", "https://picsum.photos/seed/book1/300/450", "43.2K"),
        BookItem("b2", "The Curse of the Mummy", "نفرین مومیایی", "https://picsum.photos/seed/book2/300/450", "32.2K"),
        BookItem("b3", "Sherlock Holmes: The Blue Diamond", "الماس آبی", "https://picsum.photos/seed/book3/300/450", "67", isNew = true)
    )

    val mediumBooks = listOf(
        BookItem("b4", "Gladiator", "گلادیاتور", "https://picsum.photos/seed/book4/300/450", "15.7K"),
        BookItem("b5", "The Secret Garden", "باغ اسرارآمیز", "https://picsum.photos/seed/book5/300/450", "15.0K"),
        BookItem("b6", "The Swiss Family Robinson", "خانواده رابینسون", "https://picsum.photos/seed/book6/300/450", "12.4K")
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
            val tabs = listOf("کتاب‌های ساده", "کتاب‌های متوسط", "کتاب‌های پیشرفته")
            items(tabs) { tab ->
                Button(
                    onClick = { selectedTab = tab },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedTab == tab) Color(0xFF2E4A9E) else Color(0xFF2E4A9E).copy(alpha = 0.7f),
                        contentColor = Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    Text(tab, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                }
            }
        }

        // ==================== لیست اصلی کتاب‌ها ====================
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            // --- بخش کتاب‌های ساده ---
            item {
                BookSection(
                    title = "کتاب‌های ساده",
                    subtitle = "اگر تازه کارید از اینجا شروع کنید",
                    books = simpleBooks,
                    addedBooks = addedBooks,
                    onAddClick = { id ->
                        if (addedBooks.contains(id)) addedBooks.remove(id) else addedBooks.add(id)
                    }
                )
            }

            // --- بخش کتاب‌های متوسط ---
            item {
                BookSection(
                    title = "کتاب‌های متوسط",
                    subtitle = "زبان سطح دبیرستان",
                    books = mediumBooks,
                    addedBooks = addedBooks,
                    onAddClick = { id ->
                        if (addedBooks.contains(id)) addedBooks.remove(id) else addedBooks.add(id)
                    }
                )
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
        // هدر بخش
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(title, fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color(0xFF1A237E))
            Text(subtitle, fontSize = 12.sp, color = Color.Gray)
        }
        Spacer(Modifier.height(12.dp))

        // لیست افقی کتاب‌ها
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

// ==================== کارت کتاب دقیقاً طبق تصویر ====================
@Composable
fun BookCardDesign(
    book: BookItem,
    isAdded: Boolean,
    onAddClick: () -> Unit
) {
    Column(modifier = Modifier.width(140.dp)) { // عرض کارت
        // --- بخش عکس و دکمه + ---
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // ارتفاع عکس
                .clip(RoundedCornerShape(16.dp)) // گوشه‌های گرد عکس
                .background(Color.LightGray) // رنگ پس‌زمینه قبل از لود عکس
        ) {
            // عکس کاور (نیاز به کتابخانه Coil دارد)
            AsyncImage(
                model = book.imageUrl,
                contentDescription = book.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // نشان NEW (اگر کتاب جدید باشد)
            if (book.isNew) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .background(Color(0xFFB0BEC5).copy(alpha = 0.8f), RoundedCornerShape(8.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text("NEW", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                }
            }

            // دکمه + (دقیقاً روی لبه پایین راست عکس)
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .size(36.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.White)
                    .clickable { onAddClick() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (isAdded) Icons.Filled.Check else Icons.Filled.Add,
                    contentDescription = "Add",
                    tint = if (isAdded) Color(0xFF4CAF50) else Color(0xFF1A237E),
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        // --- عنوان فارسی ---
        Text(
            book.titlePersian,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color(0xFF1A237E),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(Modifier.height(4.dp))

        // --- تعداد بازدید ---
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Filled.Visibility,
                null,
                tint = Color.Gray,
                modifier = Modifier.size(14.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(book.views, fontSize = 11.sp, color = Color.Gray)
        }
    }
}