package io.demoapps.runningtracker.ui.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
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
    LogoLottieAnimation()
    RegularTextView(R.string.app_name)
}


/**
 * Adds lottie animation for logo of the application.
 */
@Composable
fun LogoLottieAnimation() {
    val animationSpec = remember { LottieAnimationSpec.RawRes(R.raw.running_tracker) }
    val animationState =
        rememberLottieAnimationState(autoPlay = true, repeatCount = Integer.MAX_VALUE)

    LottieAnimation(animationSpec, animationState = animationState)
}