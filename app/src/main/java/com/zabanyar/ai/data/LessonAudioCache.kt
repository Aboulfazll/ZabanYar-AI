package com.zabanyar.ai.ui.screens

import android.net.Uri
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
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
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.DialogueLine
import com.zabanyar.ai.data.LessonAudioCache
import com.zabanyar.ai.data.LessonContent
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.SpeechHelper
import com.zabanyar.ai.data.VocabWord
import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryParagraph
import com.zabanyar.ai.data.books.story.StoryRepository
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(
    lesson: LessonContent? = null,
    storyChapter: StoryChapter? = null,
    bookTitle: String = "",
    bookCoverGradientStart: Long = 0xFF1A237E,
    bookCoverGradientEnd: Long = 0xFF3949AB,
    bookId: String = "",
    onBack: () -> Unit = {},
    onChapterSelected: (Int) -> Unit = {}
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    // ─── TTS (برای داستان‌ها و کلمات تک) ───
    val speechHelper = remember { SpeechHelper(context) }

    // ─── ExoPlayer (برای MP3 درس‌ها) ───
    val exoPlayer = remember { ExoPlayer.Builder(context).build() }

    // ─── وضعیت دانلود ───
    var audioReady by remember { mutableStateOf(LessonAudioCache.isReady(context)) }
    var downloadProgress by remember { mutableStateOf(-1f) }
    var downloadError by remember { mutableStateOf<String?>(null) }

    // ─── دانلود و استخراج ZIP در اولین باز شدن ───
    LaunchedEffect(Unit) {
        if (!audioReady) {
            downloadProgress = 0f
            val result = withContext(kotlinx.coroutines.Dispatchers.IO) {
                LessonAudioCache.ensureDownloaded(context) { p ->
                    downloadProgress = p
                }
            }
            if (result) {
                audioReady = true
                downloadProgress = -1f
            } else {
                downloadError = "دانلود صداها ناموفق بود. با TTS پخش می‌شود."
                downloadProgress = -1f
            }
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            speechHelper.stop()
            speechHelper.shutdown()
            exoPlayer.release()
        }
    }

    val book = remember(bookId) {
        if (bookId.isEmpty()) null
        else BookRepository.getBookById(bookId) ?: StoryRepository.getStoryById(bookId)
    }

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var showTranslation by remember { mutableStateOf(ProgressManager.isShowTranslation(context)) }
    val isStory = storyChapter != null

    val chapterNumber = storyChapter?.number ?: lesson?.chapterNumber ?: 1
    val title = storyChapter?.title ?: lesson?.title ?: ""
    val titlePersian = storyChapter?.titlePersian ?: lesson?.titlePersian ?: ""

    val allChapters: List<StoryChapter> = remember(bookId) {
        if (bookId.isEmpty()) emptyList()
        else try { StoryRepository.getChapters(bookId) } catch (e: Exception) { emptyList() }
    }

    // ─── توابع پخش ───
    fun stopAll() {
        speechHelper.stop()
        exoPlayer.stop()
    }

    /**
     * برای درس‌ها: اگر MP3 موجود بود پخش کن، وگرنه TTS
     */
    fun speakOrPlayLesson(fallbackText: String) {
        if (audioReady && bookId.isNotEmpty()) {
            val file = LessonAudioCache.findLessonAudio(context, bookId, chapterNumber)
            if (file != null) {
                speechHelper.stop()
                exoPlayer.setMediaItem(MediaItem.fromUri(Uri.fromFile(file)))
                exoPlayer.prepare()
                exoPlayer.play()
                return
            }
        }
        speechHelper.speak(fallbackText)
    }

    // ═══════ State های خواندن خط به خط داستان ═══════
    var playingLineIndex by remember { mutableIntStateOf(-1) }
    val storyListState = rememberLazyListState()

    fun stopLinePlayback() {
        speechHelper.stop()
        playingLineIndex = -1
    }

    fun playLineFrom(index: Int) {
        if (storyChapter == null || index >= storyChapter.paragraphs.size) {
            playingLineIndex = -1
            return
        }
        playingLineIndex = index
        scope.launch {
            try { storyListState.animateScrollToItem(index + 2) } catch (_: Exception) {}
        }
        speechHelper.speak(storyChapter.paragraphs[index].english) {
            playLineFrom(index + 1)
        }
    }

    val tabs = buildList {
        if (lesson != null) {
            if (lesson.objectives.isNotEmpty()) add("اهداف")
            if (lesson.vocabulary.isNotEmpty()) add("واژگان")
            if (lesson.conversation.isNotEmpty()) add("مکالمه")
            if (lesson.idioms.isNotEmpty()) add("اصطلاحات")
        }
    }
    var selectedTab by remember { mutableIntStateOf(0) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.width(310.dp),
                drawerContainerColor = Color.White
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF0F2F5))
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (book != null) {
                        Box(
                            modifier = Modifier
                                .size(70.dp, 95.dp)
                                .clip(RoundedCornerShape(8.dp))
                        ) {
                            BookCoverImage(
                                book = book,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(Modifier.height(10.dp))
                    }
                    Text(
                        text = if (bookTitle.isNotEmpty()) bookTitle else title,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color(0xFF1A237E),
                        textAlign = TextAlign.Center
                    )
                    val author = book?.author
                    if (!author.isNullOrEmpty()) {
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = author,
                            fontSize = 12.sp,
                            color = Color.Gray,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Divider(color = Color(0xFFE0E0E0))
                Spacer(Modifier.height(4.dp))

                if (allChapters.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize().padding(20.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("فصلی یافت نشد", color = Color.Gray, fontSize = 13.sp)
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(bottom = 16.dp)
                    ) {
                        itemsIndexed(allChapters) { _, chapter ->
                            val isCurrent = chapter.number == chapterNumber
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(
                                        if (isCurrent) Color(0xFFE8EAF6) else Color.Transparent
                                    )
                                    .clickable {
                                        scope.launch { drawerState.close() }
                                        if (!isCurrent) {
                                            stopLinePlayback()
                                            stopAll()
                                            onChapterSelected(chapter.number)
                                        }
                                    }
                                    .padding(horizontal = 16.dp, vertical = 12.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "فصل ${chapter.number}",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isCurrent) Color(0xFF3949AB) else Color(0xFF1A237E)
                                )
                                Spacer(Modifier.height(4.dp))
                                Text(
                                    text = chapter.titlePersian.ifEmpty { chapter.title },
                                    fontSize = 12.sp,
                                    color = if (isCurrent) Color(0xFF3949AB) else Color(0xFF666666),
                                    textAlign = TextAlign.Center,
                                    maxLines = 2
                                )
                            }
                            Divider(color = Color(0xFFEEEEEE), thickness = 1.dp)
                        }
                    }
                }
            }
        }
    ) {
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
                            stopLinePlayback()
                            stopAll()
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
                        IconButton(onClick = {
                            scope.launch { drawerState.open() }
                        }) {
                            Icon(Icons.Filled.Menu, "منوی فصل‌ها", tint = Color.White)
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

                // ═══════ نوار وضعیت دانلود ═══════
                if (downloadProgress >= 0f) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFFFF8E1))
                            .padding(12.dp)
                    ) {
                        Text(
                            "🎧 در حال آماده‌سازی فایل‌های صوتی... ${(downloadProgress * 100).toInt()}%",
                            fontSize = 12.sp, color = Color(0xFFBF360C),
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(Modifier.height(6.dp))
                        LinearProgressIndicator(
                            progress = { downloadProgress },
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFF00695C)
                        )
                    }
                }
                if (downloadError != null) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFFFEBEE))
                            .padding(10.dp)
                    ) {
                        Text(downloadError!!, fontSize = 11.sp, color = Color(0xFFC62828))
                    }
                }

                CompactHeaderCard(
                    book = book,
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

                if (isStory && storyChapter != null) {
                    LazyColumn(
                        state = storyListState,
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(12.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        item {
                            StoryAudioCard(
                                chapter = storyChapter,
                                gradientStart = bookCoverGradientStart,
                                gradientEnd = bookCoverGradientEnd,
                                isPlayingAll = playingLineIndex >= 0,
                                onPlayAll = {
                                    if (playingLineIndex >= 0) stopLinePlayback()
                                    else playLineFrom(0)
                                }
                            )
                        }
                        item {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(4.dp, 18.dp)
                                        .clip(RoundedCornerShape(2.dp))
                                        .background(Color(bookCoverGradientStart))
                                )
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    "📖 متن داستان (${storyChapter.paragraphs.size} خط)",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryColor
                                )
                            }
                        }
                        itemsIndexed(storyChapter.paragraphs) { index, paragraph ->
                            StoryParagraphCard(
                                paragraph = paragraph,
                                showTranslation = showTranslation,
                                accentColor = Color(bookCoverGradientStart),
                                speechHelper = speechHelper,
                                isHighlighted = index == playingLineIndex,
                                onManualPlay = {
                                    stopLinePlayback()
                                    speechHelper.speak(paragraph.english)
                                }
                            )
                        }
                    }
                }

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
                                        stopAll()
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
                                        subtitle = if (audioReady) "${lesson.vocabulary.size} کلمه • MP3"
                                                   else "${lesson.vocabulary.size} کلمه • TTS",
                                        gradientStart = bookCoverGradientStart,
                                        gradientEnd = bookCoverGradientEnd,
                                        onPlayAll = {
                                            val fullText = lesson.vocabulary.joinToString(". ") { it.english }
                                            speakOrPlayLesson(fullText)
                                        }
                                    )
                                }
                                itemsIndexed(lesson.vocabulary) { _, word ->
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
                                        subtitle = if (audioReady) "${lesson.conversation.size} دیالوگ • MP3"
                                                   else "${lesson.conversation.size} دیالوگ • TTS",
                                        gradientStart = bookCoverGradientStart,
                                        gradientEnd = bookCoverGradientEnd,
                                        onPlayAll = {
                                            val fullText = lesson.conversation.joinToString(". ") { it.english }
                                            speakOrPlayLesson(fullText)
                                        }
                                    )
                                }
                                itemsIndexed(lesson.conversation) { _, line ->
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
}

