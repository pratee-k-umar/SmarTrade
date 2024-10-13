package com.example.smartrade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.smartrade.presentation.company_info.CompanyInfoScreen
import com.example.smartrade.presentation.company_listings.CompanyListingsScreen
import com.example.smartrade.presentation.company_listings.CompanyListingsViewModel
import com.example.smartrade.ui.theme.SmarTradeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmarTradeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "search") {
        composable("search") {
            CompanyListingsScreen(
                navController = navController,
                viewModel = hiltViewModel()
            )
        }
        composable(
            "${Screens.AppBody.Details}/{symbol}",
             arguments = listOf(navArgument("symbol") { type = NavType.StringType })
        ) {backStackEntry ->
            val symbol = backStackEntry.arguments?.getString("symbol") ?: ""
            CompanyInfoScreen(
                symbol = symbol,
                viewModel = hiltViewModel()
            )
        }
    }
}