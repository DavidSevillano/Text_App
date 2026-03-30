package com.burixer85.bettertextapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.burixer85.bettertextapp.presentation.HomeScreen
import com.burixer85.bettertextapp.ui.theme.BetterTextAppTheme
import com.burixer85.bettertextapp.ui.theme.DeepBackground
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            BetterTextAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = DeepBackground
                ) {
                    HomeScreen()
                }
            }
        }
    }
}