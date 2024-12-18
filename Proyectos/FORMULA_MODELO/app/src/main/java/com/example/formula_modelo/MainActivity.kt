package com.example.formula_modelo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.formula_modelo.ui.theme.FORMULA_MODELOTheme
import com.example.formula_modelo.views.HomeView
import com.example.formula_modelo.viewModels.CalcularViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: CalcularViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            FORMULA_MODELOTheme {
                Surface(
                        modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ){
                    HomeView(viewModel)
                }
            }
        }
    }
}
