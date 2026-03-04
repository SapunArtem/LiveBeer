package com.example.livebeer.presentation.components.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livebeer.R
import com.example.livebeer.presentation.ui.theme.BtnHelpCol
import com.example.livebeer.presentation.ui.theme.CardBlackCol
import com.example.livebeer.presentation.ui.theme.SfUProDisplayHeavy
import com.example.livebeer.presentation.ui.theme.SfUProDisplaySemibold
import com.example.livebeer.presentation.ui.theme.SfUiDisplayRegular
import com.example.livebeer.presentation.ui.theme.WhiteCol

@Composable
fun PointsCard(){

    Box(
        modifier = Modifier
            .height(134.dp)
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = CardBlackCol
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(126.dp)
                .align(Alignment.BottomCenter)
        ) {}

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(126.dp)
                .align(Alignment.BottomCenter)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp, start = 16.dp, bottom = 16.dp, end = 149.dp)
            ) {
                Text(
                    text = "3017",
                    fontSize = 32.sp,
                    fontFamily = SfUProDisplayHeavy,
                    fontWeight = FontWeight(800),
                    color = WhiteCol
                )

                Text(
                    text = "Накоплено баллов",
                    fontSize = 16.sp,
                    fontFamily = SfUProDisplaySemibold,
                    fontWeight = FontWeight(600),
                    color = WhiteCol
                )

                Text(
                    text = "Собирайте баллы \n" +
                            "и получайте бонусы",
                    fontSize = 14.sp,
                    fontFamily = SfUiDisplayRegular,
                    fontWeight = FontWeight(400),
                    color = WhiteCol.copy(alpha = 0.7f),
                    lineHeight = 16.sp,
                    maxLines = 2
                )

            }
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = 6.dp, y = (-6).dp)
                    .clip(CircleShape)
                    .background(BtnHelpCol)
                    .border(
                        width = 4.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
                    .clickable { },
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.help_circle),
                    contentDescription = "Favorite",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(24.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.hand1),
                contentScale = ContentScale.Fit,
                contentDescription = "Hand1",
                modifier = Modifier
                    .height(100.dp)
                    .width(57.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = (-130).dp, y = 26.dp)
            )


        }

            Image(
                painter = painterResource(id = R.drawable.hand2),
                contentScale = ContentScale.Fit,
                contentDescription = "Hand2",
                modifier = Modifier
                    .height(134.dp)
                    .width(100.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = (-19).dp,y = 0.dp)
                    )
        }
    }

