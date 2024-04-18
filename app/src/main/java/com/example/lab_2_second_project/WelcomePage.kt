package com.example.lab_2_second_project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun WelcomePage(navController: NavHostController){

    val gradient = Brush.horizontalGradient(
        colors = listOf(Color.Gray , Color.White),
        startX = 0f,
        endX = 1000f
    )

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient)
            .padding(horizontal = 14.dp)
    ) {
        Spacer(modifier = Modifier.height(25.dp))
        Image(painter = painterResource(id = R.drawable.main),contentDescription = "WelcomePage")

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Welcome to Your Ultimate Space Organization Solution!" +
                    "We believe that every space has the potential to be transformed into a perfectly organized, highly functional haven. " +
                    "Whether you're looking to declutter your home, optimize your office, or revolutionize your storage areas, our team of expert organizers is here to make it happen.",
            style = TextStyle(fontFamily = FontFamily.Cursive),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = { navController.navigate(Routes.Screen.Login.route) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Log in")
        }
        Spacer(modifier = Modifier.height(5.dp))


        Button(
            onClick = { navController.navigate(Routes.Screen.SignUp.route) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Sign Up")
        }
    }
    }

