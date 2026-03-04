package com.example.livebeer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.livebeer.presentation.screens.InformationScreen
import com.example.livebeer.presentation.ui.theme.LiveBeerTheme

class LiveBeer : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LiveBeerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InformationScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

