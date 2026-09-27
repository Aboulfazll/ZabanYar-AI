package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.zabanyar.ai.data.DictionaryEntry
import com.zabanyar.ai.data.SpeechHelper

/**
 * 📖 پاپ‌آپ دیکشنری — با کلیک روی کلمه باز می‌شود
 */
@Composable
fun WordPopupDialog(
    word: String,
    entry: DictionaryEntry?,
    speechHelper: SpeechHelper,
    onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {

                // ─── هدر آبی ───
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                listOf(Color(0xFF3949AB), Color(0xFF1A237E))
                            )
                        )
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            word,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.weight(1f)
                        )
                        IconButton(
                            onClick = onDismiss,
                            modifier = Modifier.size(32.dp)
                        ) {
                            Icon(
                                Icons.Filled.Close,
                                "بستن",
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }

                // ─── محتوا ───
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    if (entry == null) {
                        // ─── کلمه یافت نشد ───
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 20.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("🔍", fontSize = 20.sp)
                            Spacer(Modifier.width(8.dp))
                            Text(
                                "معنی این کلمه در دیکشنری نیست",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                        }

                        Spacer(Modifier.height(8.dp))

                        // دکمه پخش تلفظ
                        Button(
                            onClick = { speechHelper.speak(word) },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF1A237E)
                            )
                        ) {
                            Icon(Icons.Filled.VolumeUp, null, tint = Color.White)
                            Spacer(Modifier.width(8.dp))
                            Text("پخش تلفظ", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    } else {
                        // ─── تلفظ US ───
                        if (entry.us.isNotEmpty()) {
                            PronunciationRow(
                                label = "US",
                                phonetic = entry.us,
                                accentColor = Color(0xFF1976D2),
                                onPlay = { speechHelper.speak(word) }
                            )
                            Spacer(Modifier.height(10.dp))
                        }

                        // ─── تلفظ UK ───
                        if (entry.uk.isNotEmpty()) {
                            PronunciationRow(
                                label = "UK",
                                phonetic = entry.uk,
                                accentColor = Color(0xFFC62828),
                                onPlay = { speechHelper.speak(word) }
                            )
                            Spacer(Modifier.height(16.dp))
                        }

                        // ─── خط جداکننده ───
                        Divider(color = Color(0xFFEEEEEE))
                        Spacer(Modifier.height(12.dp))

                        // ─── معنی فارسی ───
                        Text(
                            "🇮🇷 معنی",
                            fontSize = 12.sp,
                            color = Color.Gray,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(Modifier.height(8.dp))

                        entry.persian.forEach { meaning ->
                            Row(
                                modifier = Modifier.padding(vertical = 3.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(6.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF3949AB))
                                )
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    meaning,
                                    fontSize = 15.sp,
                                    color = Color(0xFF1A237E),
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    // ─── دکمه بستن ───
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("بستن", color = Color(0xFF1A237E), fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

/**
 * 🔊 ردیف تلفظ با دکمه پخش
 */
@Composable
private fun PronunciationRow(
    label: String,
    phonetic: String,
    accentColor: Color,
    onPlay: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(accentColor.copy(alpha = 0.08f))
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            "$label:",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = accentColor,
            modifier = Modifier.width(36.dp)
        )
        Text(
            phonetic,
            fontSize = 14.sp,
            color = Color(0xFF1A237E),
            modifier = Modifier.weight(1f)
        )
        IconButton(
            onClick = onPlay,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(accentColor.copy(alpha = 0.15f))
        ) {
            Icon(
                Icons.Filled.VolumeUp,
                "پخش",
                tint = accentColor,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}