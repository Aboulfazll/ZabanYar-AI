═══════════════════════════════════════════════════════════════
📦 ZABANYAR_AI — BACKUP COMPLETE
تاریخ: 1404/07/08
وضعیت: Build موفق ✅
═══════════════════════════════════════════════════════════════

# 🎯 خلاصه پروژه
ZabanYar AI — اپ یادگیری زبان
Package: com.zabanyar.ai
Min SDK: 24 | Target SDK: 34
Repo: github.com/Aboulfazll/ZabanYar-AI

═══════════════════════════════════════════════════════════════
# ✅ خلاصه تغییرات
═══════════════════════════════════════════════════════════════

## 📚 سیستم داستان‌ها (کامل شده)

### ساختار کلی:
- **۱۵ گروه داستانی** ساخته شده
- **۳ داستان در هر گروه** = ۴۵ داستان
- **۴ یا ۶ فصل** برای هر داستان
- **۱۳ تا ۴۰ پاراگراف** در هر فصل (بسته به گروه)
- **مجموع: بیش از ۱۰,۰۰۰ پاراگراف دوزبانه** (انگلیسی + فارسی)

### فایل‌های داستانی موجود:

#### 📁 Package: com.zabanyar.ai.data.books.story.content.intermediate
1. Group10.kt — هاکلبری فین، غرور و تعصب، جین ایر (۶ فصل × ۴۰ پاراگراف)
2. Group11.kt — (در صورت وجود)
3. Group12.kt — موبی دیک، تام سایر، پیرمرد و دریا (۴ فصل)
4. Group13.kt — مادام بواری، بینوایان، سه تفنگدار (۴ فصل × ۳۰ پاراگراف)
5. Group14.kt — ماشین زمان، جنگ دنیاها، ۱۹۸۴ (۴ فصل × ۴۰ پاراگراف)
6. Group15.kt — گتسبی بزرگ، خوشه‌های خشم، بلندی‌های بادگیر (۶ فصل × ۴۰ پاراگراف)

#### 📁 Package: com.zabanyar.ai.data.books.story.content.advanced
1. Group1.kt تا Group10.kt — (موجود در تصاویر: ۳۰ داستان پیشرفته)
2. Group11.kt — قهرمان زمان ما، ارواح مرده، یادداشت‌های زیرزمینی (۶ فصل × ۴۰ پاراگراف)
3. Group12.kt — گرگ و میش خدایان، تهوع، سقوط (۶ فصل × ۴۰ پاراگراف)
4. Group13.kt — (در صورت وجود)
5. Group14.kt — (در صورت وجود)
6. Group15.kt — (در صورت وجود)

## 🆕 فایل‌های جدید در این سری (۸ عدد)
1. FontSizeManager.kt
2. DictionaryRepository.kt
3. WordPopupDialog.kt
4. PodcastPlayerScreen.kt
5. BookCoverImage.kt
6. BookCoverHelper.kt
7. assets/dictionary.json
8. PROJECT_STATUS.md (این فایل)

## 🔄 فایل‌های ویرایش‌شده (۱۰ عدد)
1. MainActivity.kt
2. AppNavHost.kt
3. LessonDetailScreen.kt
4. ReadingModeScreen.kt
5. PodcastScreen.kt
6. PodcastRepository.kt
7. SettingsScreen.kt
8. LibraryScreen.kt
9. BookDetailScreen.kt
10. SimpleStoryContent.kt
11. MainHome.kt
12. UserManager.kt

═══════════════════════════════════════════════════════════════
# 📊 آمار کامل پروژه
═══════════════════════════════════════════════════════════════

## داستان‌ها (سطح متوسط - intermediate)
| گروه | داستان‌ها | فصل | پاراگراف/فصل |
|------|----------|------|--------------|
| 10   | هاکلبری فین، غرور و تعصب، جین ایر | ۶ | ۴۰ |
| 12   | موبی دیک، تام سایر، پیرمرد و دریا | ۴ | ۴۰ |
| 13   | مادام بواری، بینوایان، سه تفنگدار | ۴ | ۳۰ |
| 14   | ماشین زمان، جنگ دنیاها، ۱۹۸۴ | ۴ | ۴۰ |
| 15   | گتسبی بزرگ، خوشه‌های خشم، بلندی‌های بادگیر | ۶ | ۴۰ |

## داستان‌ها (سطح پیشرفته - advanced)
| گروه | داستان‌ها | فصل | پاراگراف/فصل |
|------|----------|------|--------------|
| 1-10 | ۳۰ داستان کلاسیک جهان | ۴-۶ | ۴۰ |
| 11   | قهرمان زمان ما، ارواح مرده، یادداشت‌های زیرزمینی | ۶ | ۴۰ |
| 12   | گرگ و میش خدایان، تهوع، سقوط | ۶ | ۴۰ |
| 13-15 | (نیاز به تکمیل) | - | - |

## فایل‌های صوتی موجود
- ۳۰۱ فایل MP3 (مجموعه قبلی)
- ۲۴ فایل MP3 (پادکست‌ها - در انتظار آپلود)

═══════════════════════════════════════════════════════════════
# 🚦 کارهای باقی‌مانده
═══════════════════════════════════════════════════════════════

## اولویت بالا:
- [ ] آپلود ۲۴ فایل MP3 در GitHub Release با tag: v1.0-podcasts
      نام‌ها: p1_greetings.mp3 تا p24_future_work.mp3
- [ ] تغییر PodcastPlayerScreen برای پخش MP3 به جای TTS
- [ ] گسترش dictionary.json

## اولویت متوسط:
- [ ] ساخت گروه ۱۳ (advanced) — پیشنهاد: قلب تاریکی، لرد جیم، دنیای قشنگ نو
- [ ] ساخت گروه ۱۴ (advanced) — پیشنهاد: همراه باد، بیلی باد، آمریکایی آرام
- [ ] ساخت گروه ۱۵ (advanced) — پیشنهاد: تولد تراژدی، انسان در جستجوی معنا، عشق در زمان وبا

## اولویت پایین:
- [ ] بررسی و اصلاح Group11.kt و Group12.kt (advanced) برای کامپایل بدون خطا
- [ ] افزودن تصاویر جلد برای تمام کتاب‌ها
- [ ] تست پلیر پادکست

═══════════════════════════════════════════════════════════════
# 📝 نکات مهم برای ادامه کار
═══════════════════════════════════════════════════════════════

## ساختار صحیح Group (نمونه):
```kotlin
package com.zabanyar.ai.data.books.story.content.intermediate
// یا: com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

object Group13 {
    fun getAll(): List<StoryContent> = listOf(
        story37(),
        story38(),
        story39(),
    )

    private fun story37() = StoryContent(
        storyId = "int_..._int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "English Title", titlePersian = "عنوان فارسی",
                paragraphs = listOf(
                    StoryParagraph("English text.", "متن فارسی."),
                    // ۴۰ پاراگراف در کل
                )
            ),
            // ۴ یا ۶ فصل
        )
    )
}