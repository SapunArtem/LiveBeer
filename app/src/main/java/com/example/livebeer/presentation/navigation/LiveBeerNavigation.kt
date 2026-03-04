package com.example.livebeer.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.livebeer.R
import com.example.livebeer.presentation.screens.DetailsScreen
import com.example.livebeer.presentation.screens.InformationScreen
import com.example.livebeer.presentation.screens.MainScreen



@Composable
fun LiveBeerNavigation(
    navController: NavHostController,
    modifier: Modifier
){
    NavHost (
        navController = navController,
        startDestination = Screens.Home.route,
        modifier = modifier
    ){
        composable(Screens.Home.route) {
            MainScreen()
        }

        composable(Screens.Information.route) {
            InformationScreen(
                onStockClick = { title, date, imageRes ->
                    navController.navigate(
                        Screens.Details.passDetails(title, date, imageRes)
                    )
                }
            )
        }

        composable(
            route = Screens.Details.route,
            arguments = listOf(
                navArgument("title") { type = NavType.StringType },
                navArgument("date") { type = NavType.StringType },
                navArgument("imageRes") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            val date = backStackEntry.arguments?.getString("date") ?: ""
            val imageRes = backStackEntry.arguments?.getInt("imageRes") ?: R.drawable.stock_beer1

            DetailsScreen(
                title = title,
                date = date,
                imageRes = imageRes,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}