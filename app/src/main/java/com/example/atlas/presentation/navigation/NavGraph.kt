package com.example.atlas.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.atlas.presentation.list.CharacterListScreen
import com.example.atlas.presentation.detail.CharacterDetailScreen

@Composable
fun AtlasNavHost(startDestination: String = "list") {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = startDestination) {
        composable("list") { CharacterListScreen(onOpen = { id -> nav.navigate("detail/$id") }) }
        composable(
            "detail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments!!.getInt("id")
            CharacterDetailScreen(id = id, onBack = { nav.popBackStack() })
        }
    }
}
