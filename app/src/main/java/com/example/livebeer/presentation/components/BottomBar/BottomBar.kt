package com.example.livebeer.presentation.components.BottomBar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.example.livebeer.presentation.ui.theme.BtnCol
import com.example.livebeer.presentation.ui.theme.WhiteCol

@Composable
fun BottomBar(
    navController: NavController,
    currentRoute: String?
) {
    NavigationBar(
        containerColor = Color.Black
    ) {
        BottomList.bottomItemsList.forEach { bottomItem ->
            NavigationBarItem(
                selected = currentRoute == bottomItem.route,
                onClick = {
                    navController.navigate(bottomItem.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = bottomItem.icon),
                        contentDescription = bottomItem.title
                    )
                },
                label = {
                    Text(
                        text = bottomItem.title
                    )
                },
                colors = NavigationBarItemColors(
                    selectedTextColor = BtnCol,
                    selectedIconColor = BtnCol,
                    selectedIndicatorColor = Color.Transparent,
                    unselectedTextColor = WhiteCol.copy(alpha = 0.5f),
                    unselectedIconColor = WhiteCol.copy(alpha = 0.5f),
                    disabledIconColor = WhiteCol.copy(alpha = 0.5f),
                    disabledTextColor = WhiteCol.copy(alpha = 0.5f)
                )
            )
        }
    }
}