package com.jacrosdevs.jetpackcomposecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jacrosdevs.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeCatalogoTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    MyProgressAdvance()
                }
            }
        }
    }
}

@Composable
fun MyStateCompose(modifier: Modifier = Modifier) {
    //podemos usar "by or =" en el state pero con "by"
    // importamos getValue y setValue y con "=" accedemos
    //a la variable.value
    var contador by rememberSaveable { mutableStateOf(0) }
    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {contador++}) {
            Text(text = "Pulsar")
        }

        Text(
            text = "He sido pulsado ${contador} veces"
        )
    }


}


@Composable
fun MyComplexLayout(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Text(text = "Hola Soy Neto")
        }
        Spacer(Modifier.height(16.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red), contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola soy Ernesto")
            }
            Spacer(Modifier.width(16.dp))
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue), contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola soy JacrosDevs")
            }
        }
        Spacer(Modifier.height(16.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan)
                .background(Color.Green), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Hola soy un humano mas ordinario que el promedio")
        }
    }
}

@Composable
fun MyRow() {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {
//        Text(text = "Ejemplo1",Modifier.background(Color.Red).weight(1f))
//        Text(text = "Ejemplo2",Modifier.background(Color.Blue).weight(1f))
//        Text(text = "Ejemplo3",Modifier.background(Color.Yellow).weight(1f))
        Text(text = "Ejemplo1", Modifier.background(Color.Red))
        Text(text = "Ejemplo2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo3", Modifier.background(Color.Yellow))
        Text(text = "Ejemplo1", Modifier.background(Color.Red))
        Text(text = "Ejemplo2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo3", Modifier.background(Color.Yellow))
        Text(text = "Ejemplo1", Modifier.background(Color.Red))
        Text(text = "Ejemplo2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo3", Modifier.background(Color.Yellow))
        Text(text = "Ejemplo1", Modifier.background(Color.Red))
        Text(text = "Ejemplo2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo3", Modifier.background(Color.Yellow))
        Text(text = "Ejemplo1", Modifier.background(Color.Red))
        Text(text = "Ejemplo2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo3", Modifier.background(Color.Yellow))
        Text(text = "Ejemplo1", Modifier.background(Color.Red))
        Text(text = "Ejemplo2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo3", Modifier.background(Color.Yellow))

    }
}

@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
    }
}

@Composable
fun MyBox() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center// centra tanto horizontal y verticalmente exclusivo de Box and Row
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(Color.Cyan)
                .verticalScroll(rememberScrollState()),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Esto es un ejemplo", color = Color.Magenta
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeCatalogoTheme {
        MyStateCompose()
    }
}