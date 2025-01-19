package com.jacrosdevs.jetpackcomposecatalogo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

//@Preview()
@Composable
fun ConstraintExample1(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxyellow, boxMagenta, boxGreen) = createRefs()
        Box(Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })
        Box(Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                //top.linkTo(boxRed.bottom)
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            })
        Box(Modifier
            .size(125.dp)
            .background(Color.Yellow)
            .constrainAs(boxyellow) {
                end.linkTo(boxRed.start)
                bottom.linkTo(boxRed.top)
                //top.linkTo(boxBlue.bottom)
            })
        Box(Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                //top.linkTo(boxyellow.bottom)
                start.linkTo(boxRed.end)
                bottom.linkTo(boxRed.top)
            })
        Box(Modifier
            .size(125.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                //top.linkTo(boxyellow.bottom)
                end.linkTo(boxRed.start)
                top.linkTo(boxRed.bottom)
            })

    }
}

@Preview
@Composable
fun ConstraintExampleGuide(modifier: Modifier = Modifier) {
    
    ConstraintLayout(Modifier.fillMaxSize()) {
        val boxRed = createRef()
        //0 hasta 1 example 0.1 = 10%
        val topGuide = createGuidelineFromTop(0.1f)
        val startGuide = createGuidelineFromStart(0.1f)
        val endGuide = createGuidelineFromEnd(0.1f)
        val bottomGuide = createGuidelineFromBottom(0.1f)

        Box(Modifier
            .size(150.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
//                top.linkTo(topGuide)
//                start.linkTo(startGuide)
//                end.linkTo(endGuide)
//                bottom.linkTo(bottomGuide)

                linkTo(
                    top = topGuide,
                    start = startGuide,
                    bottom = bottomGuide,
                    end = endGuide,
                )
            })

    }
}
@Preview
@Composable
fun ConstraintBarrier(modifier: Modifier = Modifier) {
   ConstraintLayout(Modifier.fillMaxSize()) {
       val (boxRed, boxBlue, boxCyan) = createRefs()
       val barrier = createBottomBarrier(boxBlue)

       Box(Modifier
           .size(65.dp)
           .background(Color.Red)
           .constrainAs(boxRed) {
               top.linkTo(parent.top)
               start.linkTo(parent.start)
           })

       Box(Modifier
           .size(200.dp)
           .background(Color.Blue)
           .constrainAs(boxBlue) {
               top.linkTo(boxRed.bottom, margin = 40.dp)
               start.linkTo(boxRed.start, margin = 32.dp)
           })

       Box(Modifier
           .size(70.dp)
           .background(Color.Cyan)
           .constrainAs(boxCyan) {
               top.linkTo(barrier)
           })
   }

}
@Preview()
@Composable
fun ConstraintChain(modifier: Modifier = Modifier) {

    ConstraintLayout(Modifier.fillMaxSize()) {

        val (boxRed, boxBlue, boxCyan) = createRefs()


        Box(Modifier
            .size(100.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(boxBlue.top)
            })

        Box(Modifier
            .size(100.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(boxRed.bottom)
                bottom.linkTo(boxCyan.top
                )
            })

        Box(Modifier
            .size(100.dp)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(boxBlue.bottom)
                bottom.linkTo(parent.bottom)
            })

        createVerticalChain(boxRed, boxBlue, boxCyan, chainStyle = ChainStyle.Spread)

    }
}
