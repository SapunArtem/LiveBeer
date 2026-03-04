package com.example.livebeer.presentation.components.information

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livebeer.presentation.ui.theme.BtnCol
import com.example.livebeer.presentation.ui.theme.CardBlackCol
import com.example.livebeer.presentation.ui.theme.SfUProDisplaySemibold
import com.example.livebeer.presentation.ui.theme.SfUiDisplayRegular

@Composable
fun StockCard(
    title: String,
    date: String,
    imageRes: Int,
    onClick: () -> Unit
){

    Card(
        colors = CardDefaults.cardColors(
            containerColor = BtnCol
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .height(96.dp)
            .fillMaxWidth()
            .clickable{onClick()}

    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(10.dp))
            ){
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = "Image Stock",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                )
            }
            Spacer(modifier = Modifier.width(16.dp))


            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            )
            {

                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontFamily = SfUProDisplaySemibold,
                    fontWeight = FontWeight(600),
                    color = CardBlackCol,
                    maxLines = 2,
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
}

data class StockItem(
    val title: String,
    val date: String,
    val imageRes: Int
)