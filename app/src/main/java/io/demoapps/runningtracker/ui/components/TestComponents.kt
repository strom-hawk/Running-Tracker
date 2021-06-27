package io.demoapps.runningtracker.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieAnimationSpec
import com.airbnb.lottie.compose.rememberLottieAnimationState
import io.demoapps.runningtracker.R

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