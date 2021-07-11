package io.demoapps.runningtracker.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import io.demoapps.runningtracker.R

@Preview(showBackground = true)
@Composable
fun RenderCustomEditText() {
    CustomEditText(
        stringResource(id = R.string.pleaseEnterMobile),
        Modifier
    )
}

@Composable
fun CustomEditText(
    hint: String,
    modifier: Modifier
) {
    val inputValue = remember { mutableStateOf(TextFieldValue()) }

    TextField(
        value = inputValue.value,
        onValueChange = { inputValue.value = it },
        placeholder = { Text(text = hint) },
        maxLines = 1,
        textStyle = TextStyle(
            color = colorResource(id = R.color.white)
        ),
        singleLine = true,
        modifier = modifier,
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) }
    )
}