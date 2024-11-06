package com.example.pantallas.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import com.example.pantallas.components.MainButton
import com.example.pantallas.components.MainIconButton
import com.example.pantallas.components.Space
import com.example.pantallas.components.TitleBar
import com.example.pantallas.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(navController: NavController, id: Int, opcional: String?) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "Detail View") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = Color.Blue
            ),
            navigationIcon = {
                MainIconButton(icon = Icons.AutoMirrored.Filled.ArrowBack) {
                    navController.popBackStack()
                }
            }
        )
    }
    ) {
        ContentDetailView(it, navController, id, opcional)
    }
}

@Composable
fun ContentDetailView(
    paddingValues: PaddingValues,
    navController: NavController,
    id: Int,
    opcional: String?
) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        TitleView(name = "Detail View")
        Space()
        TitleView(name = id.toString())
        Space()
/* opcional?.let {
TitleView(name = it)
}*/
        if (opcional==""){
            Spacer(modifier = Modifier.height(8.dp))
        }else{
            TitleView(name = opcional.orEmpty())
        }
        MainButton(name = "Return Home", backColor = Color.Blue, color = Color.White) {
            // println("Me presionaron")
            navController.popBackStack()
        }
    }
}