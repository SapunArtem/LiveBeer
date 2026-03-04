package com.example.livebeer.presentation.components.background

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.livebeer.R
import com.example.livebeer.presentation.ui.theme.WhiteCol

@Composable
fun ScreenWithBackground(
    content: @Composable () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteCol)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(204.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.frame),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

        }

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            content()
        }
    }
}