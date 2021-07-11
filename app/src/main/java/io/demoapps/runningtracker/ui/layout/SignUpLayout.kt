package io.demoapps.runningtracker.ui.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.components.PrimaryButton
import io.demoapps.runningtracker.ui.components.RegularTextView

const val signUpLogoId = "signUpLogoId"

@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SignUpParentLayout()
}

@ExperimentalComposeUiApi
@Composable
fun SignUpParentLayout() {
    val modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.primary_dark))

    val constraintSet = ConstraintSet {
        val signUpImage = createRefFor(signUpLogoId)

        constrain(signUpImage) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top, margin = 100.dp)
        }
    }

    ConstraintLayout(
        constraintSet,
        modifier = modifier
    ) {
        AddSignUpImage()
        AddEmailMobileButton()
    }
}

@Composable
fun AddSignUpImage() {
    val width = 200.dp
    val height = 200.dp

    val modifier = Modifier
        .size(width, height)
        .layoutId(signUpLogoId)

    Image(
        painter = painterResource(id = R.drawable.app_logo),
        contentDescription = null,
        modifier = modifier
    )
}

@Composable
fun AddEmailMobileButton() {
/*    PrimaryButton(
        "Primary button",
        -1
    )*/
}