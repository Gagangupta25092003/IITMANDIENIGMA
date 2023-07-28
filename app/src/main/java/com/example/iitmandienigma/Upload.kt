package com.example.iitmandienigma

import android.os.Message
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.iitmandienigma.ui.theme.background
import com.example.iitmandienigma.ui.theme.surface
import com.example.iitmandienigma.ui.theme.textPrimary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun uploadPage(navController: NavController){
    val textmessage = remember {
        mutableStateOf("")
    }
    Scaffold(
        topBar = { Topbar()},
        bottomBar = { BottomBar(navController = navController)},
    ) {it
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = background)
            .padding(10.dp, 80.dp, 10.dp, 20.dp)){
            Column {
                TextField(value = textmessage.value, onValueChange ={
                    textmessage.value = it
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    colors = TextFieldDefaults.textFieldColors(containerColor = surface, textColor = textPrimary)
                )
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {

                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Upload")
                        
                    }

                }
            }
        }
    }
}