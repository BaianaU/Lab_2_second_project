package com.example.lab_2_second_project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Login(navController: NavController) {
    val gradient = Brush.horizontalGradient(
        colors = listOf(Color.DarkGray , Color.White),
        startX = 0f,
        endX = 1000f
    )
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient)
    ) {
        Image(
            painter = painterResource(id = R.drawable.shelf),
            contentDescription = "Login"
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Please Log in",
            style = TextStyle(fontFamily = FontFamily.Cursive),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(5.dp))

        val email = remember { mutableStateOf("") }
        OutlinedTextField(value = email.value, onValueChange = { email.value = it }, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(4.dp))

        val password = remember { mutableStateOf("") }
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(8.dp))

        val errorMessage = remember { mutableStateOf("") }
        Text(
            text = errorMessage.value,
            color = Color.Red,
            style = TextStyle(fontSize = 14.sp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                if (isValidCredentials(email.value, password.value)) {
                    navController.navigate(Routes.Screen.Service.route)
                } else {
                    errorMessage.value = "Invalid email or password. Please try again."
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,  // Цвет фона кнопки
                contentColor = Color.White   // Цвет текста на кнопке
            ),
            shape = RoundedCornerShape(10.dp)  // Форма кнопки с закругленными углами
        ) {
            Text(text = "Log In")
        }
    }
}