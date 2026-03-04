package com.example.livebeer.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livebeer.R
import com.example.livebeer.presentation.components.background.ScreenWithBackground
import com.example.livebeer.presentation.components.main.NewsList
import com.example.livebeer.presentation.components.main.PointsCard
import com.example.livebeer.presentation.components.main.ProgressCard
import com.example.livebeer.presentation.ui.theme.BtnCol
import com.example.livebeer.presentation.ui.theme.SfUiDisplaySemibold
import com.example.livebeer.presentation.ui.theme.TextCol

@Composable
fun MainScreen(modifier: Modifier = Modifier){


        ScreenWithBackground {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 68.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(BtnCol),
                        contentAlignment = Alignment.Center
                    ){
                        Icon(
                            painter = painterResource(id = R.drawable.user),
                            contentDescription = "User",
                            tint = Color.Black,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "Привет, Дмитрий!",
                        fontFamily = SfUiDisplaySemibold,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(600),
                        color = TextCol
                    )
                }


                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BtnCol
                    ),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                        .height(56.dp),
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.qr_code_scanner),
                            contentDescription = "QR",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(24.dp)

                        )
                        Text(
                            modifier = Modifier.padding(start = 8.dp),
                            text = "Показать мой код",
                            fontFamily = SfUiDisplaySemibold,
                            fontSize = 20.sp,
                            fontWeight = FontWeight(600),
                            color = TextCol
                        )
                    }
                }
                ProgressCard()

                PointsCard()

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Будь в курсе",
                        fontFamily = SfUiDisplaySemibold,
                        fontSize = 24.sp,
                        fontWeight = FontWeight(600),
                        color = TextCol
                    )

                    IconButton(
                        onClick = {}
                    ){
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_left),
                            contentDescription = "ArrowLeft",
                            tint = Color.Black,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                NewsList()

            }
        }

        }







