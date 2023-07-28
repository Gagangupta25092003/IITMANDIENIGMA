package com.example.iitmandienigma

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.iitmandienigma.ui.theme.background
import com.example.iitmandienigma.ui.theme.surface
import com.example.iitmandienigma.ui.theme.textPrimary

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LoginPage(navController : NavController){
    val loginusername = remember {
        mutableStateOf("")
    }
    val loginpassword = remember {
        mutableStateOf("")
    }
    Scaffold(
        topBar = {Topbar()},
        bottomBar = { BottomBar(navController = navController)}
    ) {padding->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = background)
            .padding(10.dp, 80.dp, 10.dp, 20.dp)){
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "Login",
                    color = textPrimary,
                    fontSize = 22.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Username",
                    color = textPrimary,
                    fontSize = 18.sp,
                )
                Spacer(modifier = Modifier.height(5.dp))
                OutlinedTextField(
                    value = loginusername.value,
                    onValueChange = {
                        loginusername.value = it
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(containerColor = surface, textColor = textPrimary, focusedBorderColor = textPrimary, unfocusedBorderColor = textPrimary),
                    modifier = Modifier.fillMaxWidth(0.6f)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Password",
                    color = textPrimary,
                    fontSize = 18.sp,
                )
                Spacer(modifier = Modifier.height(5.dp))
                OutlinedTextField(
                    value = loginpassword.value,
                    onValueChange = {
                        loginpassword.value = it
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(containerColor = surface, textColor = textPrimary, focusedBorderColor = textPrimary, unfocusedBorderColor = textPrimary)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Button(onClick = { /*TODO*/ },colors= ButtonDefaults.buttonColors(containerColor = textPrimary)) {
                    Text(text = "LOGIN", color = background)
                }
            }
        }
    }
}