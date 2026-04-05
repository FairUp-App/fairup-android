package com.example.fairup_android.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fairup_android.data.local.entity.ReminderEntity

@Dao
interface ReminderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(reminder: ReminderEntity)

    @Query("SELECT * FROM reminders WHERE reminderId = :id")
    suspend fun getReminder(id: String): ReminderEntity?
}