package com.example.myapplicationpruebaotro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Surface
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : CompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContent {
            Layouts {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //NewFrameLayout()
                    //NewLinearLayoutVertical()
                    //NewLinearLayoutHorizontal()
                    //NewConstraintLayout1()
                    NewConstraintLayout2()
                }
            }
        }
    }
}
