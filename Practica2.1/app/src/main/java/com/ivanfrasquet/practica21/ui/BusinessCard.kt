package com.ivanfrasquet.practica21.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun BusinessCard(@DrawableRes icon: Int, name: String, job: String, phone: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        )
        {
            NameCard(
                icon = icon,
                name = name,
                job = job,
                modifier = modifier
            )

            ContactCard(
                phone = phone,
                socialMedia = socialMedia,
                email = email,
                modifier = modifier,
            )
        }
    }

}