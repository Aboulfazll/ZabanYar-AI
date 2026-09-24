package com.zabanyar.ai.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
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
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
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
// Data Models
// ============================================================
data class BookSeries(
    val name: String,
    val namePersian: String,
    val emoji: String,
    val color: Long,
    val books: List<Book>
)

enum class ViewMode { GRID, LIST, GROUPED, COMPACT }
enum class SortOption(val displayName: String) {
    DEFAULT("پیش‌فرض"),
    ALPHABETICAL("الفبا"),
    LEVEL("سطح"),
    CHAPTERS("فصل‌ها")
}

// ============================================================
// Main Library Screen
// ============================================================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibraryScreen(
    onBack: () -> Unit = {},
    onBookClick: (String) -> Unit = {}
) {
    val allBooks = remember { BookRepository.getAllBooks() }

    // States
    var searchQuery by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf<BookCategory?>(null) }
    var selectedLevel by remember { mutableStateOf<String?>(null) }
    var viewMode by remember { mutableStateOf(ViewMode.GROUPED) }
    var sortOption by remember { mutableStateOf(SortOption.DEFAULT) }
    var showFilters by remember { mutableStateOf(false) }
    var showSortMenu by remember { mutableStateOf(false) }
    var showStats by remember { mutableStateOf(true) }
    val expandedSeries = remember { mutableStateMapOf<String, Boolean>() }
    val favoriteBooks = remember { mutableStateListOf<String>() }
    val recentlyViewed = remember { mutableStateListOf<String>() }

    // Filter + Sort logic
    val filteredBooks = remember(searchQuery, selectedCategory, selectedLevel, sortOption) {
        val filtered = allBooks.filter { book ->
            val matchesSearch = searchQuery.isEmpty() ||
                    book.title.contains(searchQuery, true) ||
                    book.titlePersian.contains(searchQuery, true) ||
                    book.author.contains(searchQuery, true)
            val matchesCategory = selectedCategory == null || book.category == selectedCategory
            val matchesLevel = selectedLevel == null || book.level == selectedLevel
            matchesSearch && matchesCategory && matchesLevel
        }
        when (sortOption) {
            SortOption.ALPHABETICAL -> filtered.sortedBy { it.title }
            SortOption.LEVEL -> filtered.sortedBy { levelOrder(it.level) }
            SortOption.CHAPTERS -> filtered.sortedByDescending { it.totalChapters }
            else -> filtered
        }
    }

    val groupedSeries = remember(filteredBooks) {
        groupBooksBySeries(filteredBooks)
    }

    val favoriteBookList = remember(favoriteBooks.size, allBooks) {
        allBooks.filter { it.id in favoriteBooks }
    }

    val recentBookList = remember(recentlyViewed.size, allBooks) {
        recentlyViewed.mapNotNull { id -> allBooks.firstOrNull { it.id == id } }
    }

    // Active filters count
    val activeFiltersCount = (if (selectedCategory != null) 1 else 0) +
            (if (selectedLevel != null) 1 else 0)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                "📚 کتابخانه",
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 18.sp
                            )
                            if (activeFiltersCount > 0) {
                                Spacer(Modifier.width(8.dp))
                                Box(
                                    modifier = Modifier
                                        .size(20.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFFFC107)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        activeFiltersCount.toString(),
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(
                            "${filteredBooks.size} از ${allBooks.size} کتاب",
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
                    // Sort menu
                    Box {
                        IconButton(onClick = { showSortMenu = true }) {
                            Icon(
                                Icons.Filled.Sort,
                                "Sort",
                                tint = Color.White
                            )
                        }
                        DropdownMenu(
                            expanded = showSortMenu,
                            onDismissRequest = { showSortMenu = false }
                        ) {
                            SortOption.values().forEach { option ->
                                DropdownMenuItem(
                                    text = {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                if (sortOption == option) Icons.Filled.Check
                                                else Icons.Filled.SortByAlpha,
                                                null,
                                                modifier = Modifier.size(16.dp)
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(option.displayName, fontSize = 13.sp)
                                        }
                                    },
                                    onClick = {
                                        sortOption = option
                                        showSortMenu = false
                                    }
                                )
                            }
                        }
                    }
                    // View mode
                    IconButton(onClick = {
                        viewMode = when (viewMode) {
                            ViewMode.GRID -> ViewMode.LIST
                            ViewMode.LIST -> ViewMode.GROUPED
                            ViewMode.GROUPED -> ViewMode.COMPACT
                            ViewMode.COMPACT -> ViewMode.GRID
                        }
                    }) {
                        Icon(
                            when (viewMode) {
                                ViewMode.GRID -> Icons.Filled.ViewModule
                                ViewMode.LIST -> Icons.Filled.ViewList
                                ViewMode.GROUPED -> Icons.Filled.ViewAgenda
                                ViewMode.COMPACT -> Icons.Filled.ViewStream
                            },
                            "View Mode",
                            tint = Color.White
                        )
                    }
                    // Filters
                    IconButton(onClick = { showFilters = !showFilters }) {
                        Icon(
                            if (showFilters) Icons.Filled.FilterAltOff else Icons.Filled.FilterAlt,
                            "Filters",
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
            // ==================== Search Bar ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 10.dp),
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
                    placeholder = { Text("جستجوی کتاب، نویسنده...", fontSize = 13.sp) },
                    leadingIcon = { Icon(Icons.Filled.Search, null, tint = PrimaryColor) },
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

            // ==================== Stats Cards ====================
            AnimatedVisibility(
                visible = showStats && searchQuery.isEmpty() && selectedCategory == null,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    item {
                        StatCard(
                            icon = "📚",
                            value = "${allBooks.size}",
                            label = "کل کتاب‌ها",
                            color = 0xFF6A1B9A
                        )
                    }
                    item {
                        StatCard(
                            icon = "📝",
                            value = "${BookRepository.getCountByCategory(BookCategory.GRAMMAR)}",
                            label = "گرامر",
                            color = 0xFF00695C
                        )
                    }
                    item {
                        StatCard(
                            icon = "💬",
                            value = "${BookRepository.getCountByCategory(BookCategory.CONVERSATION)}",
                            label = "مکالمه",
                            color = 0xFF1976D2
                        )
                    }
                    item {
                        StatCard(
                            icon = "❤️",
                            value = "${favoriteBooks.size}",
                            label = "علاقه‌مندی",
                            color = 0xFFE91E63
                        )
                    }
                }
            }

            Spacer(Modifier.height(10.dp))

            // ==================== Filter Panel ====================
            AnimatedVisibility(
                visible = showFilters,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column {
                    // Categories
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        item {
                            FilterChip(
                                selected = selectedCategory == null,
                                onClick = { selectedCategory = null },
                                label = { Text("✨ همه", fontSize = 11.sp) },
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
                                        fontSize = 11.sp
                                    )
                                },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = Color(category.color),
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }

                    Spacer(Modifier.height(6.dp))

                    // Levels
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        item {
                            FilterChip(
                                selected = selectedLevel == null,
                                onClick = { selectedLevel = null },
                                label = { Text("🎯 همه سطوح", fontSize = 11.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = PrimaryColor,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                        items(listOf("مبتدی", "متوسط", "پیشرفته")) { level ->
                            FilterChip(
                                selected = selectedLevel == level,
                                onClick = {
                                    selectedLevel =
                                        if (selectedLevel == level) null else level
                                },
                                label = {
                                    Text(
                                        "${levelEmoji(level)} $level",
                                        fontSize = 11.sp
                                    )
                                },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = Color(0xFF00897B),
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                }
            }

            // ==================== Continue Reading ====================
            if (recentBookList.isNotEmpty() && searchQuery.isEmpty() && selectedCategory == null) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("🕐", fontSize = 14.sp)
                        Spacer(Modifier.width(6.dp))
                        Text(
                            "اخیراً دیده‌شده",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A1A2E)
                        )
                    }
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(recentBookList.take(5)) { book ->
                            RecentBookCard(book = book, onClick = {
                                onBookClick(book.id)
                            })
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                }
            }

            // ==================== Favorites ====================
            if (favoriteBookList.isNotEmpty() && searchQuery.isEmpty() && selectedCategory == null) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("❤️", fontSize = 14.sp)
                        Spacer(Modifier.width(6.dp))
                        Text(
                            "علاقه‌مندی‌ها",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A1A2E)
                        )
                    }
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(favoriteBookList.take(5)) { book ->
                            RecentBookCard(book = book, onClick = {
                                onBookClick(book.id)
                            })
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                }
            }

            // ==================== Main Content ====================
            if (filteredBooks.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("📭", fontSize = 64.sp)
                        Spacer(Modifier.height(16.dp))
                        Text("کتابی یافت نشد", fontSize = 15.sp, color = Color.Gray)
                        Spacer(Modifier.height(8.dp))
                        OutlinedButton(
                            onClick = {
                                searchQuery = ""
                                selectedCategory = null
                                selectedLevel = null
                            }
                        ) {
                            Text("پاک کردن فیلترها", fontSize = 12.sp)
                        }
                    }
                }
            } else {
                when (viewMode) {
                    ViewMode.GROUPED -> GroupedView(
                        groupedSeries = groupedSeries,
                        expandedSeries = expandedSeries,
                        favoriteBooks = favoriteBooks,
                        onBookClick = { id ->
                            if (id !in recentlyViewed) {
                                recentlyViewed.add(0, id)
                                if (recentlyViewed.size > 10) recentlyViewed.removeAt(10)
                            }
                            onBookClick(id)
                        },
                        onFavoriteToggle = { id ->
                            if (favoriteBooks.contains(id)) favoriteBooks.remove(id)
                            else favoriteBooks.add(id)
                        }
                    )
                    ViewMode.GRID -> GridView(
                        books = filteredBooks,
                        onBookClick = onBookClick,
                        favoriteBooks = favoriteBooks
                    )
                    ViewMode.LIST -> ListView(
                        books = filteredBooks,
                        onBookClick = onBookClick,
                        favoriteBooks = favoriteBooks,
                        onFavoriteToggle = { id ->
                            if (favoriteBooks.contains(id)) favoriteBooks.remove(id)
                            else favoriteBooks.add(id)
                        }
                    )
                    ViewMode.COMPACT -> CompactView(
                        books = filteredBooks,
                        onBookClick = onBookClick
                    )
                }
            }
        }
    }
}

