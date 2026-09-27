package com.zabanyar.ai.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.LessonContentRepository
import com.zabanyar.ai.data.PodcastRepository
import com.zabanyar.ai.data.books.story.StoryRepository
import com.zabanyar.ai.ui.auth.LoginScreen
import com.zabanyar.ai.ui.auth.RegisterScreen
import com.zabanyar.ai.ui.screens.AIChatScreen
import com.zabanyar.ai.ui.screens.AchievementsScreen
import com.zabanyar.ai.ui.screens.ApiKeyScreen
import com.zabanyar.ai.ui.screens.BookDetailScreen
import com.zabanyar.ai.ui.screens.DailySentencesScreen
import com.zabanyar.ai.ui.screens.LessonDetailScreen
import com.zabanyar.ai.ui.screens.LevelTestScreen
import com.zabanyar.ai.ui.screens.LibraryScreen
import com.zabanyar.ai.ui.screens.MainHome
import com.zabanyar.ai.ui.screens.PodcastPlayerScreen
import com.zabanyar.ai.ui.screens.PodcastScreen
import com.zabanyar.ai.ui.screens.ProfileScreen
import com.zabanyar.ai.ui.screens.QuizScreen
import com.zabanyar.ai.ui.screens.ReadingModeScreen
import com.zabanyar.ai.ui.screens.SettingsScreen
import com.zabanyar.ai.ui.screens.SpeakingScreen
import com.zabanyar.ai.ui.screens.StoriesScreen
import com.zabanyar.ai.ui.screens.VocabularyScreen

object Routes {
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val HOME = "home"
    const val PROFILE = "profile"
    const val SETTINGS = "settings"
    const val LIBRARY = "library"
    const val STORIES = "stories"
    const val BOOK_DETAIL = "book_detail/{bookId}"
    const val LESSON_DETAIL = "lesson_detail/{bookId}/{chapterNumber}"
    const val READING_MODE = "reading_mode/{storyId}"
    const val QUIZ = "quiz/{bookId}/{quizIndex}/{totalChapters}/{bookTitle}"
    const val AI_CHAT = "ai_chat"
    const val API_KEY = "api_key"
    const val VOCABULARY = "vocabulary"
    const val SPEAKING = "speaking"
    const val PODCAST = "podcast"
    const val PODCAST_PLAYER = "podcast_player/{podcastId}"
    const val DAILY_SENTENCES = "daily_sentences"
    const val LEVEL_TEST = "level_test"
    const val ACHIEVEMENTS = "achievements"

