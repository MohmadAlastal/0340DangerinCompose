package com.example.a0340dangerincompose.Composable

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun button () {
    var number = 6           //لاتستخدم هذه الطريقة
    Button(onClick = {
        number++
    }) {
          Text(text = "my Namber Now is $number ")
    }
}

@Preview(showSystemUi = true)
@Composable
fun preview () {
    button()
}