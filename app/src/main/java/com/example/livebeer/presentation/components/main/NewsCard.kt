package com.example.livebeer.presentation.components.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livebeer.presentation.ui.theme.BtnHelpCol
import com.example.livebeer.presentation.ui.theme.CardBlackCol
import com.example.livebeer.presentation.ui.theme.SfUProDisplaySemibold
import com.example.livebeer.presentation.ui.theme.SfUiDisplayRegular

@Composable
fun NewsCard(
    title: String,
    date: String
){

    Card(
        colors = CardDefaults.cardColors(
            containerColor = BtnHelpCol
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .height(132.dp)
            .width(138.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
        {

            Text(
                text = title,
                fontSize = 14.sp,
                fontFamily = SfUProDisplaySemibold,
                fontWeight = FontWeight(600),
                color = CardBlackCol,
                maxLines = 4,
                lineHeight = 18.sp

            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = date,
                fontSize = 12.sp,
                fontFamily = SfUiDisplayRegular,
                fontWeight = FontWeight(400),
                color = CardBlackCol.copy(alpha = 0.8f)
            )
        }

    }
}

data class NewsItem(
    val title: String,
    val date: String
)