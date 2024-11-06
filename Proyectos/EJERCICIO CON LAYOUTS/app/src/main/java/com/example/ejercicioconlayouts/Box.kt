package com.example.ejercicioconlayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CustomLayout() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // 1/3 de la altura total
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1", textAlign = TextAlign.Center)
        }

        Row(
            modifier = Modifier
                .weight(1f) // Ahora ocupa 1/3 de la altura total
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red), // Altura completa
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2", textAlign = TextAlign.Center)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green), // Altura completa
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3", textAlign = TextAlign.Center)
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // 1/3 de la altura total
                .background(Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 4", textAlign = TextAlign.Center)
        }
    }
}