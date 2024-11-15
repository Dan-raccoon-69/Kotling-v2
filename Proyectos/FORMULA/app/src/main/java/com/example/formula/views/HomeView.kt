package com.example.formula.views

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formula.R
import com.example.formula.components.Alert
import com.example.formula.components.MainButton
import com.example.formula.components.MainTextField
import com.example.formula.components.SpaceH
import kotlin.math.abs

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView() {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "FÓRMULA",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        )
    }) {
        ContentHomeView(it)
    }
}


@Composable
fun ContentHomeView(paddingValues: PaddingValues) {
    var valX by remember { mutableStateOf("") }
    var valF by remember { mutableStateOf("") }
    var showAlert by remember { mutableStateOf(false) }
    val context = LocalContext.current
    var mensaje: String
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.formula),
            contentDescription = null,
            modifier = Modifier.size(120.dp)
        )
        SpaceH()
        MainTextField(value = valX, onValue = { valX = it }, label = "X:")
        SpaceH(25.dp)
        MainTextField(value = valF, onValue = { valF = it }, label = "F:")
        SpaceH(25.dp)
        MainButton(text = "Calcular", textColor = Color.Blue)
        {
            if (valX != "" && valF != "") {
                mensaje = calcular(valX.toDouble(), valF.toDouble())
                Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()
            } else {
                showAlert = true
            }
        }
        SpaceH(10.dp)
        MainButton(text = "Limpiar", textColor = Color.Red)
        {
            valX = "";
            valF = "";
        }

        if (showAlert) {
            Alert(
                title = "Aceptar", message = "Escribe el valor de X o F",
                confirmText = "Aceptar",
                onConfirmClick = {
                    showAlert = false
                }
            ) {}
        }
    }
}

fun calcular(valX: Double, valF: Double): String {
    val divisor = valX - 2 * valF
    if (abs(divisor) > 0.0005) {
        val a = (2 * valX + valF) / divisor
        return "a=$a"
    } else {
        return "Combinación Incorrecta"
    }
}






