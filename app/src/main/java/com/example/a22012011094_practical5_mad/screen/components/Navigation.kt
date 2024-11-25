package com.example.a22012011094_practical5_mad.screen.components


import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.a22012011094_practical5_mad.screen.LoginScreen
import com.example.a22012011094_practical5_mad.screen.RegistrationScreen


@Composable
fun AppNavigation(context: Context, navController: NavHostController, paddingValues: PaddingValues) {

    NavHost(navController = navController, startDestination = "login")
    {
        composable("login")
        {
            LoginScreen(context,
                navController = navController,
            )
        }
        composable("registration") {
            RegistrationScreen(context,
                navController = navController,
            )
        }
    }
}