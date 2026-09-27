package com.zabanyar.ai

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.core.content.ContextCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.navigation.compose.rememberNavController
import com.zabanyar.ai.data.FontSizeManager
import com.zabanyar.ai.data.NotificationHelper
import com.zabanyar.ai.data.NotificationScheduler
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.UserManager
import com.zabanyar.ai.ui.navigation.AppNavHost
import com.zabanyar.ai.ui.navigation.Routes

class MainActivity : ComponentActivity() {

    private val notificationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (granted) {
            scheduleNotificationsIfEnabled()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        NotificationHelper.createNotificationChannel(this)
        requestNotificationPermissionIfNeeded()

        val isLoggedIn = UserManager.isLoggedIn(this)
        val startDestination = if (isLoggedIn) Routes.HOME else Routes.LOGIN

        setContent {
            FontScaleWrapper {
                MaterialTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = Color(0xFFF5F7FA)
                    ) {
                        val navController = rememberNavController()
                        AppNavHost(
                            navController = navController,
                            startDestination = startDestination
                        )
                    }
                }
            }
        }
    }

    private fun requestNotificationPermissionIfNeeded() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            val hasPermission = ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED

            if (!hasPermission) {
                notificationPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            } else {
                scheduleNotificationsIfEnabled()
            }
        } else {
            scheduleNotificationsIfEnabled()
        }
    }

    private fun scheduleNotificationsIfEnabled() {
        if (ProgressManager.isNotificationsEnabled(this)) {
            NotificationScheduler.scheduleDailyNotification(this)
        }
    }
}

/**
 * 🅰️ اعمال اندازه فونت در کل اپ
 * هر تغییری در FontSizeManager، خودکار همه‌جا اعمال می‌شود
 */
@Composable
private fun FontScaleWrapper(content: @Composable () -> Unit) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    var fontScale by remember { mutableFloatStateOf(FontSizeManager.getFontScale(context)) }

    // گوش دادن به ON_RESUME برای خواندن مقدار جدید
    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_RESUME) {
                val newScale = FontSizeManager.getFontScale(context)
                if (newScale != fontScale) {
                    fontScale = newScale
                }
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    val currentDensity = LocalDensity.current

    CompositionLocalProvider(
        LocalDensity provides Density(
            density = currentDensity.density,
            fontScale = currentDensity.fontScale * fontScale
        )
    ) {
        content()
    }
}