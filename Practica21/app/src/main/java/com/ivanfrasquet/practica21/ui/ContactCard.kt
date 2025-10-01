package com.ivanfrasquet.practica21.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ContactCard(phone: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {
        Column (
            modifier = modifier
        )
        {
            ContactRow(
                icon = Icons.Default.Phone,
                text = phone,
                modifier = modifier
            )
            ContactRow(
                icon = Icons.Default.Email,
                text = email,
                modifier = modifier

            )
            ContactRow(
                icon = Icons.Default.Share,
                text = socialMedia,
                modifier = modifier

            )
    }
}