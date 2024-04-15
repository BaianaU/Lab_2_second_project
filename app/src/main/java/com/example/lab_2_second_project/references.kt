package com.example.lab_2_second_project

data class UserCredentials(val email: String, val password: String)
val validUserCredentials = listOf(
    UserCredentials("user", "password"),

    )

fun isValidCredentials(email: String, password: String): Boolean {
    val user = UserCredentials(email, password)
    return validUserCredentials.any { it == user }
}