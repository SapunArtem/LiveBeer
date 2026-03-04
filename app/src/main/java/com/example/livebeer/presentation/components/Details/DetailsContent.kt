package com.example.livebeer.presentation.components.Details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.livebeer.R
import com.example.livebeer.presentation.ui.theme.BlueCol
import com.example.livebeer.presentation.ui.theme.BtnCol
import com.example.livebeer.presentation.ui.theme.SfUiDisplayRegular
import com.example.livebeer.presentation.ui.theme.SfUiDisplaySemibold
import com.example.livebeer.presentation.ui.theme.TextCol

@Composable
fun DetailsContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.92f)
            .padding(horizontal = 24.dp)
            .verticalScroll(rememberScrollState())
    ) {


        Row(
            modifier = Modifier
                .padding(top = 24.dp)
                .clickable {},
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.leftbtn),
                contentDescription = null,
                modifier = Modifier
                    .height(24.dp)
                    .width(18.dp),

            )
            Text(
                text = "Назад",
                fontFamily = SfUiDisplayRegular,
                fontSize = 17.sp,
                fontWeight = FontWeight(400),
                lineHeight = 22.sp,
                color = BlueCol
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Новые сорта крафта уже в наличии в магазинах",
            fontFamily = SfUiDisplaySemibold,
            fontSize = 32.sp,
            fontWeight = FontWeight(600),
            lineHeight = 32.sp,
            color = TextCol
            )


        Spacer(modifier = Modifier.height(12.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(24.dp)
                    .width(84.dp)
                    .background(BtnCol)
                    .clip(RoundedCornerShape(4.dp)),
                contentAlignment = Alignment.Center

            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.mic),
                        contentDescription = null,
                        modifier = Modifier
                            .size(16.dp)
                    )
                    Text(
                        text = "Новость",
                        fontFamily = SfUiDisplaySemibold,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(600),
                        color = TextCol
                    )
                }
            }


            Box(
                modifier = Modifier
                    .height(24.dp)
                    .width(84.dp)
                    .background(BtnCol)
                    .clip(RoundedCornerShape(4.dp)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "20.01.2022",
                    fontFamily = SfUiDisplaySemibold,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(600),
                    color = TextCol
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth()
                .height(196.dp)

        ){
            Image(
                painter = painterResource(R.drawable.stock_beer1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(196.dp),
                contentScale = ContentScale.FillWidth
            )
        }


        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Пролистайте каталог ProStore, который действителен от 5.4.2022 до 18.4.2022, чтобы ознакомиться с самыми актуальными предложениями. На 16 страницах текущего каталога, Вы найдёте лучшие товары из категории Супермаркеты и гипермаркеты. Каталог сети магазинов ProStore предлагает скидки на более, чем 155 продуктов, поэтому Вы можете быть уверены в том, что Вы совершаете покупку, используя лучшее предложение! Если Вы хотите сэкономить при своём следующем походе в магазин ProStore, не забудьте просмотреть весь каталог от первой до последней 16 страницы. На этой странице Вы найдёте акции на хлеб, лещ, пирожное, детская смесь, торт, Oreo, багет; однако, этого каталог магазина ProStore предлагает множество других скидок на такие, например, товары, как сыр, майонез, плавленый сыр, твердый сыр, чеснок, карп, шашлык, салат, фарш, овощной салат. Если Вы хотите совершать покупки с умом и сэкономить на своём следующем походе в магазин ProStore, не пропустите самый последний каталог, полный удивительных акций и замечательных скидок. Приходите на сайт Моя Акция каждый день, чтобы не пропустить отличные каталоги, предлагаемые Вашими любимыми розничными сетями.",
            fontFamily = SfUiDisplayRegular,
            fontSize = 15.sp,
            fontWeight = FontWeight(400),
            lineHeight = 20.sp,
            color = TextCol
        )

    }
}