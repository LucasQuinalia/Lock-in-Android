package com.example.lockin.model

import java.time.LocalDate

data class Task (
    val id: Long,
    var dueDate: LocalDate,
    val focus: Focus,
    var status: TaskStatus = TaskStatus.PENDING
)