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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.components.buttons.LeftDrawableEditText

const val idSignUpLogoId = "idSignUpLogoId"
const val idEmailMobileButton = "idEmailMobileButton"

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
        val signUpImage = createRefFor(idSignUpLogoId)
        val emailLoginButton = createRefFor(idEmailMobileButton)

        constrain(signUpImage) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top, margin = 150.dp)
        }

        constrain(emailLoginButton) {
            top.linkTo(signUpImage.bottom)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
    }

    ConstraintLayout(
        constraintSet,
        modifier = modifier
    ) {
        AddSignUpImage()
        AddMobileEditText()
    }
}

@Composable
fun AddSignUpImage() {
    val width = 200.dp
    val height = 200.dp

    val modifier = Modifier
        .size(width, height)
        .layoutId(idSignUpLogoId)

    Image(
        painter = painterResource(id = R.drawable.app_logo),
        contentDescription = null,
        modifier = modifier
    )
}

@Composable
fun AddMobileEditText() {

    LeftDrawableEditText(
        textOnButton = stringResource(id = R.string.emailMobile),
        idEmailMobileButton,
        50.dp,
        20.dp,
        R.drawable.mobile
    )
}