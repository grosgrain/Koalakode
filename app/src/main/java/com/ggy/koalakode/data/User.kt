package com.ggy.koalakode.data

data class User(
    val firstName: String = "",
    val lastName: String = "",
    val email: String = ""
)

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}