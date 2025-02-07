package com.bcan.bottomappbarsample.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

    @Serializable
    data object HomeRoute : Routes()

    @Serializable
    data object FavoritesRoute : Routes()

    @Serializable
    data object SettingsRoute : Routes()

}