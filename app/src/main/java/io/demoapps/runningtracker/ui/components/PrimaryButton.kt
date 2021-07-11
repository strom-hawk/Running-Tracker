package io.demoapps.runningtracker.ui.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun PrimaryButtonView(){
    PrimaryButton(
        text = "Primary Button",
        background = -1,
        modifier = Modifier)
}

@Composable
fun PrimaryButton(
    text: String,
    background: Int,
    modifier: Modifier
){
    Button(
        onClick = {

        },
        enabled = true,
        modifier = modifier
    ){
        Text(text = text)
    }
}