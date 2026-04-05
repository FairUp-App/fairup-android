package com.example.fairup_android.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "expenses")
data class ExpenseEntity(
    @PrimaryKey val expenseId: String,
    val groupId: String,
    val paidBy: String,
    val amount: Double,
    val description: String,
    val createdAt: Date
)