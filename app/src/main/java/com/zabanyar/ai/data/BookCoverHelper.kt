
package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.getCoverUrl

/**
 * 🖼️ نمایش عکس کتاب/داستان با اولویت‌بندی:
 *   ۱. عکس محلی از res/drawable/ (بر اساس id)
 *   ۲. URL آنلاین از getCoverUrl()
 *   ۳. گرادیان رنگی با عنوان
 */
@Composable
fun BookCoverImage(
    book: Book,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop
) {
    val context = LocalContext.current

    // 🔍 چک کن drawable محلی با نام id وجود دارد
    val localResId = remember(book.id) {
        context.resources.getIdentifier(
            book.id,
            "drawable",
            context.packageName
        )
    }

    when {
        // ✅ عکس محلی
        localResId != 0 -> {
            androidx.compose.foundation.Image(
                painter = painterResource(id = localResId),
                contentDescription = book.title,
                modifier = modifier,
                contentScale = contentScale
            )
        }
        // 🌐 URL آنلاین
        book.coverUrl.isNotBlank() -> {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(book.coverUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = book.title,
                modifier = modifier,
                contentScale = contentScale
            )
        }
        // 🎨 گرادیان
        else -> {
            Box(
                modifier = modifier.background(
                    Brush.linearGradient(
                        listOf(
                            Color(book.gradientStart),
                            Color(book.gradientEnd)
                        )
                    )
                ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = book.title,
                    color = Color.White,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}