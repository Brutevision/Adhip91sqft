package com.example.adhip91sqft

import com.example.adhip91sqft.models.ApiResponse
import com.example.adhip91sqft.networking.ApiService
import com.example.adhip91sqft.networking.Retrofit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api: Retrofit
) : Repository {

    private val retrofit = api.getInstance()
    private val userApi = retrofit.create(ApiService::class.java)

    override suspend fun getData(): Flow<Result<ApiResponse>> {
        return flow {
            emit(Result.Loading(true))
            val response = userApi.getData()
            if(response.success == true) {
                emit(Result.Success(response))
            }
        }
    }
}