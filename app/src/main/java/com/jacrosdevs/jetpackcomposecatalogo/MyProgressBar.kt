package com.jacrosdevs.jetpackcomposecatalogo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressAdvance(modifier: Modifier = Modifier) {

    var progress by remember{mutableStateOf(0.0F)}
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)  {

        CircularProgressIndicator(
            progress = {progress}
        )

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Button(onClick = {
                if (progress > 1f) {
                    progress = 0f
                } else {
                    progress += 0.1f
                }
            }) {
                Text(text = "Incremento")
            }


            Button(onClick = {
                if (progress <= 0f) {
                    progress = 1f
                } else {
                    progress -= 0.1f
                }
            }) {
                Text(text = "Decremento")
            }
        }
    }
}

@Preview
@Composable
fun MyProgressBar(modifier: Modifier = Modifier) {

    var showLoading  by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
       if (showLoading){
           CircularProgressIndicator(
               //progress = { 0.5f },
               color = Color.Green,
               strokeWidth = 5.dp
           )

           LinearProgressIndicator(
               modifier = Modifier.padding(top = 64.dp),
               trackColor = Color.Red,
               color = Color.Yellow
           )
       }
        Button(onClick = {showLoading = !showLoading}) {
            Text(text = "Cargar perfil")

        }
    }
}