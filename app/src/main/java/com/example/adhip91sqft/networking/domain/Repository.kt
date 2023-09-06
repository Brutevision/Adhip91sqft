package com.example.adhip91sqft.networking.domain

import com.example.adhip91sqft.models.ApiResponse
import com.example.adhip91sqft.utils.Result
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun getData() : Flow<Result<ApiResponse>>
}