// ============================================================
// Grouped View
// ============================================================
@Composable
private fun GroupedView(
    groupedSeries: List<BookSeries>,
    expandedSeries: MutableMap<String, Boolean>,
    favoriteBooks: List<String>,
    onBookClick: (String) -> Unit,
    onFavoriteToggle: (String) -> Unit
) {
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
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { expandedSeries[series.name] = !isExpanded }
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

                    AnimatedVisibility(visible = isExpanded) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            series.books.forEach { book ->
                                BookRowItem(
                                    book = book,
                                    isFavorite = book.id in favoriteBooks,
                                    onClick = { onBookClick(book.id) },
                                    onFavoriteToggle = { onFavoriteToggle(book.id) }
                                )
                            }
                        }
                    }
                }
            }
        }
        item { Spacer(Modifier.height(20.dp)) }
    }
}

// ============================================================
// Grid View
// ============================================================
@Composable
private fun GridView(
    books: List<Book>,
    onBookClick: (String) -> Unit,
    favoriteBooks: List<String>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(books, key = { it.id }) { book ->
            BookCard(
                book = book,
                isFavorite = book.id in favoriteBooks,
                onClick = { onBookClick(book.id) }
            )
        }
    }
}

// ============================================================
// List View
// ============================================================
@Composable
private fun ListView(
    books: List<Book>,
    onBookClick: (String) -> Unit,
    favoriteBooks: List<String>,
    onFavoriteToggle: (String) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(books, key = { it.id }) { book ->
            ListBookItem(
                book = book,
                isFavorite = book.id in favoriteBooks,
                onClick = { onBookClick(book.id) },
                onFavoriteToggle = { onFavoriteToggle(book.id) }
            )
        }
    }
}

