package com.example.livebeer.presentation.navigation

sealed class Screens(val route : String) {
    object Home : Screens("home_screen")
    object Information : Screens("information_screen")

    object Details : Screens("details_screen/{title}/{date}/{imageRes}") {
        fun passDetails(title: String, date: String, imageRes: Int): String {
            return "details_screen/${title}/${date}/${imageRes}"
        }
    }
}