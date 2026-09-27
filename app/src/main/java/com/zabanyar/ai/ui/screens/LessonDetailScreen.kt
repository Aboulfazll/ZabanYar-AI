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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.DialogueLine
import com.zabanyar.ai.data.LessonContent
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.SpeechHelper
import com.zabanyar.ai.data.VocabWord
import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryParagraph
import com.zabanyar.ai.data.books.story.StoryRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(
    lesson: LessonContent? = null,
    storyChapter: StoryChapter? = null,
    bookTitle: String = "",
    bookCoverGradientStart: Long = 0xFF1A237E,
    bookCoverGradientEnd: Long = 0xFF3949AB,
    bookId: String = "",
    onBack: () -> Unit = {}
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose {
            speechHelper.stop()
            speechHelper.shutdown()
        }
    }

    val book = remember(bookId) {
        if (bookId.isEmpty()) null
        else BookRepository.getBookById(bookId)
            ?: StoryRepository.getStoryById(bookId)
    }

    var showTranslation by remember { mutableStateOf(ProgressManager.isShowTranslation(context)) }
    val isStory = storyChapter != null

    val chapterNumber = storyChapter?.number ?: lesson?.chapterNumber ?: 1
    val title = storyChapter?.title ?: lesson?.title ?: ""
    val titlePersian = storyChapter?.titlePersian ?: lesson?.titlePersian ?: ""

    val tabs = buildList {
        if (lesson != null) {
            if (lesson.objectives.isNotEmpty()) add("اهداف")
            if (lesson.vocabulary.isNotEmpty()) add("واژگان")
            if (lesson.conversation.isNotEmpty()) add("مکالمه")
            if (lesson.idioms.isNotEmpty()) add("اصطلاحات")
        }
    }
    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            if (isStory) "فصل $chapterNumber: $title" else title,
                            color = Color.White, fontSize = 15.sp,
                            fontWeight = FontWeight.Bold, maxLines = 1
                        )
                        Text(
                            titlePersian,
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 11.sp, maxLines = 1
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
                        speechHelper.stop()
                        onBack()
                    }) {
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FC))
                .padding(padding)
        ) {

            HeaderCard(
                book = book,
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

            // ═══════════════════════════════════════
            //  🎬 داستان
            // ═══════════════════════════════════════
            if (isStory && storyChapter != null) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    item {
                        StoryAudioCard(
                            chapter = storyChapter,
                            gradientStart = bookCoverGradientStart,
                            gradientEnd = bookCoverGradientEnd,
                            speechHelper = speechHelper
                        )
                    }
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
                    items(storyChapter.paragraphs) { paragraph ->
                        StoryParagraphCard(
                            paragraph = paragraph,
                            showTranslation = showTranslation,
                            accentColor = Color(bookCoverGradientStart),
                            speechHelper = speechHelper
                        )
                    }
                }
            }

            // ═══════════════════════════════════════
            //  📚 درس — با تب
            // ═══════════════════════════════════════
            else if (lesson != null) {

                if (tabs.isNotEmpty()) {
                    TabRow(
                        selectedTabIndex = selectedTab.coerceIn(0, tabs.size - 1),
                        containerColor = Color.White,
                        contentColor = PrimaryColor
                    ) {
                        tabs.forEachIndexed { index, tabTitle ->
                            Tab(
                                selected = selectedTab == index,
                                onClick = {
                                    speechHelper.stop()
                                    selectedTab = index
                                },
                                text = {
                                    Text(
                                        tabTitle,
                                        fontSize = 13.sp,
                                        fontWeight = if (selectedTab == index) FontWeight.Bold
                                        else FontWeight.Normal
                                    )
                                }
                            )
                        }
                    }
                }

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    when (tabs.getOrNull(selectedTab)) {

                        "اهداف" -> {
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

                        "واژگان" -> {
                            item {
                                PlayAllCard(
                                    title = "پخش کل واژگان",
                                    subtitle = "${lesson.vocabulary.size} کلمه",
                                    gradientStart = bookCoverGradientStart,
                                    gradientEnd = bookCoverGradientEnd,
                                    onPlayAll = {
                                        val fullText = lesson.vocabulary.joinToString(". ") { it.english }
                                        speechHelper.speak(fullText)
                                    }
                                )
                            }
                            items(lesson.vocabulary) { word ->
                                VocabItem(
                                    word = word,
                                    showTranslation = showTranslation,
                                    speechHelper = speechHelper
                                )
                            }
                        }

                        "مکالمه" -> {
                            item {
                                PlayAllCard(
                                    title = "پخش کل مکالمه",
                                    subtitle = "${lesson.conversation.size} دیالوگ",
                                    gradientStart = bookCoverGradientStart,
                                    gradientEnd = bookCoverGradientEnd,
                                    onPlayAll = {
                                        val fullText = lesson.conversation.joinToString(". ") { it.english }
                                        speechHelper.speak(fullText)
                                    }
                                )
                            }
                            items(lesson.conversation) { line ->
                                DialogueItem(
                                    line = line,
                                    showTranslation = showTranslation,
                                    speechHelper = speechHelper
                                )
                            }
                        }

                        "اصطلاحات" -> {
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

                        else -> {
                            item {
                                Box(
                                    modifier = Modifier.fillMaxWidth().padding(40.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("محتوایی یافت نشد", color = Color.Gray)
                                }
                            }
                        }
                    }

                    item { Spacer(Modifier.height(16.dp)) }
                }
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  کارت «پخش کل»
// ═══════════════════════════════════════════════════════
@Composable
fun PlayAllCard(
    title: String,
    subtitle: String,
    gradientStart: Long,
    gradientEnd: Long,
    onPlayAll: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(3.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(listOf(Color(gradientStart), Color(gradientEnd))))
                    .clickable { onPlayAll() },
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Filled.PlayArrow, "پخش کل", tint = Color.White, modifier = Modifier.size(28.dp))
            }
            Spacer(Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(title, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                Text(subtitle, fontSize = 11.sp, color = Color.Gray)
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  کارت هدر جدید
// ═══════════════════════════════════════════════════════
@Composable
fun HeaderCard(
    book: Book?,
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
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(gradientStart).copy(alpha = 0.15f),
                        Color(0xFFFAF3E6)
                    )
                )
            )
            .padding(horizontal = 20.dp, vertical = 20.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // ─── عکس کتاب بالا-راست ───
            Box(
                modifier = Modifier
                    .align(Alignment.End)
                    .size(80.dp, 110.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Brush.linearGradient(listOf(Color(gradientStart), Color(gradientEnd))))
            ) {
                if (book != null) {
                    BookCoverImage(
                        book = book,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(if (isStory) "📖" else "📕", fontSize = 32.sp)
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // ─── نام کتاب ───
            if (bookTitle.isNotEmpty()) {
                Text(
                    bookTitle,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    textAlign = TextAlign.Center
                )
                Spacer(Modifier.height(3.dp))
            }

            // ─── نویسنده (اصلاح‌شده) ───
            val author = book?.author
            if (!author.isNullOrEmpty()) {
                Text(
                    author,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )
                Spacer(Modifier.height(3.dp))
            }

            // ─── لهجه ───
            Text(
                "🇺🇸 لهجه آمریکایی",
                fontSize = 11.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(24.dp))

            // ─── Chapter N ───
            Text(
                "Chapter $chapterNumber",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3949AB),
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(4.dp))

            // ─── فصل N ───
            Text(
                "فصل $chapterNumber",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3949AB),
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(20.dp))

            // ─── عنوان فصل انگلیسی ───
            Text(
                title,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E),
                textAlign = TextAlign.Center,
                lineHeight = 34.sp
            )

            // ─── عنوان فصل فارسی ───
            if (titlePersian.isNotEmpty()) {
                Spacer(Modifier.height(6.dp))
                Text(
                    titlePersian,
                    fontSize = 18.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )
            }

            // ─── اطلاعات ───
            Spacer(Modifier.height(12.dp))
            Text(
                if (isStory) "$storyParagraphCount خط"
                else "$vocabCount کلمه • $dialogueCount دیالوگ",
                fontSize = 11.sp,
                color = Color(0xFF009688),
                textAlign = TextAlign.Center
            )
        }
    }
}

