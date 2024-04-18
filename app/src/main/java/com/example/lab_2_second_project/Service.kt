package com.example.lab_2_second_project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Service(navController: NavHostController) {
    val gradient = Brush.horizontalGradient(
        colors = listOf(Color.Gray, Color.White),
        startX = 0f,
        endX = 1000f
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.kitchen),
                contentDescription = "Service",
                modifier = Modifier.size(width = 150.dp, height = 150.dp)
            )
            Text(
                text = "Vår tjänst för Köksorganisation är utformad för att skapa ett effektivt och inbjudande kök.",
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.contain),
                contentDescription = "Service",
                modifier = Modifier.size(width = 150.dp, height = 150.dp)
            )
            Text(
                text = "Med vår Garderobsorganisationstjänst hjälper\n" +
                        "vi dig att ta kontroll över dina kläder och accessoarer.",
                modifier = Modifier.padding(start = 16.dp)
            )
        }


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Service",
                modifier = Modifier.size(width = 150.dp, height = 150.dp)
            )
            Text(
                text = "Vårt erbjudande för Vardagsrumsorganisation\n" +
                        "är avsett att transformera ditt vardagsrum till en avkopplande\n" +
                        "och välorganiserad samlingsplats.",
                modifier = Modifier.padding(start = 16.dp)

            )
        }

        Spacer(modifier = Modifier.height(50.dp))


        Button(
            onClick = { navController.navigate(Routes.Screen.Welcome.route) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                    .fillMaxWidth()
                .padding(horizontal = 140.dp)
        ) {
            Text(text = "Sign out")

        }
    }
}

