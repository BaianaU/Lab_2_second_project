package com.example.lab_2_second_project

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Screen.Welcome.route) {
        composable(Routes.Screen.Welcome.route) { WelcomePage(navController) }
        composable(Routes.Screen.SignUp.route) { SignUp(navController) }
        composable(Routes.Screen.Login.route) { Login(navController) }
        composable(Routes.Screen.Service.route) { Service(navController) }
    }
}

