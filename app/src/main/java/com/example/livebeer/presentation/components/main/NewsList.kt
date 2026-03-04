package com.example.livebeer.presentation.components.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NewsList(){
    val newsItem = listOf(
        NewsItem("Новые сорта крафта уже в наличии в магазинах","20.01.2022"),
        NewsItem("Нам 10 лет повышаем скидку до 10% на всё!","20.01.2022"),
        NewsItem("Новые сорта крафта уже в наличии в магазинах","20.01.2022")
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(newsItem){ item ->
            NewsCard(
                title = item.title,
                date = item.date
            )
        }
    }
}