package io.demoapps.runningtracker.ui.components.edittext

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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.components.CustomEditText

const val editText = "editText"

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
    hint: String,
    layoutId: String,
    height: Dp,
    padding: Dp,
    icon: Int
) {
    val modifier = Modifier
        .background(colorResource(id = R.color.primary_orange))
        .height(height = height)
        .layoutId(layoutId)
        .clip(RoundedCornerShape(10.dp))

    val constraintSet = ConstraintSet {
        val buttonText = createRefFor(editText)

        constrain(buttonText) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
    }

    ConstraintLayout(
        constraintSet = constraintSet,
        modifier = modifier
    ) {
        AddEditText(hint)
    }
}

@Composable
fun AddEditText(text: String) {
    val modifier = Modifier.layoutId(editText)

    CustomEditText(
        hint = text,
        modifier = modifier
    )
}