// ═══════════════════════════════════════════════════════
//  CompactHeaderCard
// ═══════════════════════════════════════════════════════
@Composable
fun CompactHeaderCard(
    book: Book?,
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
                        Color(gradientStart).copy(alpha = 0.12f),
                        Color(0xFFFAF3E6)
                    )
                )
            )
            .padding(horizontal = 14.dp, vertical = 10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(55.dp, 72.dp)
                    .clip(RoundedCornerShape(8.dp))
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
                        Text(if (isStory) "📖" else "📕", fontSize = 22.sp)
                    }
                }
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    "Chapter $chapterNumber • فصل $chapterNumber",
                    fontSize = 11.sp,
                    color = Color(0xFF3949AB),
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    maxLines = 2,
                    lineHeight = 18.sp
                )
                if (titlePersian.isNotEmpty()) {
                    Spacer(Modifier.height(2.dp))
                    Text(
                        titlePersian,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        maxLines = 1
                    )
                }
                Spacer(Modifier.height(3.dp))
                Text(
                    if (isStory) "$storyParagraphCount خط"
                    else "$vocabCount کلمه • $dialogueCount دیالوگ",
                    fontSize = 10.sp,
                    color = Color(0xFF009688)
                )
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  PlayAllCard
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
//  StoryAudioCard
// ═══════════════════════════════════════════════════════
@Composable
fun StoryAudioCard(
    chapter: StoryChapter,
    gradientStart: Long,
    gradientEnd: Long,
    isPlayingAll: Boolean,
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
                Icon(
                    if (isPlayingAll) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                    if (isPlayingAll) "توقف" else "پخش کل داستان",
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
            Spacer(Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    if (isPlayingAll) "در حال خواندن..." else "پخش کل فصل",
                    fontSize = 14.sp, fontWeight = FontWeight.Bold,
                    color = if (isPlayingAll) Color(0xFFBF360C) else PrimaryColor
                )
                Text(
                    "${chapter.paragraphs.size} خط • خط به خط",
                    fontSize = 11.sp, color = Color.Gray
                )
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  StoryParagraphCard
// ═══════════════════════════════════════════════════════
@Composable
fun StoryParagraphCard(
    paragraph: StoryParagraph,
    showTranslation: Boolean,
    accentColor: Color,
    speechHelper: SpeechHelper,
    isHighlighted: Boolean = false,
    onManualPlay: () -> Unit = {}
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isHighlighted) Color(0xFFFFE0B2) else Color.White
        ),
        elevation = CardDefaults.cardElevation(if (isHighlighted) 5.dp else 1.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    paragraph.english,
                    fontSize = 15.sp,
                    fontWeight = if (isHighlighted) FontWeight.Bold else FontWeight.Medium,
                    color = if (isHighlighted) Color(0xFFBF360C) else Color(0xFF1A237E),
                    lineHeight = 22.sp
                )
                if (showTranslation && paragraph.persian.isNotEmpty()) {
                    Spacer(Modifier.height(6.dp))
                    Text(
                        paragraph.persian,
                        fontSize = 13.sp,
                        color = if (isHighlighted) Color(0xFFBF360C).copy(alpha = 0.7f) else Color.Gray,
                        fontStyle = FontStyle.Italic,
                        lineHeight = 20.sp
                    )
                }
            }
            Spacer(Modifier.width(8.dp))
            IconButton(
                onClick = onManualPlay,
                modifier = Modifier
                    .size(34.dp)
                    .clip(CircleShape)
                    .background(
                        if (isHighlighted) Color(0xFFBF360C).copy(alpha = 0.15f)
                        else accentColor.copy(alpha = 0.12f)
                    )
            ) {
                Icon(
                    Icons.Filled.VolumeUp, "پخش",
                    tint = if (isHighlighted) Color(0xFFBF360C) else accentColor,
                    modifier = Modifier.size(17.dp)
                )
            }
        }
    }
}

// ═══════════════════════════════════════════════════════
//  LessonSectionCard
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