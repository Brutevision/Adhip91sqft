package com.example.adhip91sqft.networking

import com.example.adhip91sqft.models.ApiResponse
import com.example.adhip91sqft.utils.Constant
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {

    @GET(Constant.Networking.END_POINT)
    @Headers("Accept: application/json", "Content-Type: application/json")
    suspend fun getData() : ApiResponse
}