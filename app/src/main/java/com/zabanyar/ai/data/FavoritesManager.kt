import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object FavoritesManager {

    private const val PREFS_NAME = "zabanyar_favorites"
    private const val KEY_ADDED_BOOKS = "added_books"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

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

    fun toggleBook(context: Context, bookId: String): Boolean {
        val current = getAddedBooks(context).toMutableList()
        val added = if (current.contains(bookId)) {
            current.remove(bookId)
            false
        } else {
            current.add(bookId)
            true
        }
        saveBooks(context, current)
        return added
    }

    private fun saveBooks(context: Context, books: List<String>) {
        val json = Gson().toJson(books)
        getPrefs(context).edit().putString(KEY_ADDED_BOOKS, json).apply()
    }
}