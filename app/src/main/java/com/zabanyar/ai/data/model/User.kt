package com.zabanyar.ai.data.model

data class User(
    val id: Long = System.currentTimeMillis(),
    val email: String,
    val name: String,
    val password: String,
    val apiKey: String = "",
    val level: String = "BEGINNER",
    val joinDate: Long = System.currentTimeMillis(),
    val lastLogin: Long = System.currentTimeMillis()
)