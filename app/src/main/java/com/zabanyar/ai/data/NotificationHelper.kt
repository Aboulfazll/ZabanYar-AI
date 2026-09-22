package com.zabanyar.ai.data

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

object NotificationHelper {

    private const val CHANNEL_ID = "zabanyar_channel"
    private const val CHANNEL_NAME = "یادآوری‌های زبان‌یار"
    private const val CHANNEL_DESCRIPTION = "اعلان‌های یادگیری روزانه"

    // ============ ایجاد کانال اعلان ============
    fun createNotificationChannel(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = CHANNEL_DESCRIPTION
                enableLights(true)
                enableVibration(true)
            }

            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

    // ============ نمایش اعلان ============
    fun showNotification(
        context: Context,
        title: String,
        message: String,
        notificationId: Int = 1
    ) {
        createNotificationChannel(context)

        // Intent برای باز کردن اپ
        val intent = context.packageManager
            .getLaunchIntentForPackage(context.packageName)
            ?.apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }

        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle(title)
            .setContentText(message)
            .setStyle(NotificationCompat.BigTextStyle().bigText(message))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        try {
            NotificationManagerCompat.from(context).notify(notificationId, builder.build())
        } catch (e: SecurityException) {
            // کاربر مجوز نداده
        }
    }

    // ============ اعلان‌های آماده ============

    fun showDailyReminder(context: Context) {
        val messages = listOf(
            "🔥 وقت یادگیری زبان انگلیسیه! بیا ۱۰ دقیقه تمرین کنیم.",
            "📚 امروز یه درس جدید یاد بگیر!",
            "⭐ با یه درس کوچیک، امتیاز بزرگ بگیر!",
            "🎯 هدفت یادگیری روزانه‌ست. آماده‌ای؟",
            "🎧 یه پادکست انگلیسی گوش کن و لذت ببر!"
        )
        val randomMessage = messages.random()

        showNotification(
            context = context,
            title = "🎓 زبان‌یار AI",
            message = randomMessage,
            notificationId = 100
        )
    }

    fun showAchievementNotification(context: Context, achievementTitle: String) {
        showNotification(
            context = context,
            title = "🏆 دستاورد جدید!",
            message = "تبریک! تو دستاورد «$achievementTitle» رو باز کردی.",
            notificationId = 200
        )
    }

    fun showLessonCompleteNotification(context: Context, lessonTitle: String) {
        showNotification(
            context = context,
            title = "✅ درس کامل شد",
            message = "آفرین! درس «$lessonTitle» رو با موفقیت تموم کردی.",
            notificationId = 300
        )
    }

    fun showStreakNotification(context: Context, days: Int) {
        showNotification(
            context = context,
            title = "🔥 پیوستگی $days روزه!",
            message = "تو $days روزه پیوسته داری تمرین می‌کنی. فوق‌العاده‌ست!",
            notificationId = 400
        )
    }
}