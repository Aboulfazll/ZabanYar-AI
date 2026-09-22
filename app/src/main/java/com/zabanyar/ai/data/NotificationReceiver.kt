package com.zabanyar.ai.data

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        // نمایش اعلان روزانه
        NotificationHelper.showDailyReminder(context)

        // زمان‌بندی مجدد برای فردا
        NotificationScheduler.scheduleDailyNotification(context)
    }
}