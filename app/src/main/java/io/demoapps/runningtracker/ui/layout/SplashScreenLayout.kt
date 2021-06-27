package io.demoapps.runningtracker.ui.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.demoapps.runningtracker.R

/**
 * This file is used for the layout of the splashscreen.
 */

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SplashScreenParentLayout()
}

/**
 * Parent function for SplashScreen.
 */
@Composable
fun SplashScreenParentLayout() {
    val modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.primary_dark))

    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        AddLogoImage()
    }
}

@Composable
fun AddLogoImage() {
    val width = 100.dp
    val height = 100.dp

    val modifier = Modifier.size(width = width, height = height)

    Image(
        painter = painterResource(id = R.drawable.app_logo),
        contentDescription = null,
        modifier = modifier
    )
}