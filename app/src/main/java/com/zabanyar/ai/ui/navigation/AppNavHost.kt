composable(
    route = Routes.LESSON_DETAIL,
    arguments = listOf(
        navArgument("bookId") { type = NavType.StringType },
        navArgument("chapterNumber") { type = NavType.IntType }
    )
) { entry ->
    val bookId = entry.arguments?.getString("bookId") ?: ""
    val chapterNumber = entry.arguments?.getInt("chapterNumber") ?: 1

    // 👈 دریافت محتوای درس از ریپازیتوری
    val lessons = com.zabanyar.ai.data.LessonContentRepository.getLessons(bookId)
    val lesson = lessons.firstOrNull { it.chapterNumber == chapterNumber }
    val book = com.zabanyar.ai.data.BookRepository.getAllBooks()
        .firstOrNull { it.id == bookId }

    if (lesson != null) {
        LessonDetailScreen(
            lesson = lesson,
            bookCover = book?.coverUrl ?: "",
            bookTitle = book?.title ?: "",
            onBack = { navController.popBackStack() }
        )
    } else {
        // اگه درس پیدا نشد، برگرد
        LaunchedEffect(Unit) { navController.popBackStack() }
    }
}