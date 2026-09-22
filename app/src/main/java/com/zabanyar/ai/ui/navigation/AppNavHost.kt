package com.zabanyar.ai.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zabanyar.ai.ui.auth.LoginScreen
import com.zabanyar.ai.ui.auth.RegisterScreen

object Routes {
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val HOME = "home"
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
            HomeScreenTemp()
        }
    }
}

// ==================== صفحه اصلی موقت ====================
@Composable
private fun HomeScreenTemp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7FA)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("🎉", fontSize = 64.sp)
            Text(
                "خوش آمدید!",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                "صفحه اصلی به‌زودی ساخته می‌شود",
                fontSize = 13.sp,
                color = Color.Gray
            )
        }
    }
}