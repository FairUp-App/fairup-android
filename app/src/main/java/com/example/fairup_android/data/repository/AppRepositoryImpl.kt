package com.example.fairup_android.data.repository

import com.example.fairup_android.domain.repository.AppRepository
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor() : AppRepository {

    override suspend fun getWelcomeMessage(): String {
        return "FairUp Clean Architecture is ready 🚀"
    }
}