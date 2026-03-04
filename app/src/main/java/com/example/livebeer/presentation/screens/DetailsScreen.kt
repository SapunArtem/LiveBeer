package com.example.livebeer.presentation.screens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.livebeer.presentation.components.Details.DetailsContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    title: String,
    date: String,
    imageRes: Int,
    onBackClick: () -> Unit) {

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true)

    ModalBottomSheet(
        onDismissRequest = onBackClick,
        sheetState = sheetState,
        shape = RoundedCornerShape(
            topStart = 28.dp,
            topEnd = 28.dp
        ),
        containerColor = Color.White,
        dragHandle = null
    ) {
        DetailsContent(
            title = title,
            date = date,
            imageRes = imageRes,
            onBackClick = onBackClick
        )

    }
}