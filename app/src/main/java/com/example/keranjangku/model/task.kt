package com.example.keranjangku.model

import java.util.UUID

data class Task(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val isCompleted: Boolean = false
)

data class TaskUiState(
    val tasks: List<Task> = emptyList(),
    val inputText: String = "",
    val errorMessage: String? = null
)