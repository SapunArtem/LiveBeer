package com.example.livebeer.presentation.components.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livebeer.R
import com.example.livebeer.presentation.ui.theme.WhiteCol
import com.example.livebeer.presentation.ui.theme.CardBlackCol
import com.example.livebeer.presentation.ui.theme.SfUProDisplayHeavy
import com.example.livebeer.presentation.ui.theme.SfUProDisplaySemibold
import com.example.livebeer.presentation.ui.theme.SfUiDisplayRegular

@Composable
fun ProgressCard(){

    Card(
        colors = CardDefaults.cardColors(
            containerColor = CardBlackCol
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .height(152.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
                    .padding(top = 16.dp, start = 16.dp, end = 10.dp),

            ) {
                Image(
                    painter = painterResource(id = R.drawable.beer),
                    contentDescription = "Beer",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()

                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp, start = 24.dp, end = 10.dp,top = 12.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                Column{
                    Text(
                        text = "5/10",
                        fontSize = 32.sp,
                        fontFamily = SfUProDisplayHeavy,
                        fontWeight = FontWeight(800),
                        color = WhiteCol
                    )
                    Text(
                        modifier = Modifier
                            .padding(end = 16.dp),
                        text = "Накопленно литров",
                        fontSize = 16.sp,
                        fontFamily = SfUProDisplaySemibold,
                        fontWeight = FontWeight(600),
                        color = WhiteCol
                    )

                }

                Box(
                    modifier = Modifier
                        .width(1.dp)
                        .height(41.dp)
                        .background(WhiteCol.copy(alpha = 0.1f))
                )

                Text(
                    text = "Копите литры и получайте пиво бесплатно",
                    fontSize = 14.sp,
                    fontFamily = SfUiDisplayRegular,
                    fontWeight = FontWeight(400),
                    color = WhiteCol.copy(alpha = 0.7f),
                    modifier = Modifier
                        .padding(start = 16.dp),
                    lineHeight = 17.sp,
                    maxLines = 3
                )
            }

        }
    }
}