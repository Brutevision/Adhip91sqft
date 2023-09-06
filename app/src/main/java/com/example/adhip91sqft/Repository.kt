package com.example.adhip91sqft

import com.example.adhip91sqft.models.ApiResponse
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun getData() : Flow<Result<ApiResponse>>
}