// ═══════════════════════════════════════════════════════
//  Story Audio Card
// ═══════════════════════════════════════════════════════
@Composable
fun StoryAudioCard(
    chapter: StoryChapter,
    gradientStart: Long,
    gradientEnd: Long,
    speechHelper: SpeechHelper
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(3.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(listOf(Color(gradientStart), Color(gradientEnd))))
                    .clickable {
                        val fullText = chapter.paragraphs.joinToString(" ") { it.english }
                        speechHelper.speak(fullText)
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Filled.PlayArrow, "پخش کل داستان", tint = Color.White, modifier = Modifier.size(28.dp))
            }
            Spacer(Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text("پخش کل فصل", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                Text("${chapter.paragraphs.size} خط • گوش دادن", fontSize = 11.sp, color = Color.Gray)
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  Story Paragraph Card
// ═══════════════════════════════════════════════════════
@Composable
fun StoryParagraphCard(
    paragraph: StoryParagraph,
    showTranslation: Boolean,
    accentColor: Color,
    speechHelper: SpeechHelper
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(paragraph.english, fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color(0xFF1A237E), lineHeight = 22.sp)
                if (showTranslation && paragraph.persian.isNotEmpty()) {
                    Spacer(Modifier.height(6.dp))
                    Text(paragraph.persian, fontSize = 13.sp, color = Color.Gray, fontStyle = FontStyle.Italic, lineHeight = 20.sp)
                }
            }
            Spacer(Modifier.width(8.dp))
            IconButton(
                onClick = { speechHelper.speak(paragraph.english) },
                modifier = Modifier.size(36.dp).clip(CircleShape).background(accentColor.copy(alpha = 0.12f))
            ) {
                Icon(Icons.Filled.VolumeUp, "پخش", tint = accentColor, modifier = Modifier.size(18.dp))
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  Lesson Section Card
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
//  VocabItem
// ═══════════════════════════════════════════════════════
@Composable
fun VocabItem(
    word: VocabWord,
    showTranslation: Boolean,
    speechHelper: SpeechHelper
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(word.english, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
                    Spacer(Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(0xFF3F51B5).copy(alpha = 0.15f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(word.partOfSpeech, fontSize = 9.sp, color = Color(0xFF3F51B5), fontWeight = FontWeight.Bold)
                    }
                }
                Text(word.pronunciation, fontSize = 11.sp, color = Color(0xFF009688), fontStyle = FontStyle.Italic)
                AnimatedVisibility(visible = showTranslation) {
                    Column {
                        Spacer(Modifier.height(4.dp))
                        Text(word.persian, fontSize = 13.sp, color = Color.Gray)
                        Spacer(Modifier.height(4.dp))
                        Text("مثال: ${word.example}", fontSize = 11.sp, color = Color(0xFF3F51B5))
                        Text(word.examplePersian, fontSize = 11.sp, color = Color.Gray, fontStyle = FontStyle.Italic)
                    }
                }
            }
            Spacer(Modifier.width(8.dp))
            IconButton(
                onClick = { speechHelper.speak(word.english) },
                modifier = Modifier.size(32.dp).clip(CircleShape).background(Color(0xFF3F51B5).copy(alpha = 0.12f))
            ) {
                Icon(Icons.Filled.VolumeUp, "پخش", tint = Color(0xFF3F51B5), modifier = Modifier.size(16.dp))
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  DialogueItem
// ═══════════════════════════════════════════════════════
@Composable
fun DialogueItem(
    line: DialogueLine,
    showTranslation: Boolean,
    speechHelper: SpeechHelper
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFF009688).copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Text(line.speaker, fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color(0xFF009688))
            }
            Spacer(Modifier.width(10.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(line.english, fontSize = 14.sp, color = Color(0xFF1A237E), fontWeight = FontWeight.Medium)
                AnimatedVisibility(visible = showTranslation) {
                    Text(line.persian, fontSize = 12.sp, color = Color.Gray, fontStyle = FontStyle.Italic)
                }
            }
            Spacer(Modifier.width(8.dp))
            IconButton(
                onClick = { speechHelper.speak(line.english) },
                modifier = Modifier.size(30.dp).clip(CircleShape).background(Color(0xFF009688).copy(alpha = 0.12f))
            ) {
                Icon(Icons.Filled.VolumeUp, "پخش", tint = Color(0xFF009688), modifier = Modifier.size(14.dp))
            }
        }
    }
}