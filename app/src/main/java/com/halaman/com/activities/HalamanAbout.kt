package com.halaman.com.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.halaman.com.activities.ui.theme.HalamanTheme

class HalamanAbout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HalamanTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    TopAppBar(
                        title = { Text(text = "Halaman About") },
                        navigationIcon = {
                            IconButton(onClick = {
                                finish()
                            }) {
                                Icon(
                                    imageVector = Icons.Filled.ArrowBack,
                                    contentDescription = "Go Back"
                                )
                            }
                        }
                    )

                    About()
                }
            }
        }
    }
}

@Composable
fun About() {
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = Icons.Filled.Person,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray),
                tint = Color.White,
                contentDescription = "User Profile")
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Gippy",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.1.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "gippy@dicoding.com",color = Color.DarkGray)
        }
    }
}

@Preview(name = "About", showSystemUi = true)
@Composable
fun AboutPerview() {
    About()
}