    fun bookDetail(bookId: String) = "book_detail/$bookId"
    fun lessonDetail(bookId: String, chapterNumber: Int) = "lesson_detail/$bookId/$chapterNumber"
    fun readingMode(storyId: String) = "reading_mode/$storyId"
    fun quiz(bookId: String, quizIndex: Int, totalChapters: Int, bookTitle: String) =
        "quiz/$bookId/$quizIndex/$totalChapters/${android.net.Uri.encode(bookTitle)}"
    fun podcastPlayer(podcastId: String) = "podcast_player/$podcastId"
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = Routes.LOGIN
) {
    NavHost(navController = navController, startDestination = startDestination) {

        composable(Routes.LOGIN) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Routes.HOME) {
                        popUpTo(Routes.LOGIN) { inclusive = true }
                    }
                },
                onNavigateToRegister = { navController.navigate(Routes.REGISTER) }
            )
        }

        composable(Routes.REGISTER) {
            RegisterScreen(
                onRegisterSuccess = {
                    navController.navigate(Routes.HOME) {
                        popUpTo(Routes.LOGIN) { inclusive = true }
                    }
                },
                onNavigateToLogin = { navController.popBackStack() }
            )
        }

        composable(Routes.HOME) {
            MainHome(
                onNavigateToLibrary = { navController.navigate(Routes.LIBRARY) },
                onNavigateToAIChat = { navController.navigate(Routes.AI_CHAT) },
                onNavigateToSpeaking = { navController.navigate(Routes.SPEAKING) },
                onNavigateToVocabulary = { navController.navigate(Routes.VOCABULARY) },
                onNavigateToProfile = { navController.navigate(Routes.PROFILE) },
                onNavigateToSettings = { navController.navigate(Routes.SETTINGS) },
                onNavigateToPodcast = { navController.navigate(Routes.PODCAST) },
                onNavigateToDailySentences = { navController.navigate(Routes.DAILY_SENTENCES) },
                onNavigateToLevelTest = { navController.navigate(Routes.LEVEL_TEST) },
                onNavigateToAchievements = { navController.navigate(Routes.ACHIEVEMENTS) },
                onNavigateToStories = { navController.navigate(Routes.STORIES) },
                onNavigateToBook = { bookId -> navController.navigate(Routes.bookDetail(bookId)) },
                onLogout = {
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(Routes.HOME) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.LIBRARY) {
            LibraryScreen(
                onBack = { navController.popBackStack() },
                onBookClick = { bookId -> navController.navigate(Routes.bookDetail(bookId)) }
            )
        }

        composable(Routes.STORIES) {
            StoriesScreen(
                onBack = { navController.popBackStack() },
                onStoryClick = { storyId ->
                    navController.navigate(Routes.bookDetail(storyId))
                }
            )
        }

        composable(
            route = Routes.BOOK_DETAIL,
            arguments = listOf(navArgument("bookId") { type = NavType.StringType })
        ) { entry ->
            val bookId = entry.arguments?.getString("bookId") ?: ""
            BookDetailScreen(
                bookId = bookId,
                onBack = { navController.popBackStack() },
                onChapterClick = { ch -> navController.navigate(Routes.lessonDetail(bookId, ch)) },
                onQuizClick = { idx ->
                    val book = BookRepository.getBookById(bookId)
                        ?: StoryRepository.getStoryById(bookId)
                    navController.navigate(
                        Routes.quiz(bookId, idx, book?.totalChapters ?: 12, book?.title ?: "")
                    )
                }
            )
        }

        composable(
            route = Routes.QUIZ,
            arguments = listOf(
                navArgument("bookId") { type = NavType.StringType },
                navArgument("quizIndex") { type = NavType.IntType },
                navArgument("totalChapters") { type = NavType.IntType },
                navArgument("bookTitle") { type = NavType.StringType }
            )
        ) { entry ->
            val bookId = entry.arguments?.getString("bookId") ?: ""
            val quizIndex = entry.arguments?.getInt("quizIndex") ?: 0
            val totalChapters = entry.arguments?.getInt("totalChapters") ?: 12
            val bookTitle = java.net.URLDecoder.decode(
                entry.arguments?.getString("bookTitle") ?: "", "UTF-8"
            )
            QuizScreen(
                bookId = bookId,
                quizIndex = quizIndex,
                totalChapters = totalChapters,
                bookTitle = bookTitle,
                onBack = { navController.popBackStack() },
                onQuizCompleted = { if (it) navController.popBackStack() }
            )
        }

        composable(
            route = Routes.LESSON_DETAIL,
            arguments = listOf(
                navArgument("bookId") { type = NavType.StringType },
                navArgument("chapterNumber") { type = NavType.IntType }
            )
        ) { entry ->
            val bookId = entry.arguments?.getString("bookId") ?: ""
            val chapterNumber = entry.arguments?.getInt("chapterNumber") ?: 1

            val book = BookRepository.getBookById(bookId)
                ?: StoryRepository.getStoryById(bookId)

            val storyChapter = StoryRepository.getChapter(bookId, chapterNumber)

            if (storyChapter != null) {
                LessonDetailScreen(
                    storyChapter = storyChapter,
                    bookTitle = book?.title ?: "",
                    bookCoverGradientStart = book?.gradientStart ?: 0xFF1A237E,
                    bookCoverGradientEnd = book?.gradientEnd ?: 0xFF3949AB,
                    bookId = bookId,
                    onBack = { navController.popBackStack() }
                )
            } else {
                val lesson = LessonContentRepository.getLessonContent(bookId, chapterNumber)
                LessonDetailScreen(
                    lesson = lesson,
                    bookTitle = book?.title ?: "",
                    bookCoverGradientStart = book?.gradientStart ?: 0xFF1A237E,
                    bookCoverGradientEnd = book?.gradientEnd ?: 0xFF3949AB,
                    bookId = bookId,
                    onBack = { navController.popBackStack() }
                )
            }
        }

        composable(
            route = Routes.READING_MODE,
            arguments = listOf(navArgument("storyId") { type = NavType.StringType })
        ) { entry ->
            val storyId = entry.arguments?.getString("storyId") ?: ""
            val book = BookRepository.getBookById(storyId)
                ?: StoryRepository.getStoryById(storyId)
            ReadingModeScreen(
                storyId = storyId,
                title = book?.title ?: "داستان",
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.AI_CHAT) {
            AIChatScreen(
                onBack = { navController.popBackStack() },
                onOpenSettings = { navController.navigate(Routes.API_KEY) }
            )
        }

        composable(Routes.API_KEY) {
            ApiKeyScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.PROFILE) {
            ProfileScreen(
                onBack = { navController.popBackStack() },
                onNavigateToApiKey = { navController.navigate(Routes.API_KEY) },
                onLogout = {
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(Routes.HOME) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.SETTINGS) {
            SettingsScreen(
                onBack = { navController.popBackStack() },
                onLogout = {
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(Routes.HOME) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.VOCABULARY) {
            VocabularyScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.SPEAKING) {
            SpeakingScreen(onBack = { navController.popBackStack() })
        }

        // ✅ لیست پادکست‌ها — با onPodcastClick
        composable(Routes.PODCAST) {
            PodcastScreen(
                onBack = { navController.popBackStack() },
                onPodcastClick = { podcast ->
                    navController.navigate(Routes.podcastPlayer(podcast.id))
                }
            )
        }

        // 🆕 پلیر پادکست
        composable(
            route = Routes.PODCAST_PLAYER,
            arguments = listOf(navArgument("podcastId") { type = NavType.StringType })
        ) { entry ->
            val podcastId = entry.arguments?.getString("podcastId") ?: ""
            val podcast = PodcastRepository.getPodcastById(podcastId)

            if (podcast == null) {
                androidx.compose.foundation.layout.Box(
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxSize(),
                    contentAlignment = androidx.compose.ui.Alignment.Center
                ) {
                    androidx.compose.material3.Text("پادکست پیدا نشد")
                }
            } else {
                PodcastPlayerScreen(
                    podcast = podcast,
                    transcript = podcast.transcript,
                    onBack = { navController.popBackStack() }
                )
            }
        }

        composable(Routes.DAILY_SENTENCES) {
            DailySentencesScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.LEVEL_TEST) {
            LevelTestScreen(
                onBack = { navController.popBackStack() },
                onTestComplete = { }
            )
        }

        composable(Routes.ACHIEVEMENTS) {
            AchievementsScreen(onBack = { navController.popBackStack() })
        }
    }
}