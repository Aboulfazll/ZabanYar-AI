package com.zabanyar.ai.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.zabanyar.ai.data.DialogueLine
import com.zabanyar.ai.data.LessonContent
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.VocabWord

private val PrimaryColor = Color(0xFF1A237E)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(
    lesson: LessonContent,
    bookCover: String = "",
    bookTitle: String = "",
    onBack: () -> Unit = {}
) {
    val context = LocalContext.current

    // 👈 استیت نمایش ترجمه (از ProgressManager خونده می‌شه و ذخیره می‌شه)
    var showTranslation by remember { mutableStateOf(ProgressManager.isShowTranslation(context)) }

    // 👈 استیت علاقه‌مندی
    var isFavorite by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            lesson.title,
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                        Text(
                            lesson.titlePersian,
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 11.sp,
                            maxLines = 1
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                actions = {
                    // ✅ دکمه سریع نمایش/مخفی ترجمه
                    IconButton(
                        onClick = {
                            showTranslation = !showTranslation
                            ProgressManager.setShowTranslation(context, showTranslation)
                        }
                    ) {
                        Icon(
                            imageVector = if (showTranslation) Icons.Filled.Translate
                            else Icons.Filled.GTranslate,
                            contentDescription = "Toggle Translation",
                            tint = if (showTranslation) Color(0xFFFFD54F)
                            else Color.White.copy(alpha = 0.6f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = PrimaryColor)
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FC))
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {

            // ==================== کارت هدر با عکس کاور + دکمه + ====================
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // عکس کاور با دکمه +
                        Box(
                            modifier = Modifier
                                .size(110.dp, 150.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFFE0E0E0))
                        ) {
                            if (bookCover.isNotEmpty()) {
                                AsyncImage(
                                    model = bookCover,
                                    contentDescription = bookTitle,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxSize()
                                )
                            } else {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.linearGradient(
                                                listOf(PrimaryColor, Color(0xFF3949AB))
                                            )
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        Icons.Filled.MenuBook,
                                        null,
                                        tint = Color.White,
                                        modifier = Modifier.size(40.dp)
                                    )
                                }
                            }

                            // ✅ دکمه + در گوشه پایین راست
                            Box(
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(6.dp)
                                    .size(38.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(Color.White)
                                    .clickable { isFavorite = !isFavorite },
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = if (isFavorite) Icons.Filled.Check
                                    else Icons.Filled.Add,
                                    contentDescription = "Save",
                                    tint = if (isFavorite) Color(0xFF4CAF50)
                                    else Color(0xFF1A237E),
                                    modifier = Modifier.size(22.dp)
                                )
                            }
                        }

                        Spacer(Modifier.width(14.dp))

                        // اطلاعات درس
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "درس ${lesson.chapterNumber}",
                                fontSize = 11.sp,
                                color = Color(0xFF3F51B5),
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                lesson.title,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E),
                                maxLines = 2
                            )
                            Text(
                                lesson.titlePersian,
                                fontSize = 13.sp,
                                color = Color.Gray,
                                maxLines = 2
                            )
                            Spacer(Modifier.height(8.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    Icons.Filled.School,
                                    null,
                                    tint = Color(0xFF009688),
                                    modifier = Modifier.size(14.dp)
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    "${lesson.vocabulary.size} کلمه • ${lesson.conversation.size} دیالوگ",
                                    fontSize = 11.sp,
                                    color = Color(0xFF009688)
                                )
                            }
                        }
                    }
                }
            }

            // ==================== اهداف درس ====================
            if (lesson.objectives.isNotEmpty()) {
                item {
                    LessonSectionCard(
                        icon = Icons.Filled.Flag,
                        iconColor = Color(0xFFE91E63),
                        title = "اهداف درس"
                    ) {
                        lesson.objectives.forEach { objective ->
                            Row(
                                modifier = Modifier.padding(vertical = 3.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(6.dp)
                                        .clip(RoundedCornerShape(3.dp))
                                        .background(Color(0xFFE91E63))
                                )
                                Spacer(Modifier.width(8.dp))
                                Text(objective, fontSize = 13.sp, color = Color(0xFF1A237E))
                            }
                        }
                    }
                }
            }

            // ==================== واژگان ====================
            if (lesson.vocabulary.isNotEmpty()) {
                item {
                    LessonSectionCard(
                        icon = Icons.Filled.MenuBook,
                        iconColor = Color(0xFF3F51B5),
                        title = "واژگان (${lesson.vocabulary.size} کلمه)"
                    ) {
                        lesson.vocabulary.forEach { word ->
                            VocabItem(word = word, showTranslation = showTranslation)
                            Spacer(Modifier.height(10.dp))
                        }
                    }
                }
            }

            // ==================== مکالمه ====================
            if (lesson.conversation.isNotEmpty()) {
                item {
                    LessonSectionCard(
                        icon = Icons.Filled.Chat,
                        iconColor = Color(0xFF009688),
                        title = "مکالمه"
                    ) {
                        lesson.conversation.forEach { line ->
                            DialogueItem(line = line, showTranslation = showTranslation)
                            Spacer(Modifier.height(8.dp))
                        }
                    }
                }
            }

            // ==================== اصطلاحات ====================
            if (lesson.idioms.isNotEmpty()) {
                item {
                    LessonSectionCard(
                        icon = Icons.Filled.Lightbulb,
                        iconColor = Color(0xFFFF9800),
                        title = "اصطلاحات (${lesson.idioms.size})"
                    ) {
                        lesson.idioms.forEach { idiom ->
                            Column(modifier = Modifier.padding(vertical = 6.dp)) {
                                Text(
                                    idiom.english,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF1A237E)
                                )
                                if (showTranslation) {
                                    Text(idiom.persian, fontSize = 12.sp, color = Color.Gray)
                                }
                                Spacer(Modifier.height(3.dp))
                                Text(
                                    "مثال: ${idiom.example}",
                                    fontSize = 11.sp,
                                    color = Color(0xFF3F51B5)
                                )
                            }
                        }
                    }
                }
            }

            item { Spacer(Modifier.height(16.dp)) }
        }
    }
}

