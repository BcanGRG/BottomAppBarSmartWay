package com.bcan.bottomappbarsample.navigation

import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy

@Composable
fun MyBottomAppBar(
    currentDestination: NavDestination?,
    navController: NavController
) {
    BottomAppBar(modifier = Modifier.height(90.dp)) {

        bottomNavDestinations.forEach { destination ->
            NavigationBarItem(
                selected = currentDestination?.hierarchy?.any {
                    it.hasRoute(destination.route::class)
                } ?: false,
                onClick = { navController.navigate(destination.route) },
                icon = {
                    Icon(
                        imageVector = destination.icon,
                        contentDescription = "Icon"
                    )
                },
                label = { Text(text = destination.text) },
            )
        }
    }
}

val bottomNavDestinations =
    listOf(
        BottomNavItem(Routes.HomeRoute, Icons.Default.Home, "Home"),
        BottomNavItem(Routes.FavoritesRoute, Icons.Default.Favorite, "Favorites"),
        BottomNavItem(Routes.SettingsRoute, Icons.Default.Settings, "Settings"),
    )