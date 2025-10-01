package com.ivanfrasquet.practica21

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ivanfrasquet.practica21.ui.BusinessCard
import com.ivanfrasquet.practica21.ui.theme.Practica21Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard(
                name = "Ivan Frasquet",
                job = "Student",
                phone = "+34 555 66 77 88",
                socialMedia = "@mymedia",
                email = "myemail@mail.com",
                icon = R.drawable.android_logo__1_
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BusinessPreview() {

    BusinessCard(
        name = "Ivan Frasquet",
        job = "Student",
        phone = "+34 555 66 77 88",
        socialMedia = "@mymedia",
        email = "myemail@mail.com",
        icon = R.drawable.android_logo__1_
    )
}