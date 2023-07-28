package com.example.iitmandienigma

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.iitmandienigma.ui.theme.background
import com.example.iitmandienigma.ui.theme.primaryColor
import com.example.iitmandienigma.ui.theme.textPrimary
@Composable
fun StartScreenPage(navController : NavController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = background)){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "IIT MANDI",
                color = textPrimary,
                fontSize = 28.sp,
            )
            Text(
                text = "ENIGMA",
                color = primaryColor,
                fontSize = 36.sp
            )

        }
    }
}

