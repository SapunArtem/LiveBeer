package com.example.livebeer.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livebeer.presentation.components.background.ScreenWithBackground
import com.example.livebeer.presentation.components.information.SimpleSegmentControl
import com.example.livebeer.presentation.components.information.StockList
import com.example.livebeer.presentation.ui.theme.SfUiDisplaySemibold
import com.example.livebeer.presentation.ui.theme.TextCol

@Composable
fun InformationScreen(modifier: Modifier = Modifier){

    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Акции", "Новости")

    ScreenWithBackground{
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ) {
            Text(
                modifier = Modifier.padding(top = 68.dp),
                text = "Информация",
                fontFamily = SfUiDisplaySemibold,
                fontSize = 36.sp,
                fontWeight = FontWeight(600),
                color = TextCol
            )

            Spacer(modifier = Modifier.height(16.dp))

            SimpleSegmentControl(
                tabs = tabs,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it }
            )

            Spacer(modifier = Modifier.height(20.dp))

            StockList()

        }
    }


}