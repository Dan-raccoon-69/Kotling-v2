package com.example.pantallas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pantallas.views.DetailView
import com.example.pantallas.views.HomeView


@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable(route = "Home") {
            HomeView(navController)
        }
        composable(route = "Detail/{id}/?{opcional}", arguments = listOf(
            navArgument(name = "id") { type = NavType.IntType },
            navArgument(name = "opcional") { type = NavType.StringType }
        )) {
            val id = it.arguments?.getInt("id") ?: 0
            val opcional = it.arguments?.getString("opcional") ?: ""
            DetailView(navController, id, opcional)
        }
    }
}

