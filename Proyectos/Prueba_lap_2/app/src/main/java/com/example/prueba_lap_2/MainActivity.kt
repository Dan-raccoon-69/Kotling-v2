package com.example.prueba_lap_2


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.prueba_lap_2.SaludoTheme
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {  // Asegúrate de que esta línea esté presente
            SaludoTheme {
                Saludo()
            }
        }
    }
}


@Composable
fun Saludo() {
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    var saludo by remember { mutableStateOf("") }
    val context = LocalContext.current
    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Añadido padding para mejor apariencia
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(100.dp)
                .blur(
                    radius = 8.dp,
                    edgeTreatment = BlurredEdgeTreatment(CircleShape)
                ),
            painter = painterResource(id = R.drawable.person_ic), // Asegúrate de tener esta imagen
            contentDescription = "Logo Del Saludo"
        )
        Text(text = "SALUDO", fontSize = 24.sp, fontWeight = FontWeight.Bold) // Texto más grande
        Spacer(modifier = Modifier.height(16.dp)) // Más espacio
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text(text = "Nombre") },
            modifier = Modifier.fillMaxWidth() // Campo ocupa todo el ancho
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = edad, // Faltaba asignar el valor aquí
            onValueChange = { edad = it },
            label = { Text(text = "Edad") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            if (nombre.isEmpty() || edad.isEmpty()) {
                Toast.makeText(context, "Falta Capturar Campos", Toast.LENGTH_LONG).show()
            } else {
                saludo = "Hola $nombre con $edad años"
                Toast.makeText(context, saludo, Toast.LENGTH_LONG).show()
            }
        }) {
            Text(text = "Saludar")
        }
        Spacer(modifier = Modifier.height(8.dp)) // Espacio entre botones
        Button(onClick = {
            nombre = ""
            edad = ""
            saludo = ""
            focusManager.clearFocus() // Limpia el foco de los campos
        }) {
            Text(text = "Limpiar")
        }
    }
}

