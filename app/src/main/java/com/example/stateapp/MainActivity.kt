package com.example.stateapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stateapp.ui.theme.StateAppTheme
import com.example.stateapp.view.PantallaPrincipal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StateAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {innerPading ->
                    PantallaPrincipal(modifier = Modifier.padding(innerPading))
                }
            }
        }
    }
}