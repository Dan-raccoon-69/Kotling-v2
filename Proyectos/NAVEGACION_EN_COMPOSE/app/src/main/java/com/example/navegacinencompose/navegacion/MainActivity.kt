package com.example.navegacinencompose.navegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.navegacinencompose.navigation.NavManager
import com.example.navegacinencompose.ui.theme.NAVEGACIÓNENCOMPOSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NAVEGACIÓNENCOMPOSETheme {
                NavManager()
            }
        }
    }
}

