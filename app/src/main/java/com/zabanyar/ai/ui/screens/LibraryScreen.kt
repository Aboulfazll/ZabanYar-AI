package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ==================== مدل کتاب (موقت) ====================
data class BookItem(
    val id: String,
    val title: String,
    val titlePersian: String,
    val author: String,
    val category: String,
    val categoryEmoji: String,
    val level: String,
    val levelEmoji: String,
    val totalChapters: Int,
    val gradientStart: Long,
    val gradientEnd: Long
)

// ==================== داده کتاب‌ها ====================
val allBooks = listOf(
    // مکالمه
    BookItem("tn1", "Top Notch 1", "تاپ ناچ ۱", "Joan Saslow", "مکالمه", "💬", "مبتدی", "🌱", 8, 0xFF6A1B9A, 0xFFAB47BC),
    BookItem("tn2", "Top Notch 2", "تاپ ناچ ۲", "Joan Saslow", "مکالمه", "💬", "متوسط", "🚀", 10, 0xFF1565C0, 0xFF42A5F5),
    BookItem("tn3", "Top Notch 3", "تاپ ناچ ۳", "Joan Saslow", "مکالمه", "💬", "پیشرفته", "🏆", 10, 0xFFC62828, 0xFFEF5350),

    // گرامر
    BookItem("bg1", "Basic Grammar", "گرامر پایه", "Raymond Murphy", "گرامر", "📝", "مبتدی", "🌱", 45, 0xFF00695C, 0xFF26A69A),
    BookItem("ug1", "Understanding Grammar", "درک گرامر", "Betty Azar", "گرامر", "📝", "متوسط", "🚀", 30, 0xFF0277BD, 0xFF4FC3F7),
    BookItem("ag1", "Advanced Grammar", "گرامر پیشرفته", "Martin Hewings", "گرامر", "📝", "پیشرفته", "🏆", 31, 0xFF4527A0, 0xFF7E57C2),

    // واژگان
    BookItem("v1", "Vocabulary Elementary", "واژگان پایه", "McCarthy", "واژگان", "📚", "مبتدی", "🌱", 60, 0xFFE91E63, 0xFFF06292),
    BookItem("v2", "Vocabulary Intermediate", "واژگان متوسط", "Stuart Redman", "واژگان", "📚", "متوسط", "🚀", 100, 0xFF00897B, 0xFF4DB6AC),
    BookItem("b504", "504 Essential Words", "۵۰۴ واژه ضروری", "Murray Bromberg", "واژگان", "📚", "متوسط", "🚀", 42, 0xFFFF6F00, 0xFFFFB300),

    // IELTS
    BookItem("i16", "IELTS 16", "آیلتس ۱۶", "Cambridge", "آیلتس", "🎯", "پیشرفته", "🏆", 4, 0xFF1A237E, 0xFF3F51B5),
    BookItem("i17", "IELTS 17", "آیلتس ۱۷", "Cambridge", "آیلتس", "🎯", "پیشرفته", "🏆", 4, 0xFF283593, 0xFF5C6BC0),
    BookItem("m2", "Mindset for IELTS 2", "مایندست ۲", "Cambridge", "آیلتس", "🎯", "متوسط", "🚀", 8, 0xFFAD1457, 0xFFEC407A),

    // داستان
    BookItem("gm", "The Gift of the Magi", "هدیه مغان", "O. Henry", "داستان", "📖", "متوسط", "🚀", 3, 0xFF880E4F, 0xFFC2185B),
    BookItem("sh", "Sleepy Hollow", "دره خواب‌آلود", "Washington Irving", "داستان", "📖", "متوسط", "🚀", 6, 0xFF37474F, 0xFF78909C),
    BookItem("hh", "Halloween Horror", "وحشت هالووین", "Gina Clemen", "داستان", "📖", "مبتدی", "🌱", 5, 0xFF4A148C, 0xFF9C27B0),

    // اصطلاحات
    BookItem("ee1", "Everyday Expressions 1", "اصطلاحات روزمره ۱", "Casey Malarcher", "اصطلاحات", "💡", "مبتدی", "🌱", 20, 0xFF33691E, 0xFF8BC34A),
    BookItem("ee2", "Everyday Expressions 2", "اصطلاحات روزمره ۲", "Casey Malarcher", "اصطلاحات", "💡", "متوسط", "🚀", 20, 0xFF01579B, 0xFF039BE5)
)

val allCategories = listOf("همه", "مکالمه", "گرامر", "واژگان", "آیلتس", "داستان", "اصطلاحات")

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibraryScreen(
    onBack: () -> Unit = {},
    onBookClick: (String) -> Unit = {}
) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("همه") }

    val filteredBooks = allBooks.filter { book ->
        val matchesSearch = searchQuery.isEmpty() ||
                book.title.contains(searchQuery, true) ||
                book.titlePersian.contains(searchQuery, true) ||
                book.author.contains(searchQuery, true)
        val matchesCategory = selectedCategory == "همه" || book.category == selectedCategory
        matchesSearch && matchesCategory
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "📚 کتابخانه",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(
                            "${allBooks.size} کتاب آموزشی",
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
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = PrimaryColor
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {
            // ==================== نوار جستجو ====================
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
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    placeholder = {
                        Text("جستجوی کتاب...", fontSize = 13.sp)
                    },
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

            // ==================== فیلتر دسته‌بندی ====================
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(allCategories) { category ->
                    FilterChip(
                        selected = selectedCategory == category,
                        onClick = { selectedCategory = category },
                        label = {
                            Text(
                                category,
                                fontSize = 12.sp,
                                fontWeight = if (selectedCategory == category) FontWeight.Bold
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

            Spacer(Modifier.height(12.dp))

            // ==================== آمار ====================
            Text(
                text = "${filteredBooks.size} کتاب یافت شد",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(Modifier.height(8.dp))

            // ==================== گرید کتاب‌ها ====================
            if (filteredBooks.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("📭", fontSize = 64.sp)
                        Spacer(Modifier.height(16.dp))
                        Text(
                            "کتابی یافت نشد",
                            fontSize = 15.sp,
                            color = Color.Gray
                        )
                    }
                }
            } else {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(filteredBooks, key = { it.id }) { book ->
                        BookCard(book = book, onClick = { onBookClick(book.id) })
                    }
                }
            }
        }
    }
}

@Composable
private fun BookCard(book: BookItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            // ==================== کاور کتاب ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(book.gradientStart),
                                Color(book.gradientEnd)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(book.categoryEmoji, fontSize = 28.sp)
                    }
                    Spacer(Modifier.height(8.dp))
                    Text(
                        book.title,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        lineHeight = 15.sp
                    )
                }

                // بج سطح
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White.copy(alpha = 0.3f))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(book.levelEmoji, fontSize = 12.sp)
                }
            }

            // ==================== اطلاعات کتاب ====================
            Column(modifier = Modifier.padding(10.dp)) {
                Text(
                    book.titlePersian,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    book.author,
                    fontSize = 9.sp,
                    color = Color.Gray,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(8.dp))

                // تعداد فصل + دسته
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.MenuBook,
                        null,
                        tint = Color(book.gradientStart),
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        "${book.totalChapters} فصل",
                        fontSize = 10.sp,
                        color = Color(book.gradientStart),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}