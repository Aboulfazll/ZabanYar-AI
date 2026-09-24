import com.zabanyar.ai.data.ProgressManager
import androidx.compose.ui.platform.LocalContext

@Composable
fun LessonDetailScreen() {
    val context = LocalContext.current
    // خواندن وضعیت ذخیره شده
    val showTranslation = ProgressManager.isShowTranslation(context)

    Column {
        // متن انگلیسی
        Text("Hello, how are you?", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        
        // 👈 شرط نمایش ترجمه
        if (showTranslation) {
            Text("سلام، حال شما چطور است؟", fontSize = 14.sp, color = Color.Gray)
        }
    }
}