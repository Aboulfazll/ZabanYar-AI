package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.zabanyar.ai.data.model.User

object UserManager {

    private const val TAG = "UserManager"
    private const val PREFS_NAME = "zabanyar_prefs"
    private const val KEY_USERS = "users_list"
    private const val KEY_LOGGED_IN_EMAIL = "logged_in_email"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    // ============ گرفتن همه کاربران ============
    private fun getAllUsers(context: Context): MutableList<User> {
        val prefs = getPrefs(context)
        val json = prefs.getString(KEY_USERS, null)
        Log.d(TAG, "getAllUsers → json=$json")
        if (json.isNullOrEmpty()) return mutableListOf()
        return try {
            val type = object : TypeToken<MutableList<User>>() {}.type
            val list: MutableList<User>? = Gson().fromJson(json, type)
            Log.d(TAG, "getAllUsers → count=${list?.size ?: 0}")
            list ?: mutableListOf()
        } catch (e: Exception) {
            Log.e(TAG, "getAllUsers error", e)
            mutableListOf()
        }
    }

    // ============ ذخیره لیست کاربران ============
    private fun saveAllUsers(context: Context, users: List<User>) {
        val json = Gson().toJson(users)
        Log.d(TAG, "saveAllUsers → json=$json")
        // ✅ commit به جای apply — ذخیره فوری و تضمین‌شده
        val ok = getPrefs(context).edit()
            .putString(KEY_USERS, json)
            .commit()
        Log.d(TAG, "saveAllUsers → committed=$ok")
    }

    // ============ اعتبارسنجی ایمیل ============
    private fun isValidEmail(email: String): Boolean {
        val cleanEmail = email.trim()
        if (cleanEmail.length < 5) return false
        if (!cleanEmail.contains("@")) return false
        if (!cleanEmail.contains(".")) return false
        val parts = cleanEmail.split("@")
        if (parts.size != 2) return false
        if (parts[0].isEmpty() || parts[1].isEmpty()) return false
        if (!parts[1].contains(".")) return false
        val domainParts = parts[1].split(".")
        if (domainParts.any { it.isEmpty() }) return false
        if (domainParts.last().length < 2) return false
        return true
    }

    // ============ ثبت‌نام ============
    fun register(context: Context, name: String, email: String, password: String): Result<User> {
        val cleanName = name.trim()
        val cleanEmail = email.trim().lowercase()

        if (cleanName.isEmpty()) return Result.failure(Exception("نام نمی‌تواند خالی باشد"))
        if (cleanEmail.isEmpty()) return Result.failure(Exception("ایمیل نمی‌تواند خالی باشد"))
        if (password.length < 6) return Result.failure(Exception("رمز عبور باید حداقل ۶ کاراکتر باشد"))
        if (!isValidEmail(cleanEmail)) return Result.failure(Exception("ایمیل معتبر نیست"))

        val users = getAllUsers(context)
        if (users.any { it.email.equals(cleanEmail, ignoreCase = true) }) {
            return Result.failure(Exception("این ایمیل قبلاً ثبت شده است"))
        }

        val newUser = User(
            email = cleanEmail,
            name = cleanName,
            password = password
        )

        users.add(newUser)
        saveAllUsers(context, users)

        // ✅ commit به جای apply
        getPrefs(context).edit()
            .putString(KEY_LOGGED_IN_EMAIL, newUser.email)
            .commit()

        Log.d(TAG, "register → user saved: ${newUser.email}")
        return Result.success(newUser)
    }

    // ============ ورود ============
    fun login(context: Context, email: String, password: String): Result<User> {
        val cleanEmail = email.trim().lowercase()
        val users = getAllUsers(context)
        Log.d(TAG, "login → searching for: $cleanEmail, in ${users.size} users")

        val user = users.firstOrNull {
            it.email.equals(cleanEmail, ignoreCase = true)
        }

        if (user == null) {
            Log.d(TAG, "login → user NOT found")
            return Result.failure(Exception("کاربری با این ایمیل یافت نشد"))
        }

        if (user.password != password) {
            return Result.failure(Exception("رمز عبور اشتباه است"))
        }

        val updatedUser = user.copy(lastLogin = System.currentTimeMillis())
        val index = users.indexOf(user)
        if (index >= 0) {
            users[index] = updatedUser
            saveAllUsers(context, users)
        }

        getPrefs(context).edit()
            .putString(KEY_LOGGED_IN_EMAIL, updatedUser.email)
            .commit()

        return Result.success(updatedUser)
    }

    // ============ خروج ============
    fun logout(context: Context) {
        getPrefs(context).edit()
            .remove(KEY_LOGGED_IN_EMAIL)
            .commit()
    }

    // ============ گرفتن کاربر لاگین‌شده ============
    fun getLoggedInUser(context: Context): User? {
        val email = getPrefs(context).getString(KEY_LOGGED_IN_EMAIL, null) ?: return null
        return getAllUsers(context).firstOrNull {
            it.email.equals(email, ignoreCase = true)
        }
    }

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

    // ============ آپدیت سطح ============
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