package io.demoapps.runningtracker.ui.components.buttons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.components.RegularTextView

const val leftLogo = "leftLogo"
const val buttonText = "buttonText"

@Preview(showBackground = true)
@Composable
fun RenderLeftDrawableEditText() {
    LeftDrawableEditText(
        stringResource(id = R.string.app_name),
        "",
        50.dp,
        20.dp,
        R.drawable.mobile
    )
}

@Composable
fun LeftDrawableEditText(
    textOnButton: String,
    layoutId: String,
    height: Dp,
    padding: Dp,
    icon: Int
) {
    val modifier = Modifier
        .background(colorResource(id = R.color.primary_orange))
        .height(height = height)
        .layoutId(layoutId)
        .padding(padding, 0.dp, padding, 0.dp)
        .clip(RoundedCornerShape(10.dp))

    val constraintSet = ConstraintSet {
        val leftLogo = createRefFor(leftLogo)
        val buttonText = createRefFor(buttonText)

        constrain(leftLogo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
        }

        constrain(buttonText) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(leftLogo.end, margin = 15.dp)
            end.linkTo(parent.end)
        }
    }

    ConstraintLayout(
        constraintSet = constraintSet,
        modifier = modifier
    ) {
        AddLeftDrawable(icon)
        AddButtonText(textOnButton)
    }
}

@Composable
fun AddLeftDrawable(
    icon: Int
) {
    val width = 20.dp
    val height = 20.dp

    val modifier = Modifier
        .size(width, height)
        .layoutId(leftLogo)

    Image(
        painter = painterResource(id = icon),
        contentDescription = null,
        modifier = modifier
    )
}

@Composable
fun AddButtonText(text: String) {
    val modifier = Modifier.layoutId(buttonText)

    RegularTextView(
        text = text,
        textColor = R.color.white,
        18.sp,
        0.5.sp,
        modifier = modifier
    )
}