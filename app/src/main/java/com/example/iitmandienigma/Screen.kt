package com.example.iitmandienigma

sealed class Screen (val route: String){
    object mainscreen : Screen("HomeScreen")
    object uploadscreen : Screen("UploadScreen")
    object loginscreen : Screen("LoginScreen")
    object signupscreen : Screen("SignupScreen")
    object startscreen : Screen("StartScreen")
}