// ==================== کارت بخش‌ها ====================
@Composable
fun LessonSectionCard(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(iconColor.copy(alpha = 0.15f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(icon, null, tint = iconColor, modifier = Modifier.size(20.dp))
                }
                Spacer(Modifier.width(10.dp))
                Text(title, fontWeight = FontWeight.Bold, fontSize = 15.sp, color = PrimaryColor)
            }
            Spacer(Modifier.height(12.dp))
            content()
        }
    }
}

// ==================== آیتم واژه با ترجمه شرطی ====================
@Composable
fun VocabItem(word: VocabWord, showTranslation: Boolean) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F7FA))
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    word.english,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color(0xFF3F51B5).copy(alpha = 0.15f))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        word.partOfSpeech,
                        fontSize = 9.sp,
                        color = Color(0xFF3F51B5),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Text(
                word.pronunciation,
                fontSize = 11.sp,
                color = Color(0xFF009688),
                fontStyle = FontStyle.Italic
            )

            // ✅ ترجمه فقط وقتی نمایش داده می‌شه که دکمه روشن باشه
            AnimatedVisibility(visible = showTranslation) {
                Column {
                    Spacer(Modifier.height(4.dp))
                    Text(word.persian, fontSize = 13.sp, color = Color.Gray)
                    Spacer(Modifier.height(4.dp))
                    Text(
                        "مثال: ${word.example}",
                        fontSize = 11.sp,
                        color = Color(0xFF3F51B5)
                    )
                    Text(
                        word.examplePersian,
                        fontSize = 11.sp,
                        color = Color.Gray,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}

// ==================== آیتم مکالمه با ترجمه شرطی ====================
@Composable
fun DialogueItem(line: DialogueLine, showTranslation: Boolean) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top) {
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFF009688).copy(alpha = 0.15f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                line.speaker,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF009688)
            )
        }
        Spacer(Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                line.english,
                fontSize = 14.sp,
                color = Color(0xFF1A237E),
                fontWeight = FontWeight.Medium
            )
            // ✅ ترجمه شرطی
            AnimatedVisibility(visible = showTranslation) {
                Text(
                    line.persian,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}