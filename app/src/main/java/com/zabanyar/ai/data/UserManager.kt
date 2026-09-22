package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.zabanyar.ai.data.model.User

object UserManager {

    private const val PREFS_NAME = "zabanyar_prefs"
    private const val KEY_USERS = "users_list"
    private const val KEY_LOGGED_IN_EMAIL = "logged_in_email"
    private const val KEY_API_KEY = "api_key"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    // ============ گرفتن همه کاربران ============
    private fun getAllUsers(context: Context): MutableList<User> {
        val prefs = getPrefs(context)
        val json = prefs.getString(KEY_USERS, null) ?: return mutableListOf()
        val type = object : TypeToken<MutableList<User>>() {}.type
        return try {
            Gson().fromJson(json, type) ?: mutableListOf()
        } catch (e: Exception) {
            mutableListOf()
        }
    }

    // ============ ذخیره لیست کاربران ============
    private fun saveAllUsers(context: Context, users: List<User>) {
        val prefs = getPrefs(context)
        val json = Gson().toJson(users)
        prefs.edit().putString(KEY_USERS, json).apply()
    }

    // ============ ثبت‌نام ============
    fun register(context: Context, name: String, email: String, password: String): Result<User> {
        val users = getAllUsers(context)

        // چک کن ایمیل تکراری نباشه
        if (users.any { it.email.equals(email, ignoreCase = true) }) {
            return Result.failure(Exception("این ایمیل قبلاً ثبت شده است"))
        }

        // چک کن رمز حداقل ۶ کاراکتر باشه
        if (password.length < 6) {
            return Result.failure(Exception("رمز عبور باید حداقل ۶ کاراکتر باشد"))
        }

        // چک کن ایمیل معتبر باشه
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return Result.failure(Exception("ایمیل معتبر نیست"))
        }

        val newUser = User(
            email = email.lowercase().trim(),
            name = name.trim(),
            password = password
        )
        users.add(newUser)
        saveAllUsers(context, users)

        // ذخیره وضعیت ورود
        getPrefs(context).edit()
            .putString(KEY_LOGGED_IN_EMAIL, newUser.email)
            .apply()

        return Result.success(newUser)
    }

    // ============ ورود ============
    fun login(context: Context, email: String, password: String): Result<User> {
        val users = getAllUsers(context)
        val user = users.firstOrNull {
            it.email.equals(email.lowercase().trim(), ignoreCase = true)
        }

        if (user == null) {
            return Result.failure(Exception("کاربری با این ایمیل یافت نشد"))
        }

        if (user.password != password) {
            return Result.failure(Exception("رمز عبور اشتباه است"))
        }

        // آپدیت آخرین ورود
        val updatedUser = user.copy(lastLogin = System.currentTimeMillis())
        val index = users.indexOf(user)
        users[index] = updatedUser
        saveAllUsers(context, users)

        // ذخیره وضعیت ورود
        getPrefs(context).edit()
            .putString(KEY_LOGGED_IN_EMAIL, updatedUser.email)
            .apply()

        return Result.success(updatedUser)
    }

    // ============ خروج ============
    fun logout(context: Context) {
        getPrefs(context).edit()
            .remove(KEY_LOGGED_IN_EMAIL)
            .apply()
    }

    // ============ گرفتن کاربر لاگین‌شده ============
    fun getLoggedInUser(context: Context): User? {
        val prefs = getPrefs(context)
        val email = prefs.getString(KEY_LOGGED_IN_EMAIL, null) ?: return null
        val users = getAllUsers(context)
        return users.firstOrNull { it.email.equals(email, ignoreCase = true) }
    }

    // ============ چک کردن آیا کاربر وارد شده ============
    fun isLoggedIn(context: Context): Boolean {
        return getLoggedInUser(context) != null
    }

    // ============ آپدیت کلید API ============
    fun updateApiKey(context: Context, apiKey: String): Boolean {
        val user = getLoggedInUser(context) ?: return false
        val users = getAllUsers(context)
        val index = users.indexOfFirst { it.email.equals(user.email, ignoreCase = true) }
        if (index < 0) return false

        users[index] = user.copy(apiKey = apiKey)
        saveAllUsers(context, users)
        return true
    }

    // ============ آپدیت سطح کاربر ============
    fun updateLevel(context: Context, level: String): Boolean {
        val user = getLoggedInUser(context) ?: return false
        val users = getAllUsers(context)
        val index = users.indexOfFirst { it.email.equals(user.email, ignoreCase = true) }
        if (index < 0) return false

        users[index] = user.copy(level = level)
        saveAllUsers(context, users)
        return true
    }
}