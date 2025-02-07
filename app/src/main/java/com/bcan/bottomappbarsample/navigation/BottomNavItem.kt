package com.bcan.bottomappbarsample.navigation

import androidx.compose.ui.graphics.vector.ImageVector


data class BottomNavItem(
    val route: Routes,
    val icon: ImageVector,
    val text: String,
)