package com.example.lockin.model

data class Focus (
    val id: Long,
    val owner: User,
    var breakCount: Long,
    var breakDuration: Long,
    var intervalCount: Long,
    var intervalDuration: Long,
    var frequencyDuration: Double,
    var frequency: FocusFrequency,
    var task: Task
)
