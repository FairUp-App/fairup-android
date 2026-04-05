package com.example.fairup_android.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fairup_android.data.local.entity.SplitEntity

@Dao
interface SplitDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(split: SplitEntity)

    @Query("SELECT * FROM splits WHERE splitId = :id")
    suspend fun getSplit(id: String): SplitEntity?
}