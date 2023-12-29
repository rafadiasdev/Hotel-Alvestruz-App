package com.example.hotelalvestruz.screens.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.hotelalvestruz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldUsername(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    icon: Int = R.drawable.ic_person
) {

    TextField(
        value,
        onValueChange,
        modifier,
        label = {
            Text(
                text = hint,
                color = Color.Black
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            cursorColor = Color.Black
        ),
        maxLines = 1,
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 18.sp
        ),
        keyboardOptions = keyboardOptions,
        leadingIcon = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null
            )
        }
    )
}


@Composable
@Preview
private fun TextFieldCustomPreview() {
    var username by remember {
        mutableStateOf("")
    }
    TextFieldUsername(
        value = username,
        onValueChange = {
            username = it
        },
        hint = stringResource(R.string.hint_password)
    )
}