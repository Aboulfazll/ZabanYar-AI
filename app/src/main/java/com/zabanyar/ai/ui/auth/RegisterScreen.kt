package com.zabanyar.ai.ui.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(
    onRegisterSuccess: () -> Unit,
    onNavigateToLogin: () -> Unit,
    authViewModel: AuthViewModel = viewModel()
) {
    val primaryColor = Color(0xFF1A237E)
    val secondaryColor = Color(0xFF6200EE)

    var passwordVisible by remember { mutableStateOf(false) }
    var confirmPasswordVisible by remember { mutableStateOf(false) }

    // وقتی ثبت‌نام موفق شد، برو به صفحه اصلی
    LaunchedEffect(authViewModel.successUser) {
        if (authViewModel.successUser != null) {
            onRegisterSuccess()
            authViewModel.clearForm()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7FA))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            // ==================== هدر گرادیانی ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .background(
                        Brush.verticalGradient(listOf(secondaryColor, primaryColor))
                    )
            ) {
                // دکمه بازگشت
                IconButton(
                    onClick = {
                        authViewModel.clearForm()
                        onNavigateToLogin()
                    },
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.TopStart)
                ) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        "Back",
                        tint = Color.White
                    )
                }

                Column(
                    modifier = Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.2f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("✨", fontSize = 46.sp)
                    }
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "ساخت حساب جدید",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        "به ما بپیوندید و زبان یاد بگیرید",
                        fontSize = 12.sp,
                        color = Color.White.copy(alpha = 0.85f)
                    )
                }
            }

            // ==================== کارت ثبت‌نام ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .offset(y = (-30).dp),
                shape = RoundedCornerShape(24.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // فیلد نام
                    OutlinedTextField(
                        value = authViewModel.name,
                        onValueChange = {
                            authViewModel.name = it
                            authViewModel.clearError()
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("نام و نام خانوادگی") },
                        placeholder = { Text("علی محمدی") },
                        leadingIcon = {
                            Icon(Icons.Filled.Person, null, tint = primaryColor)
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(14.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = primaryColor,
                            focusedLabelColor = primaryColor,
                            cursorColor = primaryColor
                        )
                    )

                    Spacer(Modifier.height(14.dp))

                    // فیلد ایمیل
                    OutlinedTextField(
                        value = authViewModel.email,
                        onValueChange = {
                            authViewModel.email = it
                            authViewModel.clearError()
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("ایمیل") },
                        placeholder = { Text("example@mail.com") },
                        leadingIcon = {
                            Icon(Icons.Filled.Email, null, tint = primaryColor)
                        },
                        singleLine = true,
                        shape = RoundedCornerShape(14.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = primaryColor,
                            focusedLabelColor = primaryColor,
                            cursorColor = primaryColor
                        )
                    )

                    Spacer(Modifier.height(14.dp))

                    // فیلد رمز عبور
                    OutlinedTextField(
                        value = authViewModel.password,
                        onValueChange = {
                            authViewModel.password = it
                            authViewModel.clearError()
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("رمز عبور") },
                        placeholder = { Text("حداقل ۶ کاراکتر") },
                        leadingIcon = {
                            Icon(Icons.Filled.Lock, null, tint = primaryColor)
                        },
                        trailingIcon = {
                            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                                Icon(
                                    imageVector = if (passwordVisible) Icons.Filled.Visibility
                                    else Icons.Filled.VisibilityOff,
                                    contentDescription = "Toggle password",
                                    tint = Color.Gray
                                )
                            }
                        },
                        visualTransformation = if (passwordVisible)
                            VisualTransformation.None
                        else
                            PasswordVisualTransformation(),
                        singleLine = true,
                        shape = RoundedCornerShape(14.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = primaryColor,
                            focusedLabelColor = primaryColor,
                            cursorColor = primaryColor
                        )
                    )

                    Spacer(Modifier.height(14.dp))

                    // فیلد تکرار رمز عبور
                    OutlinedTextField(
                        value = authViewModel.confirmPassword,
                        onValueChange = {
                            authViewModel.confirmPassword = it
                            authViewModel.clearError()
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("تکرار رمز عبور") },
                        placeholder = { Text("رمز عبور را دوباره وارد کنید") },
                        leadingIcon = {
                            Icon(Icons.Filled.Lock, null, tint = primaryColor)
                        },
                        trailingIcon = {
                            IconButton(onClick = { confirmPasswordVisible = !confirmPasswordVisible }) {
                                Icon(
                                    imageVector = if (confirmPasswordVisible) Icons.Filled.Visibility
                                    else Icons.Filled.VisibilityOff,
                                    contentDescription = "Toggle password",
                                    tint = Color.Gray
                                )
                            }
                        },
                        visualTransformation = if (confirmPasswordVisible)
                            VisualTransformation.None
                        else
                            PasswordVisualTransformation(),
                        singleLine = true,
                        shape = RoundedCornerShape(14.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = primaryColor,
                            focusedLabelColor = primaryColor,
                            cursorColor = primaryColor
                        )
                    )

                    Spacer(Modifier.height(16.dp))

                    // نمایش خطا
                    if (authViewModel.errorMessage != null) {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFFFEBEE)
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text("⚠️", fontSize = 18.sp)
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    authViewModel.errorMessage ?: "",
                                    fontSize = 12.sp,
                                    color = Color(0xFFC62828),
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                        Spacer(Modifier.height(16.dp))
                    }

                    // دکمه ثبت‌نام
                    Button(
                        onClick = { authViewModel.register() },
                        modifier = Modifier.fillMaxWidth().height(54.dp),
                        shape = RoundedCornerShape(14.dp),
                        enabled = !authViewModel.isLoading,
                        colors = ButtonDefaults.buttonColors(containerColor = secondaryColor)
                    ) {
                        if (authViewModel.isLoading) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(22.dp),
                                color = Color.White,
                                strokeWidth = 2.dp
                            )
                        } else {
                            Text(
                                "ثبت‌نام",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    // لینک ورود
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "قبلاً ثبت‌نام کرده‌اید؟",
                            fontSize = 13.sp,
                            color = Color.Gray
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            "وارد شوید",
                            fontSize = 13.sp,
                            color = primaryColor,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.clickable {
                                authViewModel.clearForm()
                                onNavigateToLogin()
                            }
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}