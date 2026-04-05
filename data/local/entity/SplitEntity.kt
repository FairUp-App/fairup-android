package com.example.fairup_android.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "splits")
data class SplitEntity(
    @PrimaryKey val splitId: String,
    val expenseId: String,
    val userId: String,
    val amount: Double
)