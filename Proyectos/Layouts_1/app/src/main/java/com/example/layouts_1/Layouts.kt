package com.example.layouts_1

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout



@Composable
fun NewFrameLayout() {
    Box(contentAlignment = Alignment.Center) {
        Text(text = "Programas Android LadyBug")
        Text(text = "Móvil")
    }
}

@Composable
fun NewLinearLayoutVertical() {
    Column (
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Programas Android LadyBug")
        Text(text = "Desarrollo Móvil")
        Row {
            TextLadyBug()
            TextKot()
        }
    }
}

@Composable
fun NewLinearLayoutHorizontal() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextKot()
        Column {
            TextLadyBug()
            Text(text = "Objetos")
            Text(text = "Móvil")
            Row {
                TextLadyBug()
                TextKot()
            }
        }
    }
}

@Composable
fun TextLadyBug() =
    Text(text = "Programas Android LadyBug", modifier = Modifier.background(Color.Cyan))

@Composable
fun TextKot(modifier: Modifier = Modifier) {
    Text(text = "Kotlin", modifier = modifier.background(Color.LightGray))
}

@Composable
fun NewConstraintLayout() {
    ConstraintLayout {
        val (conA, conB, conC, conD) = createRefs()
        Text(text = "Programas LadyBug",
            modifier = Modifier.constrainAs(conA) {
                top.linkTo(parent.top)
                start.linkTo(conC.end)
            })
        Text(text = "Android", modifier = Modifier.constrainAs(conB) {
            top.linkTo(conA.bottom)
            start.linkTo(conA.start)
        })
        TextKot(modifier = Modifier.constrainAs(conC) {
            top.linkTo(conB.top)
            start.linkTo(parent.start)
        })
        Column(modifier = Modifier.constrainAs(conD) {
            top.linkTo(conB.bottom)
            start.linkTo(conB.start)
        }) {
        TextLadyBug()
        TextKot()
    }
}
}

@Composable
fun NewConstraintLayout2() {
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    val context = LocalContext.current
    ConstraintLayout(
        modifier = Modifier
            .padding(16.dp)
    ) {
        val (lblTitulo, txtNombre, txtEdad, fila) = createRefs()
        Text(
            text = "Formulario",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
                .constrainAs(lblTitulo) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                },
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .constrainAs(txtNombre) {
                    top.linkTo(lblTitulo.bottom)
                    start.linkTo(parent.start)
                },
            label = { Text(text = "Nombre") },
            value = nombre, onValueChange = { nombre = it })
        TextField( // <-- This is the TextField composable for "edad"
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(txtEdad) {
                    top.linkTo(txtNombre.bottom)
                    start.linkTo(parent.start)
                },
            label = { Text(text = "Edad") },
            value = edad,
            onValueChange = { edad = it }
        ) // <-- You were missing this closing parenthesis
        Row(
            horizontalArrangement = Arrangement.spacedBy(48.dp),
            modifier = Modifier
                .padding(40.dp)
                .constrainAs(fila) {
                    top.linkTo(txtEdad.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            Button(onClick = { mensaje(context, mensaje = "Tu nombre es $nombre y edad $edad años") }) {
                Text(
                    text = "Envíar",
                    modifier = Modifier.size(60.dp, 20.dp),
                    textAlign = TextAlign.Center
                )
            }
            Button(onClick = {
                nombre = ""
                edad = ""
            }) {
                Text(
                    text = "Limpiar",
                    modifier = Modifier.size(60.dp, 20.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

fun mensaje(context: Context, mensaje: String) {
    Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()
}
