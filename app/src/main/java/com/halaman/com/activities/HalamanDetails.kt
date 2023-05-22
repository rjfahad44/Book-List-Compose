package com.halaman.com.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.halaman.com.ui.ui.theme.HalamanTheme
import kotlinx.coroutines.*

class HalamanDetails : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HalamanTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    TopAppBar(
                        title = { Text(text = "Halaman Details") },
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

                    val id = intent?.getIntExtra("id", -1)
                    val name = intent?.getStringExtra("name")
                    val author = intent?.getStringExtra("author")
                    val date_publish = intent?.getStringExtra("date_publish")
                    val summary = intent?.getStringExtra("summary")
                    val genre = intent?.getStringExtra("genre")
                    val ratings = intent?.getStringExtra("ratings")
                    val price = intent?.getStringExtra("price")
                    val url = intent?.getStringExtra("url")

                    LayoutDesign(
                        id,
                        name,
                        author,
                        date_publish,
                        summary,
                        genre,
                        ratings,
                        price,
                        url
                    )
                }
            }
        }
    }

    @Composable
    fun LayoutDesign(
        id: Int?,
        name: String?,
        author: String?,
        date_publish: String?,
        summary: String?,
        genre: String?,
        ratings: String?,
        price: String?,
        url: String?
    ) {

        Log.d("GET_DATA", "${id}  ${name}  ${author}")

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberAsyncImagePainter(url),
                    contentDescription = null,
                    modifier = Modifier
                        .width(120.dp)
                        .height(200.dp)
                        .clip(RoundedCornerShape(10))
                        .padding(8.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column(modifier = Modifier
                    .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = "Book Name:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = name?:"")

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Author:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(text = author?:"")

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Publish Date:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = date_publish?:"")

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Genre:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = genre?:"")
                }
            }


            Spacer(modifier = Modifier.height(20.dp))

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            ) {
                Text(
                    text = "Rating:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = ratings?:"")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            ) {
                Text(
                    text = "Book Price:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = price?:"")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            ) {
                Text(
                    text = "Book Summary:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = summary?:"")
            }
        }
    }

    @Preview(name = "MainActivity", showSystemUi = true)
    @Composable
    fun ShowPreview() {
        LayoutDesign(1, "name", "author", "date_publish", "summary", "genre", "ratings", "price", "url")
    }

}
