package com.example.a22012011094_practical5_mad


import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

import androidx.navigation.compose.rememberNavController
import androidx.navigation.testing.TestNavHostController
import com.example.a22012011094_practical5_mad.screen.components.AppNavigation
import com.example.a22012011094_practical5_mad.ui.theme._22012011094_Practical5_MADTheme
import com.example.a22012011094_practical5_mad.screen.LoginScreen



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            _22012011094_Practical5_MADTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavigation(context = this, navController = navController , paddingValues = innerPadding)
                }
            }
        }
    }
}
fun showMsg(context: Context, msg: String){
    val toast = Toast.makeText(context, msg,Toast.LENGTH_SHORT)
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _22012011094_Practical5_MADTheme {
        val mockNavController = TestNavHostController(LocalContext.current)
        LoginScreen(navController = mockNavController)
    }
}