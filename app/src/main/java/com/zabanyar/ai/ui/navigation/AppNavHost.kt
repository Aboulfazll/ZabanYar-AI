if (storyChapter != null) {
    LessonDetailScreen(
        storyChapter = storyChapter,
        bookTitle = book?.title ?: "",
        bookCoverGradientStart = book?.gradientStart ?: 0xFF1A237E,
        bookCoverGradientEnd = book?.gradientEnd ?: 0xFF3949AB,
        bookId = bookId,
        onBack = { navController.popBackStack() }
    )
} else {
    val lesson = LessonContentRepository.getLessonContent(bookId, chapterNumber)
    LessonDetailScreen(
        lesson = lesson,
        bookTitle = book?.title ?: "",
        bookCoverGradientStart = book?.gradientStart ?: 0xFF1A237E,
        bookCoverGradientEnd = book?.gradientEnd ?: 0xFF3949AB,
        bookId = bookId,
        onBack = { navController.popBackStack() }
    )
}