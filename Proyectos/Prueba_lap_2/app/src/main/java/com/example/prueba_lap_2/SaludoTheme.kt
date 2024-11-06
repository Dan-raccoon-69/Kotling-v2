package com.example.prueba_lap_2

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SaludoTheme(content: @Composable () -> Unit) {
    val colorScheme = lightColorScheme(
        // Aquí puedes personalizar los colores de tu tema
        // Por ejemplo:
        // primary = Purple40,
        // secondary = PurpleGrey40,
        // tertiary = Pink40
    )
    val typography = Typography(
        bodyLarge = TextStyle(
            fontFamily = FontFamily.Monospace,
            fontSize = 16.sp
        )
        // Aquí puedes personalizar la tipografía de tu tema
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
        // Aquí puedes personalizar las formas de tu tema
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}