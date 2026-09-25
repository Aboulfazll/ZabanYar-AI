package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * مدیریت کتاب‌های اضافه‌شده به صفحه خانه (Home)
 *
 * قابلیت‌ها:
 *  • افزودن/حذف کتاب
 *  • ترتیب دلخواه (انتقال به بالا / یک پله بالا)
 *  • نشان کردن (Pin)
 *  • آرشیو کردن
 */
object FavoritesManager {

    private const val PREFS_NAME = "zabanyar_favorites"
    private const val KEY_ADDED_BOOKS = "added_books"
    private const val KEY_ARCHIVED_BOOKS = "archived_books"
    private const val KEY_PINNED_BOOKS = "pinned_books"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    // ═══════════════════════════════════════════════════════
    // ۱. کتاب‌های خانه (Home Books)
    // ═══════════════════════════════════════════════════════

    fun getAddedBooks(context: Context): List<String> {
        val json = getPrefs(context).getString(KEY_ADDED_BOOKS, null) ?: return emptyList()
        val type = object : TypeToken<List<String>>() {}.type
        return try {
            Gson().fromJson(json, type) ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    fun isAdded(context: Context, bookId: String): Boolean {
        return getAddedBooks(context).contains(bookId)
    }

    /**
     * افزودن یا حذف کتاب
     * @return true اگر اضافه شد، false اگر حذف شد
     */
    fun toggleBook(context: Context, bookId: String): Boolean {
        val current = getAddedBooks(context).toMutableList()
        val added = if (current.contains(bookId)) {
            current.remove(bookId)
            false
        } else {
            current.add(0, bookId) // اضافه به ابتدای لیست
            true
        }
        saveBooks(context, current)
        return added
    }

    fun removeBook(context: Context, bookId: String) {
        val current = getAddedBooks(context).toMutableList()
        current.remove(bookId)
        saveBooks(context, current)
    }

    private fun saveBooks(context: Context, books: List<String>) {
        val json = Gson().toJson(books)
        getPrefs(context).edit().putString(KEY_ADDED_BOOKS, json).apply()
    }

    // ═══════════════════════════════════════════════════════
    // ۲. ترتیب کتاب‌ها (Order)
    // ═══════════════════════════════════════════════════════

    /** انتقال کتاب به بالای لیست */
    fun moveToTop(context: Context, bookId: String) {
        val current = getAddedBooks(context).toMutableList()
        if (current.remove(bookId)) {
            current.add(0, bookId)
            saveBooks(context, current)
        }
    }

    /** انتقال کتاب یک پله به بالا */
    fun moveUp(context: Context, bookId: String) {
        val current = getAddedBooks(context).toMutableList()
        val idx = current.indexOf(bookId)
        if (idx > 0) {
            val temp = current[idx - 1]
            current[idx - 1] = bookId
            current[idx] = temp
            saveBooks(context, current)
        }
    }

    /** انتقال کتاب یک پله به پایین */
    fun moveDown(context: Context, bookId: String) {
        val current = getAddedBooks(context).toMutableList()
        val idx = current.indexOf(bookId)
        if (idx >= 0 && idx < current.size - 1) {
            val temp = current[idx + 1]
            current[idx + 1] = bookId
            current[idx] = temp
            saveBooks(context, current)
        }
    }

    /** ذخیره ترتیب دلخواه (مثلاً بعد از drag & drop) */
    fun setOrder(context: Context, orderedIds: List<String>) {
        saveBooks(context, orderedIds)
    }

    // ═══════════════════════════════════════════════════════
    // ۳. نشان کردن (Pin)
    // ═══════════════════════════════════════════════════════

    fun getPinnedBooks(context: Context): Set<String> {
        val json = getPrefs(context).getString(KEY_PINNED_BOOKS, null) ?: return emptySet()
        val type = object : TypeToken<Set<String>>() {}.type
        return try {
            Gson().fromJson(json, type) ?: emptySet()
        } catch (e: Exception) {
            emptySet()
        }
    }

    fun isPinned(context: Context, bookId: String): Boolean {
        return getPinnedBooks(context).contains(bookId)
    }

    /**
     * تغییر وضعیت Pin
     * @return true اگر Pin شد، false اگر برداشته شد
     */
    fun togglePin(context: Context, bookId: String): Boolean {
        val pinned = getPinnedBooks(context).toMutableSet()
        val nowPinned = if (pinned.contains(bookId)) {
            pinned.remove(bookId)
            false
        } else {
            pinned.add(bookId)
            true
        }
        val json = Gson().toJson(pinned)
        getPrefs(context).edit().putString(KEY_PINNED_BOOKS, json).apply()
        return nowPinned
    }

    // ═══════════════════════════════════════════════════════
    // ۴. آرشیو (Archive)
    // ═══════════════════════════════════════════════════════

    fun getArchivedBooks(context: Context): List<String> {
        val json = getPrefs(context).getString(KEY_ARCHIVED_BOOKS, null) ?: return emptyList()
        val type = object : TypeToken<List<String>>() {}.type
        return try {
            Gson().fromJson(json, type) ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    fun isArchived(context: Context, bookId: String): Boolean {
        return getArchivedBooks(context).contains(bookId)
    }

    /** آرشیو کردن: از خانه حذف و به آرشیو اضافه می‌شود */
    fun archiveBook(context: Context, bookId: String) {
        removeBook(context, bookId)
        val archived = getArchivedBooks(context).toMutableList()
        if (!archived.contains(bookId)) {
            archived.add(0, bookId)
            val json = Gson().toJson(archived)
            getPrefs(context).edit().putString(KEY_ARCHIVED_BOOKS, json).apply()
        }
    }

    /** برگرداندن از آرشیو به خانه */
    fun unarchiveBook(context: Context, bookId: String) {
        val archived = getArchivedBooks(context).toMutableList()
        if (archived.remove(bookId)) {
            val json = Gson().toJson(archived)
            getPrefs(context).edit().putString(KEY_ARCHIVED_BOOKS, json).apply()
            // اضافه به خانه
            val current = getAddedBooks(context).toMutableList()
            current.add(0, bookId)
            saveBooks(context, current)
        }
    }

    // ═══════════════════════════════════════════════════════
    // ۵. پاک‌سازی کامل (اختیاری)
    // ═══════════════════════════════════════════════════════

    fun clearAll(context: Context) {
        getPrefs(context).edit().clear().apply()
    }
}