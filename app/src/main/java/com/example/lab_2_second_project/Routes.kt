package com.example.lab_2_second_project

object Routes {
    sealed class Screen(val route: String){
        object Welcome : Screen("welcome")
        object SignUp : Screen("signup")
        object Login : Screen("login")
        object Service : Screen("service")
    }
}