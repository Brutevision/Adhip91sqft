package com.example.adhip91sqft.networking.domain

import com.example.adhip91sqft.models.ApiResponse
import com.example.adhip91sqft.utils.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface BaseUseCase<out R>{
    suspend operator fun invoke(): Flow<Result<R>>
}

typealias GetDataBaseUseCase = BaseUseCase<ApiResponse>

class UseCase @Inject constructor(
    private val repository: Repository
) : GetDataBaseUseCase {
    override suspend fun invoke(): Flow<Result<ApiResponse>> = repository.getData()
}