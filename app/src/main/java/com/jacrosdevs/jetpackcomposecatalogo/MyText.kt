package com.jacrosdevs.jetpackcomposecatalogo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyText(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Esto es un ejemplo")
        Text(text = "Text con Color", color = Color.Yellow)
        Text(text = "Cambio de peso de la letra", fontWeight = FontWeight.Bold)
        //Text(text = "Esto es un ejemplo", fontFamily = FontFamily())
    }
}