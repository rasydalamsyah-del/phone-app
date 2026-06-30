package com.example.phoneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import com.example.phoneapp.ui.screens.HomeScreen
import com.example.phoneapp.ui.screens.ChatScreen
import com.example.phoneapp.ui.theme.PhoneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhoneAppTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "home",
                    modifier = Modifier.fillMaxSize()
                ) {
                    composable("home") {
                        HomeScreen(onAppClick = { appId ->
                            navController.navigate("chat/$appId")
                        })
                    }
                    composable("chat/{appId}") { backStackEntry ->
                        val appId = backStackEntry.arguments?.getString("appId") ?: ""
                        ChatScreen(appId = appId, onBack = { navController.popBackStack() })
                    }
                }
            }
        }
    }
}
