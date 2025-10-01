package com.ivanfrasquet.practica21.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment

@Composable
fun ContactRow(icon: ImageVector, text: String, modifier: Modifier) {

    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "Phone icon",
        )
        Text (
            text = text,
            fontSize = 14.sp,
            lineHeight = 37.sp,
            textAlign = TextAlign.Center
        )
    }

}