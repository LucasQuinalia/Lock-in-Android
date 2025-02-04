package com.example.lockin.model

data class User (
    val id: Long,
    var name: String,
    val email: String,
    val password: String,
    var focus: Focus
)