package io.demoapps.runningtracker.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import io.demoapps.runningtracker.R

/**
 * Regular Text View Element to be used in the entire app to keep consistency.
 */

@Preview(showBackground = true)
@Composable
fun DefaultView() {
    RegularTextView(
        stringResource(id = R.string.app_name),
        R.color.primary_orange,
        15.sp,
        0.5.sp,
        modifier = Modifier
    )
}

@Composable
fun RegularTextView(
    text: String,
    textColor: Int,
    fontSize: TextUnit,
    letterSpacing: TextUnit,
    modifier: Modifier
) {
    Text(
        text,
        color = colorResource(id = textColor),
        fontSize = fontSize,
        letterSpacing = letterSpacing,
        modifier = modifier
    )
}