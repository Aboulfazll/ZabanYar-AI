package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.UserManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ApiKeyScreen(
    onBack: () -> Unit,
    onSaved: () -> Unit = {}
) {
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current
    val user = remember { UserManager.getLoggedInUser(context) }

    var apiKey by remember { mutableStateOf(user?.apiKey ?: "") }
    var showKey by remember { mutableStateOf(false) }
    var savedMessage by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "🔑 کلید API",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 17.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = PrimaryColor)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            // ==================== هدر ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                listOf(PrimaryColor, SecondaryColor)
                            )
                        )
                        .padding(20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🤖", fontSize = 28.sp)
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "معلم هوشمند زبان",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                "برای استفاده از AI، کلید رایگان Groq رو وارد کن",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== راهنما ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        "📝 چطور کلید بگیرم؟",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
                    Spacer(Modifier.height(12.dp))

                    StepItem("۱", "به سایت Groq برو", "console.groq.com")
                    StepItem("۲", "با ایمیل یا گوگل ثبت‌نام کن", "کاملاً رایگانه")
                    StepItem("۳", "از بخش API Keys، یه کلید جدید بساز", "شروع با sk-")
                    StepItem("۴", "کلید رو کپی کن و اینجا وارد کن", "")

                    Spacer(Modifier.height(14.dp))

                    Button(
                        onClick = {
                            uriHandler.openUri("https://console.groq.com/keys")
                        },
                        modifier = Modifier.fillMaxWidth().height(48.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = SecondaryColor
                        )
                    ) {
                        Text(
                            "🔗 باز کردن سایت Groq",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== ورودی کلید ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        "🔑 کلید API شما",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
                    Spacer(Modifier.height(12.dp))

                    OutlinedTextField(
                        value = apiKey,
                        onValueChange = {
                            apiKey = it
                            savedMessage = false
                        },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text("sk-...", fontSize = 13.sp)
                        },
                        visualTransformation = if (showKey)
                            VisualTransformation.None
                        else
                            PasswordVisualTransformation(),
                        trailingIcon = {
                            IconButton(onClick = { showKey = !showKey }) {
                                Icon(
                                    imageVector = if (showKey) Icons.Filled.Visibility
                                    else Icons.Filled.VisibilityOff,
                                    contentDescription = "Toggle",
                                    tint = Color.Gray
                                )
                            }
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = PrimaryColor,
                            unfocusedBorderColor = Color.LightGray
                        )
                    )

                    Spacer(Modifier.height(14.dp))

                    Button(
                        onClick = {
                            val success = UserManager.updateApiKey(context, apiKey.trim())
                            if (success) {
                                savedMessage = true
                                onSaved()
                            }
                        },
                        modifier = Modifier.fillMaxWidth().height(50.dp),
                        shape = RoundedCornerShape(12.dp),
                        enabled = apiKey.isNotBlank(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = PrimaryColor
                        )
                    ) {
                        Icon(Icons.Filled.Check, null, modifier = Modifier.size(20.dp))
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "ذخیره کلید",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }

                    if (savedMessage) {
                        Spacer(Modifier.height(12.dp))
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFE8F5E9)
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text("✅", fontSize = 18.sp)
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    "کلید با موفقیت ذخیره شد!",
                                    fontSize = 12.sp,
                                    color = Color(0xFF2E7D32),
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== نکته امنیتی ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3F2FD)
                )
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Text("🔒", fontSize = 22.sp)
                    Spacer(Modifier.width(10.dp))
                    Column {
                        Text(
                            "امنیت کلید شما",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1565C0)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            "کلید فقط روی گوشی خودت ذخیره میشه و به هیچ سروری فرستاده نمیشه.",
                            fontSize = 11.sp,
                            color = Color(0xFF424242),
                            lineHeight = 18.sp
                        )
                    }
                }
            }

            Spacer(Modifier.height(30.dp))
        }
    }
}

@Composable
private fun StepItem(number: String, title: String, subtitle: String) {
    Row(
        modifier = Modifier.padding(vertical = 6.dp),
        verticalAlignment = Alignment.Top
    ) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(PrimaryColor.copy(alpha = 0.15f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                number,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )
        }
        Spacer(Modifier.width(12.dp))
        Column {
            Text(
                title,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF424242)
            )
            if (subtitle.isNotEmpty()) {
                Text(
                    subtitle,
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }
        }
    }
}