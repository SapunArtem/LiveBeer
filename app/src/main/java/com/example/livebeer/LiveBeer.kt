package com.example.livebeer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.livebeer.presentation.screens.App
import com.example.livebeer.presentation.ui.theme.LiveBeerTheme

class LiveBeer : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LiveBeerTheme {
                    App()

                }
            }
        }
    }


