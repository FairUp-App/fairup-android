package com.example.fairup_android.domain.repository

interface AppRepository {

    suspend fun getWelcomeMessage(): String

}