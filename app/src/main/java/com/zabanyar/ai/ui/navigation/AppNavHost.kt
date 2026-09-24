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
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory
import com.zabanyar.ai.data.BookRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibraryScreen(
    onBack: () -> Unit = {},
    onBookClick: (String) -> Unit = {}
) {
    val addedBooks = remember { mutableStateListOf<String>() }
    var selectedTab by remember { mutableStateOf("کتاب‌های ساده") }

    val allBooks = remember { BookRepository.getAllBooks() }

    val simpleBooks = allBooks.filter { it.level == "مبتدی" }
    val mediumBooks = allBooks.filter { it.level == "متوسط" }
    val advancedBooks = allBooks.filter { it.level == "پیشرفته" }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("📚 کتابخانه", color = Color.White, fontSize = 17.sp, fontWeight = FontWeight.Bold)
                        Text("${allBooks.size} کتاب در ۸ دسته‌بندی", color = Color.White.copy(alpha = 0.8f), fontSize = 11.sp)
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
                .background(Color.White)
                .padding(padding)
        ) {
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

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 32.dp),
                verticalArrangement = Arrangement.spacedBy(28.dp)
            ) {
                when (selectedTab) {
                    "کتاب‌های ساده" -> {
                        items(simpleBooks.chunked(10)) { chunk ->
                            BookSectionByCategory(
                                books = chunk,
                                addedBooks = addedBooks,
                                onAddClick = { id ->
                                    if (addedBooks.contains(id)) addedBooks.remove(id)
                                    else addedBooks.add(id)
                                },
                                onBookClick = onBookClick
                            )
                        }
                    }
                    "کتاب‌های متوسط" -> {
                        items(mediumBooks.chunked(10)) { chunk ->
                            BookSectionByCategory(
                                books = chunk,
                                addedBooks = addedBooks,
                                onAddClick = { id ->
                                    if (addedBooks.contains(id)) addedBooks.remove(id)
                                    else addedBooks.add(id)
                                },
                                onBookClick = onBookClick
                            )
                        }
                    }
                    "کتاب‌های پیشرفته" -> {
                        items(advancedBooks.chunked(10)) { chunk ->
                            BookSectionByCategory(
                                books = chunk,
                                addedBooks = addedBooks,
                                onAddClick = { id ->
                                    if (addedBooks.contains(id)) addedBooks.remove(id)
                                    else addedBooks.add(id)
                                },
                                onBookClick = onBookClick
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BookSectionByCategory(
    books: List<Book>,
    addedBooks: List<String>,
    onAddClick: (String) -> Unit,
    onBookClick: (String) -> Unit
) {
    if (books.isEmpty()) return

    val grouped = books.groupBy { it.category }

    grouped.forEach { (category, booksInCategory) ->
        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(category.emoji, fontSize = 18.sp)
                Spacer(Modifier.width(8.dp))
                Column {
                    Text(
                        category.persianName,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        "${booksInCategory.size} کتاب",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(booksInCategory) { book ->
                    BookCardReal(
                        book = book,
                        isAdded = addedBooks.contains(book.id),
                        onAddClick = { onAddClick(book.id) },
                        onBookClick = { onBookClick(book.id) }
                    )
                }
            }
        }
    }
}

@Composable
fun BookCardReal(
    book: Book,
    isAdded: Boolean,
    onAddClick: () -> Unit,
    onBookClick: () -> Unit
) {
    Column(modifier = Modifier.width(200.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(290.dp)
                .clip(RoundedCornerShape(24.dp))
                .clickable { onBookClick() }
                .background(
                    Brush.linearGradient(
                        listOf(
                            Color(book.gradientStart),
                            Color(book.gradientEnd)
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(book.levelEmoji, fontSize = 32.sp)

                Column {
                    Text(
                        book.title,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        book.titlePersian,
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 12.sp,
                        maxLines = 2
                    )
                }
            }

            if (book.category == BookCategory.LISTENING) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(12.dp)
                        .size(32.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Black.copy(alpha = 0.4f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(Icons.Filled.Headphones, null, tint = Color.White, modifier = Modifier.size(18.dp))
                }
            }

            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(10.dp)
                    .size(48.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(Color.White)
                    .clickable { onAddClick() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (isAdded) Icons.Filled.Check else Icons.Filled.Add,
                    contentDescription = "Add",
                    tint = if (isAdded) Color(0xFF4CAF50) else Color.Black,
                    modifier = Modifier.size(26.dp)
                )
            }
        }

        Spacer(Modifier.height(10.dp))

        Text(
            book.title,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF1A237E),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            book.titlePersian,
            fontSize = 12.sp,
            color = Color.Gray,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(Modifier.height(6.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Visibility, null, tint = Color.Gray, modifier = Modifier.size(14.dp))
            Spacer(Modifier.width(4.dp))
            Text("${book.totalChapters} فصل", fontSize = 11.sp, color = Color.Gray)
        }
    }
}