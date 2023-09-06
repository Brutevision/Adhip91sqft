package com.example.adhip91sqft.models

data class ApiResponse(
    val code: Int,
    val data: List<Data>,
    val errors: Any,
    val message: String,
    val success: Boolean
)