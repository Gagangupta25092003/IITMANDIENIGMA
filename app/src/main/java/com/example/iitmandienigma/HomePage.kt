package com.example.iitmandienigma

import android.widget.Space
import android.widget.Toast
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.iitmandienigma.ui.theme.background
import com.example.iitmandienigma.ui.theme.surface
import com.example.iitmandienigma.ui.theme.textPrimary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenPage(navController: NavController){
    Scaffold(
        topBar = {
                 Topbar()
        },
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) {it
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 0.dp, 0.dp)
            .background(color = background)
            .fillMaxSize()){
            Column(modifier = Modifier.padding(10.dp, 80.dp, 10.dp, 20.dp)) {
                MessageCard(name = "Gagan Gupta", rollNumber = "B21189", time = "12th August, 2023", message = "Chennai Super Kings is a professional cricket franchise based in Chennai, Tamil Nadu, India, that competes in the Indian Premier League. Founded in 2008, the team plays its home matches at the M. A. Chidambaram Stadium in Chennai.\n")
                MessageCard(name = "Gagan Gupta", rollNumber = "B21189", time = "12th August, 2023", message = "Chennai Super Kings is a professional cricket franchise based in Chennai, Tamil Nadu, India, that competes in the Indian Premier League. Founded in 2008, the team plays its home matches at the M. A. Chidambaram Stadium in Chennai.\n")
                MessageCard(name = "Gagan Gupta", rollNumber = "B21189", time = "12th August, 2023", message = "Chennai Super Kings is a professional cricket franchise based in Chennai, Tamil Nadu, India, that competes in the Indian Premier League. Founded in 2008, the team plays its home matches at the M. A. Chidambaram Stadium in Chennai.\n")
                MessageCard(name = "Gagan Gupta", rollNumber = "B21189", time = "12th August, 2023", message = "Chennai Super Kings is a professional cricket franchise based in Chennai, Tamil Nadu, India, that competes in the Indian Premier League. Founded in 2008, the team plays its home matches at the M. A. Chidambaram Stadium in Chennai.\n")
                MessageCard(name = "Gagan Gupta", rollNumber = "B21189", time = "2th August, 2023", message = "Chennai Super Kings is a professional cricket franchise based in Chennai, Tamil Nadu, India, that competes in the Indian Premier League. Founded in 2008, the team plays its home matches at the M. A. Chidambaram Stadium in Chennai.\n")

            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar(){
    TopAppBar(
        title = {
            Text(text = "ENIGMA",
            color = textPrimary)
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = surface),

    )
}

@Composable
fun BottomBar(navController : NavController){
    BottomAppBar(
        containerColor = surface,
        contentColor = textPrimary,
    ) {
       Row(
           horizontalArrangement = Arrangement.SpaceEvenly,
           modifier = Modifier.fillMaxWidth()
       ) {
           IconButton(onClick = {
               navController.navigate(Screen.mainscreen.route)
           }) {
               Icon(painter = painterResource(id = R.drawable.baseline_home_24), contentDescription = "")
           }
           IconButton(onClick = { navController.navigate(Screen.uploadscreen.route )}) {

               Icon(painter = painterResource(id = R.drawable.baseline_add_circle_outline_24), contentDescription = "")
           }
           IconButton(onClick = { navController.navigate(Screen.loginscreen.route) }) {
               Icon(painter = painterResource(id = R.drawable.baseline_account_circle_24), contentDescription = "")
           }

               
       }

    }
}

@Composable
fun MessageCard(name:String, rollNumber:String, time:String, message:String){
    Spacer(modifier = Modifier.height(20.dp))
    Column(
        modifier = Modifier
            .background(color = surface)
            .padding(5.dp)
    ) {
        Text(text = name, color = textPrimary)
        Text(text = rollNumber, color = textPrimary)
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = message, color = textPrimary)
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(painter = painterResource(id = R.drawable.baseline_thumb_up_24), contentDescription = "", tint = textPrimary)
            Spacer(modifier = Modifier.width(20.dp))
            Icon(painter = painterResource(id = R.drawable.baseline_comment_24), contentDescription = "", tint = textPrimary)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = time, color = textPrimary)

            }

        }
        
    }
}