package io.demoapps.runningtracker.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.demoapps.runningtracker.R

/**
 * Regular Text View Element to be used in the entire app to keep consistency.
 */

@Preview(showBackground = true)
@Composable
fun DefaultView() {
    RegularTextView(R.string.app_name)
}

@Composable
fun RegularTextView(text: Int) {
    Text(stringResource(id = text))
}