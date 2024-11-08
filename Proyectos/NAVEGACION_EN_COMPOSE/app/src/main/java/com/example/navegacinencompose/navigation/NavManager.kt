package com.example.navegacinencompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacinencompose.views.HomeView
import com.example.navegacinencompose.views.SecondView

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
            SecondView(navController, id.toString(), opcional)
        }
        composable(route = "Second/{nombre}/{edad}", arguments = listOf(
            navArgument(name = "nombre") { type = NavType.StringType },
            navArgument(name = "edad") { type = NavType.StringType }
        )) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre")
            val edad = backStackEntry.arguments?.getString("edad")
            SecondView(navController, nombre, edad)
        }
    }
}