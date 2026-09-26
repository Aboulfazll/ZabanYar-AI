package com.zabanyar.ai.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun StoriesScreen(
    onBack: () -> Unit = {},
    onStoryClick: (String) -> Unit = {}
) {
    Text(text = "Stories Screen (به‌زودی)")
}