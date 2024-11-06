package com.example.prueba_lap


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Estado1()
            //Estado2()
            //Estado3()
            //var text by rememberSaveable { mutableStateOf("") } //State Hoisting
            //Estado4(value=text, onValueChange = { text = it})
            val (value, onValueChange) = rememberSaveable { mutableStateOf("") }
            Estado5(value = value, onValueChange = onValueChange)
        }
    }
}

@Composable
fun Estado1() {
    var text = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text.value,
            onValueChange = { text.value = it },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = text.value,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { text.value = ""}, modifier = Modifier.fillMaxWidth(), enabled = text.value.isNotEmpty()) {
            Text(text = "Clear")
        }
    }
}

@Composable
fun Estado2() {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { text = ""}, modifier = Modifier.fillMaxWidth(), enabled = text.isNotEmpty()) {
            Text(text = "Clear")
        }
    }
}

/*
@Composable
fun Estado3() {
    var text by rememberSaveable { mutableStateof("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { text = ""}, modifier = Modifier.fillMaxWidth(), enabled = text.isNotEmpty()) {
            Text(text = "Clear")
        }
    }
}
*/


@Composable
fun Estado4(value: String, onValueChange: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = value,
            onValueChange = { onValueChange(it) },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = value,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { onValueChange("")}, modifier = Modifier.fillMaxWidth(), enabled = value.isNotEmpty()) {
            Text(text = "Clear")
        }
    }
}


@Composable
fun Estado5(value: String, onValueChange: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = value,
            onValueChange = { onValueChange(it) },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = value,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { onValueChange("") }, modifier = Modifier.fillMaxWidth(), enabled = value.isNotEmpty()) {
            Text(text = "Clear")
        }
    }
}



