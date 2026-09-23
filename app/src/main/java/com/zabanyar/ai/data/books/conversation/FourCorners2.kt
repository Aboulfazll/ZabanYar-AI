package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCorners2 {

    const val BOOK_ID = "four_corners_2"

    fun getChapter(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Life Stories",
            titlePersian = "داستان‌های زندگی",

            objectives = listOf(
                "Talk about past experiences",
                "Describe important events in your life",
                "Ask and answer questions about the past",
                "Use the simple past of be and regular verbs",
                "Use common irregular past verbs",
                "Tell a short personal story"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "experience",
                    persian = "تجربه",
                    pronunciation = "/ɪkˈspɪriəns/",
                    partOfSpeech = "noun",
                    example = "It was a great experience.",
                    examplePersian = "تجربه خیلی خوبی بود.",
                    collocations = "great experience, new experience, life experience"
                ),
                VocabWord(
                    english = "memory",
                    persian = "خاطره",
                    pronunciation = "/ˈmeməri/",
                    partOfSpeech = "noun",
                    example = "I have many good memories from school.",
                    examplePersian = "من خاطرات خوبی از مدرسه دارم."
                ),
                VocabWord(
                    english = "trip",
                    persian = "سفر",
                    pronunciation = "/trɪp/",
                    partOfSpeech = "noun",
                    example = "We took a trip to the mountains.",
                    examplePersian = "ما به کوهستان سفر کردیم."
                ),
                VocabWord(
                    english = "visit",
                    persian = "بازدید کردن",
                    pronunciation = "/ˈvɪzɪt/",
                    partOfSpeech = "verb",
                    example = "I visited my grandparents last weekend.",
                    examplePersian = "آخر هفته گذشته به دیدن پدربزرگ و مادربزرگم رفتم."
                ),
                VocabWord(
                    english = "travel",
                    persian = "سفر کردن",
                    pronunciation = "/ˈtrævəl/",
                    partOfSpeech = "verb",
                    example = "She traveled to several countries.",
                    examplePersian = "او به چند کشور سفر کرد."
                ),
                VocabWord(
                    english = "arrive",
                    persian = "رسیدن",
                    pronunciation = "/əˈraɪv/",
                    partOfSpeech = "verb",
                    example = "We arrived at the hotel late.",
                    examplePersian = "ما دیر به هتل رسیدیم."
                ),
                VocabWord(
                    english = "leave",
                    persian = "ترک کردن",
                    pronunciation = "/liːv/",
                    partOfSpeech = "verb",
                    example = "We left home early.",
                    examplePersian = "ما صبح زود خانه را ترک کردیم."
                ),
                VocabWord(
                    english = "remember",
                    persian = "به یاد آوردن",
                    pronunciation = "/rɪˈmembər/",
                    partOfSpeech = "verb",
                    example = "I remember my first day at school.",
                    examplePersian = "اولین روز مدرسه‌ام را به یاد دارم."
                ),
                VocabWord(
                    english = "forget",
                    persian = "فراموش کردن",
                    pronunciation = "/fərˈɡet/",
                    partOfSpeech = "verb",
                    example = "I never forget that day.",
                    examplePersian = "من آن روز را هرگز فراموش نمی‌کنم."
                ),
                VocabWord(
                    english = "special",
                    persian = "خاص",
                    pronunciation = "/ˈspeʃəl/",
                    partOfSpeech = "adjective",
                    example = "It was a very special day.",
                    examplePersian = "آن روز خیلی خاصی بود."
                ),
                VocabWord(
                    english = "exciting",
                    persian = "هیجان‌انگیز",
                    pronunciation = "/ɪkˈsaɪtɪŋ/",
                    partOfSpeech = "adjective",
                    example = "The trip was exciting.",
                    examplePersian = "سفر هیجان‌انگیز بود."
                ),
                VocabWord(
                    english = "surprising",
                    persian = "تعجب‌آور",
                    pronunciation = "/sərˈpraɪzɪŋ/",
                    partOfSpeech = "adjective",
                    example = "The ending was surprising.",
                    examplePersian = "پایان داستان تعجب‌آور بود."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "Once upon a time",
                    persian = "روزی روزگاری",
                    example = "Once upon a time, I lived in a small village.",
                    examplePersian = "روزی روزگاری، من در یک روستای کوچک زندگی می‌کردم.",
                    register = "storytelling"
                ),
                IdiomExpression(
                    english = "a long time ago",
                    persian = "مدت زیادی پیش",
                    example = "I met him a long time ago.",
                    examplePersian = "من مدت زیادی پیش او را ملاقات کردم.",
                    register = "neutral"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "grow up",
                    meaning = "to become an adult",
                    persian = "بزرگ شدن",
                    example = "I grew up in a small town.",
                    examplePersian = "من در یک شهر کوچک بزرگ شدم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "come back",
                    meaning = "to return",
                    persian = "برگشتن",
                    example = "We came back home at midnight.",
                    examplePersian = "ما نیمه‌شب به خانه برگشتیم.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "تلفظ -ed",
                    content = "پایان -ed در گذشته شکل‌های مختلفی دارد. در بعضی فعل‌ها /t/، در بعضی /d/ و در برخی /ɪd/ شنیده می‌شود."
                ),
                PronunciationTip(
                    title = "visited",
                    content = "در visited پایان -ed به صورت /ɪd/ تلفظ می‌شود: /ˈvɪzɪtɪd/."
                ),
                PronunciationTip(
                    title = "was و were",
                    content = "was معمولاً برای I, he, she, it و were برای you, we, they استفاده می‌شود."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Sharing memories",
                    content = "در