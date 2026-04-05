package com.example.fairup_android.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "receipts")
data class ReceiptEntity(
    @PrimaryKey val receiptId: String,
    val expenseId: String,
    val imageUrl: String
)