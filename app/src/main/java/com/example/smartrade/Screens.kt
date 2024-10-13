package com.example.smartrade

sealed class Screens(
    val name: String,
    val route: String
) {
    sealed class AppBody (
        abName: String,
        abRoute: String
    ): Screens(abName, abRoute) {
        data object Search: AppBody(
            "Search",
            "search"
        )
        data object Details: AppBody(
            "Details",
            "details"
        )
    }
}

val appBodyNavigation = listOf(
    Screens.AppBody.Search,
    Screens.AppBody.Details
)