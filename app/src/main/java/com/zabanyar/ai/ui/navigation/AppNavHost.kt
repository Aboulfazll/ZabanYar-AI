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
import com.zabanyar.ai.ui.screens.BookDetailScreen
import com.zabanyar.ai.ui.screens.HomeScreen
import com.zabanyar.ai.ui.screens.LibraryScreen

object Routes {
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val HOME = "home"
    const val LIBRARY = "library"
    const val BOOK_DETAIL = "book_detail/{bookId}"
    const val AI_CHAT = "ai_chat"

    fun bookDetail(bookId: String) = "book_detail/$bookId"
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
                onNavigateToSpeaking = {
                    // بعداً صفحه اسپیکینگ اضافه میشه
                },
                onNavigateToVocabulary = {
                    // بعداً صفحه واژگان اضافه میشه
                },
                onNavigateToProfile = {
                    // بعداً صفحه پروفایل اضافه میشه
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
                    // بعداً به صفحه فصل می‌ریم
                }
            )
        }

        // ==================== چت با AI ====================
        composable(Routes.AI_CHAT) {
            AIChatScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}