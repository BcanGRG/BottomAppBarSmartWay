package com.bcan.bottomappbarsample.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.bcan.bottomappbarsample.screen.FavoritesScreen
import com.bcan.bottomappbarsample.screen.HomeScreen
import com.bcan.bottomappbarsample.screen.SettingsScreen

@Composable
fun BottomAppBarSampleNavigation() {

    val navController = rememberNavController()
    val entry by navController.currentBackStackEntryAsState()
    val currentDestination = entry?.destination

    Scaffold(
        bottomBar = { MyBottomAppBar(currentDestination, navController) },
    ) {
        NavHost(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            navController = navController,
            startDestination = Routes.HomeRoute,
        ) {
            composable<Routes.HomeRoute> { HomeScreen() }
            composable<Routes.FavoritesRoute> { FavoritesScreen() }
            composable<Routes.SettingsRoute> { SettingsScreen() }
        }
    }
}