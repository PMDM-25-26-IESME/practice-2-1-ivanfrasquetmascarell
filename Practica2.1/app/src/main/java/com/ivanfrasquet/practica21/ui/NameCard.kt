package com.ivanfrasquet.practica21.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource


@Composable
fun NameCard(@DrawableRes icon: Int, name: String, job: String, modifier: Modifier = Modifier) {

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(1.dp, 1.dp, 1.dp, 80.dp)
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "Android icon",
            modifier = Modifier.size(120.dp),
            contentScale = ContentScale.Fit,
        )
        Text (
            text = name,
            fontSize = 34.sp,
            lineHeight = 37.sp,
            textAlign = TextAlign.Center
        )
        Text (
            text = job,
            fontSize = 14.sp,
            lineHeight = 37.sp,
            textAlign = TextAlign.Center
        )
    }
}