package com.zabanyar.ai.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.zabanyar.ai.ui.auth.LoginScreen
import com.zabanyar.ai.ui.auth.RegisterScreen
import com.zabanyar.ai.ui.screens.AIChatScreen
import com.zabanyar.ai.ui.screens.ApiKeyScreen
import com.zabanyar.ai.ui.screens.BookDetailScreen
import com.zabanyar.ai.ui.screens.HomeScreen
import com.zabanyar.ai.ui.screens.LessonDetailScreen
import com.zabanyar.ai.ui.screens.LibraryScreen
import com.zabanyar.ai.ui.screens.ProfileScreen

object Routes {
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val HOME = "home"
    const val LIBRARY = "library"
    const val BOOK_DETAIL = "book_detail/{bookId}"
    const val LESSON_DETAIL = "lesson_detail/{bookId}/{chapterNumber}"
    const val AI_CHAT = "ai_chat"
    const val API_KEY = "api_key"
    const val PROFILE = "profile"

    fun bookDetail(bookId: String) = "book_detail/$bookId"
    fun lessonDetail(bookId: String, chapterNumber: Int) =
        "lesson_detail/$bookId/$chapterNumber"
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = Routes.LOGIN
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        // ==================== ورود ====================
        composable(Routes.LOGIN) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Routes.HOME) {
                        popUpTo(Routes.LOGIN) { inclusive = true }
                    }
                },
                onNavigateToRegister = {
                    navController.navigate(Routes.REGISTER)
                }
            )
        }

        // ==================== ثبت‌نام ====================
        composable(Routes.REGISTER) {
            RegisterScreen(
                onRegisterSuccess = {
                    navController.navigate(Routes.HOME) {
                        popUpTo(Routes.LOGIN) { inclusive = true }
                    }
                },
                onNavigateToLogin = {
                    navController.popBackStack()
                }
            )
        }

        // ==================== صفحه اصلی ====================
        composable(Routes.HOME) {
            HomeScreen(
                onNavigateToLibrary = {
                    navController.navigate(Routes.LIBRARY)
                },
                onNavigateToAIChat = {
                    navController.navigate(Routes.AI_CHAT)
                },
                onNavigateToSpeaking = {},
                onNavigateToVocabulary = {},
                onNavigateToProfile = {
                    navController.navigate(Routes.PROFILE)
                },
                onLogout = {
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(Routes.HOME) { inclusive = true }
                    }
                }
            )
        }

        // ==================== کتابخانه ====================
        composable(Routes.LIBRARY) {
            LibraryScreen(
                onBack = { navController.popBackStack() },
                onBookClick = { bookId ->
                    navController.navigate(Routes.bookDetail(bookId))
                }
            )
        }

        // ==================== جزئیات کتاب ====================
        composable(
            route = Routes.BOOK_DETAIL,
            arguments = listOf(
                navArgument("bookId") { type = NavType.StringType }
            )
        ) { entry ->
            val bookId = entry.arguments?.getString("bookId") ?: ""
            BookDetailScreen(
                bookId = bookId,
                onBack = { navController.popBackStack() },
                onChapterClick = { chapterNumber ->
                    navController.navigate(
                        Routes.lessonDetail(bookId, chapterNumber)
                    )
                }
            )
        }

        // ==================== محتوای درس ====================
        composable(
            route = Routes.LESSON_DETAIL,
            arguments = listOf(
                navArgument("bookId") { type = NavType.StringType },
                navArgument("chapterNumber") { type = NavType.IntType }
            )
        ) { entry ->
            val bookId = entry.arguments?.getString("bookId") ?: ""
            val chapterNumber = entry.arguments?.getInt("chapterNumber") ?: 1
            LessonDetailScreen(
                bookId = bookId,
                chapterNumber = chapterNumber,
                onBack = { navController.popBackStack() }
            )
        }

        // ==================== چت با AI ====================
        composable(Routes.AI_CHAT) {
            AIChatScreen(
                onBack = { navController.popBackStack() },
                onOpenSettings = {
                    navController.navigate(Routes.API_KEY)
                }
            )
        }

        // ==================== کلید API ====================
        composable(Routes.API_KEY) {
            ApiKeyScreen(
                onBack = { navController.popBackStack() }
            )
        }

        // ==================== پروفایل ====================
        composable(Routes.PROFILE) {
            ProfileScreen(
                onBack = { navController.popBackStack() },
                onNavigateToApiKey = {
                    navController.navigate(Routes.API_KEY)
                },
                onLogout = {
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(Routes.HOME) { inclusive = true }
                    }
                }
            )
        }
    }
}