package io.demoapps.runningtracker.ui.components.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieAnimationSpec
import com.airbnb.lottie.compose.rememberLottieAnimationState
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.theme.RunningTrackerTheme

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RunningTrackerTheme {
        ParentLayout()
    }
}

@Composable
fun ParentLayout() {
    LogoLottieAnimation()
}

@Composable
fun LogoLottieAnimation() {
    val animationSpec = remember { LottieAnimationSpec.RawRes(R.raw.running_tracker) }
    val animationState =
        rememberLottieAnimationState(autoPlay = true, repeatCount = Integer.MAX_VALUE)

    LottieAnimation(animationSpec, animationState = animationState)
}