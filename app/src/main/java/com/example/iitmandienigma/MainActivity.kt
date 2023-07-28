package com.example.iitmandienigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.iitmandienigma.ui.theme.IITMANDIENIGMATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IITMANDIENIGMATheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController =navController, startDestination = "HomeScreen" ){
                        composable(route = Screen.startscreen.route){
                            StartScreenPage(navController = navController)
                        }
                        composable(route = Screen.mainscreen.route){
                            HomeScreenPage(navController = navController)
                        }
                        composable(route = Screen.loginscreen.route){
                            LoginPage(navController = navController)
                        }
                        composable(route=Screen.signupscreen.route){
                            SignUpPage(navController = navController)
                        }
                        composable(route = Screen.uploadscreen.route){
                            uploadPage(navController = navController)
                        }
                    }
                }
            }
        }
    }
}