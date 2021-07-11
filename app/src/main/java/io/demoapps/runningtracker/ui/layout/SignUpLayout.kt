package io.demoapps.runningtracker.ui.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.demoapps.runningtracker.R
import io.demoapps.runningtracker.ui.components.RegularTextView

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SignUpParentLayout()
}

@Composable
fun SignUpParentLayout() {
    val modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.primary_dark))

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AddSignUpImage()
        RegularTextView(
            text = R.string.app_name,
            textColor = R.color.primary_orange,
            fontSize = 18.sp,
            letterSpacing = 0.sp
        )
    }
}

@Composable
fun AddSignUpImage(){
    val width = 200.dp
    val height = 200.dp

    val modifier = Modifier.size(width, height)
    Image(
        painter = painterResource(id = R.drawable.app_logo),
        contentDescription = null,
        modifier = modifier
    )
}