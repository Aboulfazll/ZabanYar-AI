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

// ==================== مدل داده ====================
data class BookItem(
    val id: String,
    val title: String,
    val titlePersian: String,
    val imageUrl: String,
    val views: String,
    val badgeText: String? = null,
    val isAudio: Boolean = false,
    val isNew: Boolean = false
)

@Composable
fun LibraryScreen() {
    val addedBooks = remember { mutableStateListOf<String>() }
    var selectedTab by remember { mutableStateOf("کتاب‌های ساده") }

    // ==================== دیتای نمونه ====================
    val simpleBooks = listOf(
        BookItem("b1", "Love or Money?", "عشق یا پول",
            "https://picsum.photos/seed/book1/400/600", "43.2K"),
        BookItem("b2", "The Curse of the Mummy", "نفرین مومیایی",
            "https://picsum.photos/seed/book2/400/600", "32.2K"),
        BookItem("b3", "Sherlock Holmes: The Blue Diamond", "الماس آبی",
            "https://picsum.photos/seed/book3/400/600", "67", isNew = true)
    )

    val mediumBooks = listOf(
        BookItem("b4", "Gladiator", "گلادیاتور",
            "https://picsum.photos/seed/book4/400/600", "15.7K"),
        BookItem("b5", "The Secret Garden", "باغ اسرارآمیز",
            "https://picsum.photos/seed/book5/400/600", "15.0K"),
        BookItem("b6", "The Swiss Family Robinson", "خانواده رابینسون",
            "https://picsum.photos/seed/book6/400/600", "12.4K")
    )

    val listeningBooks = listOf(
        BookItem("l1", "Basic Tactics for Listening", "تاکتیک‌های پایه گوش دادن",
            "https://picsum.photos/seed/audio1/400/600", "55.3K", badgeText = "US", isAudio = true),
        BookItem("l2", "Developing Tactics for Listening", "تاکتیک‌های متوسط گوش دادن",
            "https://picsum.photos/seed/audio2/400/600", "20.3K", badgeText = "US", isAudio = true),
        BookItem("l3", "Expanding Tactics for Listening", "تاکتیک‌های پیشرفته گوش دادن",
            "https://picsum.photos/seed/audio3/400/600", "12.6K", badgeText = "US", isAudio = true)
    )

    // ✅ پس‌زمینه سفید و تمیز (طبق درخواست)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
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
                        containerColor = if (selectedTab == tab)
                            Color(0xFF2E4A9E)
                        else
                            Color(0xFF2E4A9E).copy(alpha = 0.6f),
                        contentColor = Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    Text(tab, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                }
            }
        }

        // ==================== لیست کتاب‌ها ====================
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(28.dp)
        ) {
            when (selectedTab) {
                "کتاب‌های ساده" -> item {
                    BookSection(
                        title = "کتاب‌های ساده",
                        subtitle = "اگر تازه کارید از اینجا شروع کنید",
                        books = simpleBooks,
                        addedBooks = addedBooks
                    ) { id ->
                        if (addedBooks.contains(id)) addedBooks.remove(id)
                        else addedBooks.add(id)
                    }
                }
                "کتاب‌های متوسط" -> item {
                    BookSection(
                        title = "کتاب‌های متوسط",
                        subtitle = "زبان سطح دبیرستان",
                        books = mediumBooks,
                        addedBooks = addedBooks
                    ) { id ->
                        if (addedBooks.contains(id)) addedBooks.remove(id)
                        else addedBooks.add(id)
                    }
                }
                "کتاب‌های پیشرفته" -> item {
                    Box(
                        modifier = Modifier.fillMaxWidth().padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("به زودی...", color = Color.Gray)
                    }
                }
            }

            // بخش شنیداری هم پایین صفحه اضافه می‌کنیم
            item {
                BookSection(
                    title = "دوره‌های آموزشی",
                    subtitle = "دوره‌های متداول در آموزش زبان",
                    books = listeningBooks,
                    addedBooks = addedBooks
                ) { id ->
                    if (addedBooks.contains(id)) addedBooks.remove(id)
                    else addedBooks.add(id)
                }
            }
        }
    }
}

// ==================== بخش (هدر + لیست افقی) ====================
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
            Text(
                title,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF1A237E)
            )
            Text(subtitle, fontSize = 13.sp, color = Color.Gray)
        }

        Spacer(Modifier.height(16.dp))

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

// ==================== کارت کتاب بزرگ و شیک ====================
@Composable
fun BookCardDesign(
    book: BookItem,
    isAdded: Boolean,
    onAddClick: () -> Unit
) {
    // ✅ ابعاد بزرگ‌تر (عرض 200، ارتفاع 290)
    Column(modifier = Modifier.width(200.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(290.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(Color(0xFFE0E0E0))
        ) {
            // عکس کاور
            AsyncImage(
                model = book.imageUrl,
                contentDescription = book.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // ✅ آیکون هدفون (برای کتاب‌های صوتی)
            if (book.isAudio) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(12.dp)
                        .size(36.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.Black.copy(alpha = 0.55f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Filled.Headphones,
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            // ✅ برچسب NEW (گوشه بالا راست)
            if (book.isNew) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(12.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.White.copy(alpha = 0.95f))
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        "NEW",
                        color = Color(0xFF1A237E),
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // ✅ دکمه + سفید در گوشه پایین راست (دقیقاً طبق تصاویر)
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(10.dp)
                    .size(52.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
                    .clickable { onAddClick() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (isAdded) Icons.Filled.Check else Icons.Filled.Add,
                    contentDescription = "Add",
                    tint = if (isAdded) Color(0xFF4CAF50) else Color.Black,
                    modifier = Modifier.size(28.dp)
                )
            }
        }

        Spacer(Modifier.height(12.dp))

        // عنوان انگلیسی
        Text(
            book.title,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = Color(0xFF1A237E),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(Modifier.height(4.dp))

        // عنوان فارسی
        Text(
            book.titlePersian,
            fontSize = 13.sp,
            color = Color.Gray,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(Modifier.height(8.dp))

        // تعداد بازدید + تگ US
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Filled.Visibility,
                null,
                tint = Color.Gray,
                modifier = Modifier.size(16.dp)
            )
            Spacer(Modifier.width(6.dp))
            Text(book.views, fontSize = 12.sp, color = Color.Gray)

            if (book.badgeText != null) {
                Spacer(Modifier.width(10.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color(0xFF607D8B))
                        .padding(horizontal = 8.dp, vertical = 3.dp)
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