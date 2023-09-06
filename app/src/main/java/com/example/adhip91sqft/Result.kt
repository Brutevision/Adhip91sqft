package com.example.adhip91sqft

sealed class Result<out T> {
    data class Success<out T>(val data: T? = null, val status: String? = null): Result<T>()
    data class Failed<out T>(val status: String? = null, val message: String? = null): Result<Nothing>()
    data class Loading(val isLoading: Boolean): Result<Nothing>()
}
