package io.demoapps.runningtracker.ui.layout

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.components.RegularTextView

@Composable
fun SignUpParentLayout(){
    RegularTextView(
        text = R.string.app_name,
        textColor = R.color.primary_orange,
        fontSize = 18.sp,
        letterSpacing = 0.sp)
}