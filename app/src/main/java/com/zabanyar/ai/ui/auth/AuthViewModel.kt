package com.zabanyar.ai.ui.auth

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import com.zabanyar.ai.data.UserManager
import com.zabanyar.ai.data.model.User

class AuthViewModel(application: Application) : AndroidViewModel(application) {

    private val context = application.applicationContext

    // ============ وضعیت فرم ============
    var name by mutableStateOf("")
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var confirmPassword by mutableStateOf("")

    var isLoading by mutableStateOf(false)
    var errorMessage by mutableStateOf<String?>(null)
    var successUser by mutableStateOf<User?>(null)

    // ============ ورود ============
    fun login() {
        errorMessage = null

        if (email.isBlank() || password.isBlank()) {
            errorMessage = "لطفاً ایمیل و رمز عبور را وارد کنید"
            return
        }

        isLoading = true
        val result = UserManager.login(context, email, password)
        isLoading = false

        result.fold(
            onSuccess = { user ->
                successUser = user
            },
            onFailure = { error ->
                errorMessage = error.message ?: "خطا در ورود"
            }
        )
    }

    // ============ ثبت‌نام ============
    fun register() {
        errorMessage = null

        if (name.isBlank() || email.isBlank() || password.isBlank()) {
            errorMessage = "لطفاً همه فیلدها را پر کنید"
            return
        }

        if (password != confirmPassword) {
            errorMessage = "رمز عبور و تکرار آن یکسان نیستند"
            return
        }

        isLoading = true
        val result = UserManager.register(context, name, email, password)
        isLoading = false

        result.fold(
            onSuccess = { user ->
                successUser = user
            },
            onFailure = { error ->
                errorMessage = error.message ?: "خطا در ثبت‌نام"
            }
        )
    }

    // ============ پاک کردن خطا ============
    fun clearError() {
        errorMessage = null
    }

    // ============ پاک کردن فرم ============
    fun clearForm() {
        name = ""
        email = ""
        password = ""
        confirmPassword = ""
        errorMessage = null
        successUser = null
    }
}