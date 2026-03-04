package com.example.livebeer.presentation.components.BottomBar

import com.example.livebeer.R
import com.example.livebeer.presentation.navigation.Screens

object BottomList{
    val bottomItemsList = listOf(
        BottomBarItem(
            title = "Главная",
            icon = R.drawable.home,
            route = Screens.Home.route
        ),
        BottomBarItem(
            title = "Информация",
            icon = R.drawable.info,
            route = Screens.Information.route
        ),
    )
}