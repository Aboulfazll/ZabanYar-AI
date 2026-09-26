package com.zabanyar.ai.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.DialogueLine
import com.zabanyar.ai.data.LessonContent
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.SpeechHelper
import com.zabanyar.ai.data.VocabWord
import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryParagraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(
    lesson: LessonContent? = null,
    storyChapter: StoryChapter? = null,
    bookTitle: String = "",
    bookCoverGradientStart: Long = 0xFF1A237E,
    bookCoverGradientEnd: Long = 0xFF3949AB,
    onBack: () -> Unit = {}
) {
    val context = LocalContext.current

    var showTranslation by remember { mutableStateOf(ProgressManager.isShowTranslation(context)) }

    val isStory = storyChapter != null

    // ─── عنوان‌ها ───
    val chapterNumber = storyChapter?.number ?: lesson?.chapterNumber ?: 1
    val title = storyChapter?.title ?: lesson?.title ?: ""
    val titlePersian = storyChapter?.titlePersian ?: lesson?.titlePersian ?: ""

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            if (isStory) "فصل $chapterNumber: $title" else title,
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                        Text(
                            titlePersian,
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

            // ═══════════════════════════════════════════════════
            //  کارت هدر
            // ═══════════════════════════════════════════════════
            item {
                HeaderCard(
                    bookTitle = bookTitle,
                    chapterNumber = chapterNumber,
                    title = title,
                    titlePersian = titlePersian,
                    gradientStart = bookCoverGradientStart,
                    gradientEnd = bookCoverGradientEnd,
                    isStory = isStory,
                    vocabCount = lesson?.vocabulary?.size ?: 0,
                    dialogueCount = lesson?.conversation?.size ?: 0,
                    storyParagraphCount = storyChapter?.paragraphs?.size ?: 0
                )
            }

            // ═══════════════════════════════════════════════════
            //  📖 اگر داستان باشه → محتوای داستان
            // ═══════════════════════════════════════════════════
            if (isStory && storyChapter != null) {

                // دکمه پخش کل داستان
                item {
                    StoryAudioCard(
                        chapter = storyChapter,
                        gradientStart = bookCoverGradientStart,
                        gradientEnd = bookCoverGradientEnd
                    )
                }

                // عنوان بخش
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(4.dp, 20.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(Color(bookCoverGradientStart))
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "📖 متن داستان (${storyChapter.paragraphs.size} خط)",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                    }
                }

                // پاراگراف‌ها
                items(storyChapter.paragraphs) { paragraph ->
                    StoryParagraphCard(
                        paragraph = paragraph,
                        showTranslation = showTranslation,
                        accentColor = Color(bookCoverGradientStart)
                    )
                }
            }

            // ═══════════════════════════════════════════════════
            //  📚 اگر کتاب معمولی باشه → محتوای درس
            // ═══════════════════════════════════════════════════
            if (!isStory && lesson != null) {

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
            }

            item { Spacer(Modifier.height(16.dp)) }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  کارت هدر
// ═══════════════════════════════════════════════════════
@Composable
fun HeaderCard(
    bookTitle: String,
    chapterNumber: Int,
    title: String,
    titlePersian: String,
    gradientStart: Long,
    gradientEnd: Long,
    isStory: Boolean,
    vocabCount: Int,
    dialogueCount: Int,
    storyParagraphCount: Int
) {
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
            Box(
                modifier = Modifier
                    .size(110.dp, 150.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(gradientStart),
                                Color(gradientEnd)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        if (isStory) Icons.Filled.AutoStories else Icons.Filled.MenuBook,
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        if (isStory) "فصل $chapterNumber" else "درس $chapterNumber",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                if (bookTitle.isNotEmpty()) {
                    Text(
                        bookTitle,
                        fontSize = 10.sp,
                        color = Color(0xFF3F51B5),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(2.dp))
                }
                Text(
                    if (isStory) "فصل $chapterNumber" else "درس $chapterNumber",
                    fontSize = 11.sp,
                    color = Color(0xFF3F51B5),
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    maxLines = 2
                )
                Text(
                    titlePersian,
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
                        if (isStory) "$storyParagraphCount خط"
                        else "$vocabCount کلمه • $dialogueCount دیالوگ",
                        fontSize = 11.sp,
                        color = Color(0xFF009688)
                    )
                }
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  کارت پخش کل داستان
// ═══════════════════════════════════════════════════════
@Composable
fun StoryAudioCard(
    chapter: StoryChapter,
    gradientStart: Long,
    gradientEnd: Long
) {
    val context = LocalContext.current

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(3.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.linearGradient(
                            listOf(Color(gradientStart), Color(gradientEnd))
                        )
                    )
                    .clickable {
                        val fullText = chapter.paragraphs.joinToString(" ") { it.english }
                        SpeechHelper.speak(context, fullText)
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.PlayArrow,
                    "پخش کل داستان",
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
            Spacer(Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    "پخش کل فصل",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor
                )
                Text(
                    "${chapter.paragraphs.size} خط • گوش دادن",
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  کارت پاراگراف داستان
// ═══════════════════════════════════════════════════════
@Composable
fun StoryParagraphCard(
    paragraph: StoryParagraph,
    showTranslation: Boolean,
    accentColor: Color
) {
    val context = LocalContext.current

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    paragraph.english,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF1A237E),
                    lineHeight = 22.sp
                )

                if (showTranslation && paragraph.persian.isNotEmpty()) {
                    Spacer(Modifier.height(6.dp))
                    Text(
                        paragraph.persian,
                        fontSize = 13.sp,
                        color = Color.Gray,
                        fontStyle = FontStyle.Italic,
                        lineHeight = 20.sp
                    )
                }
            }

            Spacer(Modifier.width(8.dp))

            IconButton(
                onClick = {
                    SpeechHelper.speak(context, paragraph.english)
                },
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(accentColor.copy(alpha = 0.12f))
            ) {
                Icon(
                    Icons.Filled.VolumeUp,
                    "پخش",
                    tint = accentColor,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  کارت بخش‌های درس
// ═══════════════════════════════════════════════════════
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

// ═══════════════════════════════════════════════════════
//  آیتم واژه
// ═══════════════════════════════════════════════════════
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

// ═══════════════════════════════════════════════════════
//  آیتم مکالمه
// ═══════════════════════════════════════════════════════
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