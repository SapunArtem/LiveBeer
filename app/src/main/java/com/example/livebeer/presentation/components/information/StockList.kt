package com.example.livebeer.presentation.components.information

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.livebeer.R

@Composable
fun StockList(){
    val stockItem = listOf(
        StockItem(
            title = "Новые сорта крафта уже в наличии в магазинах",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer1),
        StockItem(title = "Нам 10 лет повышаем скидку до 10% на всё!",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer2),
        StockItem(title = "Новые сорта крафта уже в наличии в магазинах",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer3),
        StockItem(title = "Нам 10 лет повышаем скидку до 10% на всё!",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer4),
        StockItem(
            title = "Новые сорта крафта уже в наличии в магазинах",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer1),
        StockItem(title = "Нам 10 лет повышаем скидку до 10% на всё!",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer2),
        StockItem(title = "Новые сорта крафта уже в наличии в магазинах",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer3),
        StockItem(title = "Нам 10 лет повышаем скидку до 10% на всё!",
            date = "20.01.2022",
            imageRes = R.drawable.stock_beer4),

    )

    LazyColumn (
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(stockItem){ item ->
            StockCard(
                title = item.title,
                date = item.date,
                imageRes = item.imageRes
            )
        }
    }
}