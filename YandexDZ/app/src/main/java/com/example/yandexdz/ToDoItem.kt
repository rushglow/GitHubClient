package com.example.yandexdz

import java.util.Date

data class ToDoItem(
    val id: String,
    val done: Boolean,
    val text: String,
    val deadLine: Date,
    val createDate: Date,
    val changeDate: Date
)