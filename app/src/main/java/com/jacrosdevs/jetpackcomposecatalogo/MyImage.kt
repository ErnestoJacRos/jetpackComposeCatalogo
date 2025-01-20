package com.jacrosdevs.jetpackcomposecatalogo

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyIcon(modifier: Modifier = Modifier) {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = null,
        tint = Color.Green
    )
}

@Preview
@Composable
fun MyImageAdvance(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        //modifier = Modifier.clip(shape = RoundedCornerShape(25F))
        //totalmente redondo
        modifier = Modifier
            .clip(shape = CircleShape)
            .border(5.dp, Color.Red, shape = CircleShape)
    )
}


@Preview
@Composable
fun MyImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        alpha = 0.5f
    )
}
