package com.rodrigobravo.practica2.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun DetailScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column() {
            Text(
                text = "¿Quienes soy?",
                style = MaterialTheme.typography.h4
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
            )
            Text(
                text = "Rodrigo Bravo Isla - 20192247",
                style = MaterialTheme.typography.h5
            )
        }
    }
}