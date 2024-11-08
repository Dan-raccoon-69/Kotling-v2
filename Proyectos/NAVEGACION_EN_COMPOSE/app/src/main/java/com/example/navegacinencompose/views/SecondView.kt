package com.example.navegacinencompose.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.leanback.widget.TitleView
import androidx.navigation.NavHostController
import com.example.navegacinencompose.components.MainButton
import com.example.navegacinencompose.components.Space


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondView(navController: NavHostController, nombre: String?, edad: String?) {
    Scaffold(
    ) {
        ContentSecondView(it, navController, nombre, edad)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContentSecondView(
    paddingValues: PaddingValues,
    navController: NavHostController,
    nombre: String?,
    edad: String?
) {
    var nombreState by remember { mutableStateOf(nombre ?: "") }
    var edadState by remember { mutableStateOf(edad ?: "") }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Datos", color = Color.White) }, // Título "Datos" en color blanco
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { innerPadding -> // Añade innerPadding para el contenido
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding), // Usa innerPadding para el padding
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
            MainButton(name = "Regresar", backColor = Color.Red, color = Color.White) {
                navController.previousBackStackEntry?.savedStateHandle?.set("nombre", nombreState)
                navController.previousBackStackEntry?.savedStateHandle?.set("edad", edadState)
                navController.popBackStack()
            }
            MainButton(name = "Limpiar", backColor = Color.Gray, color = Color.White) {
                nombreState = ""
                edadState = ""
            }
        }
    }
}