package com.example.pantallas.views

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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.pantallas.components.ActionButton
import com.example.pantallas.components.MainButton
import com.example.pantallas.components.Space
import com.example.pantallas.components.TitleBar
import com.example.pantallas.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "Home View") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        },
        floatingActionButton = {
            ActionButton()
        }
    ) {
        ContentHomeView(it, navController)
    }
}

@Composable
fun ContentHomeView(paddingValues: PaddingValues, navController: NavHostController) {
    val id = 1234
    var opcional by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleView(name = "Home View")
        Space()
        TextField(
            value = opcional,
            onValueChange = { opcional = it },
            label = { Text(text = "Opcional") }
        )
        MainButton(name = "Detail View", backColor = Color.Red, color = Color.White) {
            //println("Me presionaron")
            navController.navigate("Detail/${id}/?${opcional}")
        }
    }
}