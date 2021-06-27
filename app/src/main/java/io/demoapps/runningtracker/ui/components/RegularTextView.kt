package io.demoapps.runningtracker.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
        R.string.app_name,
        R.color.primary_orange,
        15.sp
    )
}

@Composable
fun RegularTextView(
    text: Int,
    textColor: Int,
    fontSize: TextUnit
) {
    Text(
        stringResource(id = text),
        color = colorResource(id = textColor),
        fontSize = fontSize
    )
}