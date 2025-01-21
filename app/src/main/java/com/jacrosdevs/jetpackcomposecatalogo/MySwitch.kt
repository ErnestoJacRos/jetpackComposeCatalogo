package com.jacrosdevs.jetpackcomposecatalogo

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(true) }


    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Yellow,
            checkedThumbColor = Color.Green,
            uncheckedTrackColor = Color.Red,
            checkedTrackColor = Color.Cyan
        )

    )
}