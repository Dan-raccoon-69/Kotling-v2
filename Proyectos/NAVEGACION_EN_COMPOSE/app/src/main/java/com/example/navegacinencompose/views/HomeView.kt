package com.example.navegacinencompose.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.navegacinencompose.components.MainButton
import com.example.navegacinencompose.components.Space
import com.example.navegacinencompose.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavHostController) {
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }

    // Obtener los datos del savedStateHandle
    val savedStateHandle = navController.currentBackStackEntry?.savedStateHandle
    val nombreRecibido = savedStateHandle?.get<String>("nombre") ?: ""
    val edadRecibida = savedStateHandle?.get<String>("edad") ?: ""

    // Actualizar el estado con los datos recibidos
    nombre = nombreRecibido
    edad = edadRecibida

    Scaffold {
        ContentHomeView(it, navController, nombre, edad)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContentHomeView(
    paddingValues: PaddingValues,
    navController: NavHostController,
    nombre: String,
    edad: String
) {
    var nombreState by remember { mutableStateOf(nombre) }
    var edadState by remember { mutableStateOf(edad) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Formulario", color = Color.White) }, // Cambiar color del texto a blanco
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding), // Añade el padding del Scaffold
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Space()
            TextField(
                value = nombreState,
                onValueChange = { nombreState = it },
                label = { Text(text = "Nombre") }
            )
            Space()
            TextField(
                value = edadState,
                onValueChange = { edadState = it },
                label = { Text(text = "Edad") }
            )
            Space()
            MainButton(name = "Enviar", backColor = Color.Red, color = Color.White) {
                navController.navigate("Second/$nombreState/$edadState")
            }
            MainButton(name = "Limpiar", backColor = Color.Gray, color = Color.White) {
                nombreState = ""
                edadState = ""
            }
        }
    }
}