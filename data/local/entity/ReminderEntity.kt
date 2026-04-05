package com.example.fairup_android.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "reminders")
data class ReminderEntity(
    @PrimaryKey val reminderId: String,
    val userId: String,
    val message: String,
    val remindAt: Date
)