// ============================================================
// Compact View
// ============================================================
@Composable
private fun CompactView(
    books: List<Book>,
    onBookClick: (String) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(books, key = { it.id }) { book ->
            CompactBookCard(book = book, onClick = { onBookClick(book.id) })
        }
    }
}

// ============================================================
// Stat Card
// ============================================================
@Composable
private fun StatCard(icon: String, value: String, label: String, color: Long) {
    Card(
        modifier = Modifier.width(100.dp),
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(icon, fontSize = 20.sp)
            Spacer(Modifier.height(4.dp))
            Text(
                value,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(color)
            )
            Text(
                label,
                fontSize = 10.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}

// ============================================================
// Recent Book Card (Horizontal)
// ============================================================
@Composable
private fun RecentBookCard(book: Book, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(
                        Brush.linearGradient(
                            listOf(Color(book.gradientStart), Color(book.gradientEnd))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(book.category.emoji, fontSize = 26.sp)
            }
            Column(modifier = Modifier.padding(6.dp)) {
                Text(
                    book.title,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = Color(0xFF1A1A2E)
                )
                Text(
                    book.titlePersian,
                    fontSize = 9.sp,
                    color = PrimaryColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

// ============================================================
// Book Row Item (برای Grouped)
// ============================================================
@Composable
private fun BookRowItem(
    book: Book,
    isFavorite: Boolean,
    onClick: () -> Unit,
    onFavoriteToggle: () -> Unit
) {
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
            Box(
                modifier = Modifier
                    .size(46.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(Color(book.gradientStart), Color(book.gradientEnd))
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
                    Text("${book.levelEmoji} ${book.level}", fontSize = 10.sp, color = Color.Gray)
                    Spacer(Modifier.width(8.dp))
                    Text("• ${book.totalChapters} فصل", fontSize = 10.sp, color = Color.Gray)
                }
            }

            IconButton(onClick = onFavoriteToggle) {
                Icon(
                    if (isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                    "Favorite",
                    tint = if (isFavorite) Color(0xFFE91E63) else Color.Gray,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

// ============================================================
// List Book Item
// ============================================================
@Composable
private fun ListBookItem(
    book: Book,
    isFavorite: Boolean,
    onClick: () -> Unit,
    onFavoriteToggle: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(Color(book.gradientStart), Color(book.gradientEnd))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(book.category.emoji, fontSize = 26.sp)
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    book.title,
                    fontSize = 14.sp,
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
                Text(
                    book.author,
                    fontSize = 10.sp,
                    color = Color.Gray,
                    maxLines = 1
                )
                Spacer(Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("${book.levelEmoji} ${book.level}", fontSize = 10.sp, color = Color.Gray)
                    Spacer(Modifier.width(8.dp))
                    Text("• ${book.totalChapters} فصل", fontSize = 10.sp, color = Color.Gray)
                }
            }

            IconButton(onClick = onFavoriteToggle) {
                Icon(
                    if (isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                    "Favorite",
                    tint = if (isFavorite) Color(0xFFE91E63) else Color.Gray,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

// ============================================================
// Book Card (Grid)
// ============================================================
@Composable
private fun BookCard(
    book: Book,
    isFavorite: Boolean,
    onClick: () -> Unit
) {
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
                    .height(150.dp)
                    .background(
                        Brush.linearGradient(
                            listOf(Color(book.gradientStart), Color(book.gradientEnd))
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
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(book.category.emoji, fontSize = 24.sp)
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        book.title,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        lineHeight = 14.sp
                    )
                }

                // Level badge
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(6.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color.White.copy(alpha = 0.3f))
                        .padding(horizontal = 5.dp, vertical = 2.dp)
                ) {
                    Text(book.levelEmoji, fontSize = 11.sp)
                }

                // Favorite badge
                if (isFavorite) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(6.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFE91E63))
                            .padding(4.dp)
                    ) {
                        Icon(
                            Icons.Filled.Favorite,
                            null,
                            tint = Color.White,
                            modifier = Modifier.size(10.dp)
                        )
                    }
                }
            }

            Column(modifier = Modifier.padding(10.dp)) {
                Text(
                    book.titlePersian,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Filled.MenuBook,
                        null,
                        tint = Color(book.gradientStart),
                        modifier = Modifier.size(11.dp)
                    )
                    Spacer(Modifier.width(3.dp))
                    Text(
                        "${book.totalChapters} فصل",
                        fontSize = 9.sp,
                        color = Color(book.gradientStart),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

// ============================================================
// Compact Book Card
// ============================================================
@Composable
private fun CompactBookCard(book: Book, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(0.75f)
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(
                        Brush.linearGradient(
                            listOf(Color(book.gradientStart), Color(book.gradientEnd))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(book.category.emoji, fontSize = 28.sp)
            }
            Column(modifier = Modifier.padding(6.dp)) {
                Text(
                    book.title,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    color = Color(0xFF1A1A2E),
                    lineHeight = 11.sp
                )
            }
        }
    }
}

// ============================================================
// Helper Functions
// ============================================================
private fun levelEmoji(level: String): String = when (level) {
    "مبتدی" -> "🌱"
    "متوسط" -> "🚀"
    "پیشرفته" -> "🏆"
    else -> "📘"
}

private fun levelOrder(level: String): Int = when (level) {
    "مبتدی" -> 1
    "متوسط" -> 2
    "پیشرفته" -> 3
    else -> 4
}

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