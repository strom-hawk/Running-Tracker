package io.demoapps.runningtracker.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieAnimationSpec
import com.airbnb.lottie.compose.rememberLottieAnimationState
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.components.RegularTextView

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
        LogoLottieAnimation()
    }
}


/**
 * Adds lottie animation for logo of the application.
 */
@Composable
fun LogoLottieAnimation() {
    val animationSpec = remember { LottieAnimationSpec.RawRes(R.raw.running_tracker) }
    val animationState =
        rememberLottieAnimationState(autoPlay = true, repeatCount = Integer.MAX_VALUE)

    val width = 200.dp
    val height = 200.dp

    val modifier = Modifier.size(width = width, height = height)

    LottieAnimation(
        animationSpec,
        animationState = animationState,
        modifier = modifier)
}