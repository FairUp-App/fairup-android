package com.example.fairup_android.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.fairup_android.data.local.dao.*
import com.example.fairup_android.data.local.entity.*

@Database(
    entities = [
        UserEntity::class,
        GroupEntity::class,
        ExpenseEntity::class,
        SplitEntity::class,
        ReminderEntity::class,
        ReceiptEntity::class
    ],
    version = 1
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun groupDao(): GroupDao
    abstract fun expenseDao(): ExpenseDao
    abstract fun splitDao(): SplitDao
    abstract fun reminderDao(): ReminderDao
    abstract fun receiptDao(): ReceiptDao
}