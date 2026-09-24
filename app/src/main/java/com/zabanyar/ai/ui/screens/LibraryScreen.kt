package com.zabanyar.ai.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ViewList
import androidx.compose.material.icons.filled.ViewModule
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
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory
import com.zabanyar.ai.data.BookRepository

// ============================================================
// Series Group Data Model
// ============================================================
data class BookSeries(
    val name: String,
    val namePersian: String,
    val emoji: String,
    val color: Long,
    val books: List<Book>
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibraryScreen(
    onBack: () -> Unit = {},
    onBookClick: (String) -> Unit = {}
) {
    val allBooks = remember { BookRepository.getAllBooks() }
    var searchQuery by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf<BookCategory?>(null) }
    var groupedView by remember { mutableStateOf(true) }
    val expandedSeries = remember { mutableStateMapOf<String, Boolean>() }

    val filteredBooks = allBooks.filter { book ->
        val matchesSearch = searchQuery.isEmpty() ||
                book.title.contains(searchQuery, true) ||
                book.titlePersian.contains(searchQuery, true) ||
                book.author.contains(searchQuery, true)
        val matchesCategory = selectedCategory == null || book.category == selectedCategory
        matchesSearch && matchesCategory
    }

    val groupedSeries = remember(filteredBooks) {
        groupBooksBySeries(filteredBooks)
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
                            "${filteredBooks.size} کتاب آموزشی",
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
                actions = {
                    IconButton(onClick = { groupedView = !groupedView }) {
                        Icon(
                            if (groupedView) Icons.Filled.ViewModule else Icons.Filled.ViewList,
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
                    placeholder = { Text("جستجوی کتاب...", fontSize = 13.sp) },
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
                item {
                    FilterChip(
                        selected = selectedCategory == null,
                        onClick = { selectedCategory = null },
                        label = {
                            Text("✨ همه", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = PrimaryColor,
                            selectedLabelColor = Color.White
                        )
                    )
                }
                items(BookCategory.values().toList()) { category ->
                    FilterChip(
                        selected = selectedCategory == category,
                        onClick = {
                            selectedCategory =
                                if (selectedCategory == category) null else category
                        },
                        label = {
                            Text(
                                "${category.emoji} ${category.persianName}",
                                fontSize = 12.sp,
                                fontWeight = if (selectedCategory == category) FontWeight.Bold
                                else FontWeight.Normal
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(category.color),
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            // ==================== نمایش کتاب‌ها ====================
            if (filteredBooks.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("📭", fontSize = 64.sp)
                        Spacer(Modifier.height(16.dp))
                        Text("کتابی یافت نشد", fontSize = 15.sp, color = Color.Gray)
                    }
                }
            } else if (groupedView) {
                // ==================== گروه‌بندی سری‌ها ====================
                LazyColumn(
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(groupedSeries, key = { it.name }) { series ->
                        val isExpanded = expandedSeries[series.name] ?: true

                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(18.dp),
                            elevation = CardDefaults.cardElevation(3.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Column {
                                // هدر سری
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            expandedSeries[series.name] = !isExpanded
                                        }
                                        .background(
                                            Brush.linearGradient(
                                                listOf(
                                                    Color(series.color),
                                                    Color(series.color).copy(alpha = 0.7f)
                                                )
                                            )
                                        )
                                        .padding(14.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(42.dp)
                                            .clip(CircleShape)
                                            .background(Color.White.copy(alpha = 0.25f)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(series.emoji, fontSize = 22.sp)
                                    }
                                    Spacer(Modifier.width(12.dp))
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            series.name,
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                        Text(
                                            "${series.books.size} کتاب • ${series.namePersian}",
                                            fontSize = 11.sp,
                                            color = Color.White.copy(alpha = 0.85f)
                                        )
                                    }
                                    Icon(
                                        if (isExpanded) Icons.Filled.ExpandLess
                                        else Icons.Filled.ExpandMore,
                                        null,
                                        tint = Color.White,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }

                                // لیست کتاب‌های سری
                                AnimatedVisibility(visible = isExpanded) {
                                    Column(
                                        modifier = Modifier.padding(12.dp),
                                        verticalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        series.books.forEach { book ->
                                            BookRowItem(
                                                book = book,
                                                onClick = { onBookClick(book.id) }
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // فضای پایان
                    item { Spacer(Modifier.height(20.dp)) }
                }
            } else {
                // ==================== نمایش گرید ====================
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

// ============================================================
// Book Row Item (برای نمای گروه‌بندی)
// ============================================================
@Composable
private fun BookRowItem(book: Book, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(1.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF8F9FB))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // آیکن کتاب
            Box(
                modifier = Modifier
                    .size(46.dp)
                    .clip(RoundedCornerShape(10.dp))
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
                Text(book.category.emoji, fontSize = 20.sp)
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    book.title,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A1A2E),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    book.titlePersian,
                    fontSize = 11.sp,
                    color = PrimaryColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "${book.levelEmoji} ${book.level}",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "• ${book.totalChapters} فصل",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                }
            }

            // فلش
            Text("›", fontSize = 22.sp, color = Color.Gray)
        }
    }
}

// ============================================================
// Book Card (نمای گرید — از نسخه قبلی)
// ============================================================
@Composable
private fun BookCard(book: Book, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
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
                        Text(book.category.emoji, fontSize = 28.sp)
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
                    Spacer(Modifier.weight(1f))
                    Text(
                        book.level,
                        fontSize = 9.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

// ============================================================
// تابع گروه‌بندی کتاب‌ها بر اساس سری
// ============================================================
private fun groupBooksBySeries(books: List<Book>): List<BookSeries> {
    val seriesMap = linkedMapOf<String, MutableList<Book>>()

    books.forEach { book ->
        val seriesKey = when {
            book.id.startsWith("english_file_") -> "English File"
            book.id.startsWith("top_notch_") -> "Top Notch"
            book.id.startsWith("evolve_") -> "Evolve"
            book.id.startsWith("four_corners_") -> "Four Corners"
            book.category == BookCategory.GRAMMAR -> "Grammar Books"
            book.category == BookCategory.VOCABULARY -> "Vocabulary Books"
            book.category == BookCategory.IELTS -> "IELTS & TOEFL"
            book.category == BookCategory.LISTENING -> "Listening Skills"
            book.category == BookCategory.READING -> "Reading Skills"
            book.category == BookCategory.STORY -> "Story Books"
            book.category == BookCategory.IDIOMS -> "Idioms & Expressions"
            else -> "Other Books"
        }
        seriesMap.getOrPut(seriesKey) { mutableListOf() }.add(book)
    }

    return seriesMap.map { (key, bookList) ->
        BookSeries(
            name = key,
            namePersian = getPersianName(key),
            emoji = getEmoji(key),
            color = getColor(key),
            books = bookList
        )
    }
}

private fun getPersianName(key: String): String = when (key) {
    "English File" -> "اینگلیش فایل"
    "Top Notch" -> "تاپ ناچ"
    "Evolve" -> "ایوولو"
    "Four Corners" -> "فور کورنرز"
    "Grammar Books" -> "کتاب‌های گرامر"
    "Vocabulary Books" -> "کتاب‌های واژگان"
    "IELTS & TOEFL" -> "آیلتس و تافل"
    "Listening Skills" -> "مهارت شنیداری"
    "Reading Skills" -> "مهارت خواندن"
    "Story Books" -> "کتاب‌های داستان"
    "Idioms & Expressions" -> "اصطلاحات"
    else -> "سایر کتاب‌ها"
}

private fun getEmoji(key: String): String = when (key) {
    "English File" -> "🎯"
    "Top Notch" -> "⭐"
    "Evolve" -> "🚀"
    "Four Corners" -> "🌍"
    "Grammar Books" -> "📝"
    "Vocabulary Books" -> "📚"
    "IELTS & TOEFL" -> "🎓"
    "Listening Skills" -> "🎧"
    "Reading Skills" -> "📖"
    "Story Books" -> "📕"
    "Idioms & Expressions" -> "💡"
    else -> "📘"
}

private fun getColor(key: String): Long = when (key) {
    "English File" -> 0xFF1976D2
    "Top Notch" -> 0xFF6A1B9A
    "Evolve" -> 0xFF00695C
    "Four Corners" -> 0xFFBF360C
    "Grammar Books" -> 0xFF00695C
    "Vocabulary Books" -> 0xFFE91E63
    "IELTS & TOEFL" -> 0xFFF57C00
    "Listening Skills" -> 0xFF0288D1
    "Reading Skills" -> 0xFF7B1FA2
    "Story Books" -> 0xFFC62828
    "Idioms & Expressions" -> 0xFFFFA000
    else -> 0xFF455A64
}