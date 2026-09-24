// ==================== محتوای درس (✅ اصلاح شده نهایی) ====================
composable(
    route = Routes.LESSON_DETAIL,
    arguments = listOf(
        navArgument("bookId") { type = NavType.StringType },
        navArgument("chapterNumber") { type = NavType.IntType }
    )
) { entry ->
    val bookId = entry.arguments?.getString("bookId") ?: ""
    val chapterNumber = entry.arguments?.getInt("chapterNumber") ?: 1

    val lesson = LessonContentRepository.getLessonContent(bookId, chapterNumber)
    val book = BookRepository.getBookById(bookId)

    LessonDetailScreen(
        lesson = lesson,
        bookTitle = book?.title ?: "",
        bookCoverGradientStart = book?.gradientStart ?: 0xFF1A237E,
        bookCoverGradientEnd = book?.gradientEnd ?: 0xFF3949AB,
        onBack = { navController.popBackStack() }
    )
}