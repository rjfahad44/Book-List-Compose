package com.halaman.com.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.halaman.com.data.BookList
import com.halaman.com.ui.theme.HalamanTheme
import com.halaman.com.viewmodel.MainViewModel
import kotlinx.coroutines.delay
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val searchWidgetState by mainViewModel.searchWidgetState
            val searchTextState by mainViewModel.searchTextState
            var userSearchText by rememberSaveable {
                mutableStateOf("")
            }
            var allPersonList = BookList().getAllPersonList()
            var isLoading by remember {
                mutableStateOf(true)
            }
            LaunchedEffect(key1 = true) {
                delay(3000)
                isLoading = false
            }
            HalamanTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    MainAppBar(
                        searchWidgetState = searchWidgetState,
                        searchTextState = searchTextState,
                        onTextChange = {
                            mainViewModel.updateSearchTextState(newValue = it)
                        },
                        onCloseClicked = {
                            mainViewModel.updateSearchWidgetState(newValue = SearchWidgetState.CLOSED)
                        },
                        onSearchClicked = {
                            Log.d("Searched Text", it)
                        },
                        onSearchTriggered = {
                            mainViewModel.updateSearchWidgetState(newValue = SearchWidgetState.OPENED)
                        }
                    )
                    if (searchTextState.isNotEmpty()){
                        ShowListView(isLoading, ArrayList(allPersonList.filter { it.name.lowercase(
                            Locale.getDefault()
                        ).contains(searchTextState.lowercase(Locale.getDefault())) }))
                    }else{
                        ShowListView(isLoading, allPersonList)
                    }
                }
            }
        }
    }


    @Composable
    fun MainAppBar(
        searchWidgetState: SearchWidgetState,
        searchTextState: String,
        onTextChange: (String) -> Unit,
        onCloseClicked: () -> Unit,
        onSearchClicked: (String) -> Unit,
        onSearchTriggered: () -> Unit
    ) {
        when (searchWidgetState) {
            SearchWidgetState.CLOSED -> {
                DefaultAppBar(
                    onSearchClicked = onSearchTriggered
                )
            }
            SearchWidgetState.OPENED -> {
                SearchAppBar(
                    text = searchTextState,
                    onTextChange = onTextChange,
                    onCloseClicked = onCloseClicked,
                    onSearchClicked = onSearchClicked
                )
            }
        }
    }

    @Composable
    fun DefaultAppBar(onSearchClicked: () -> Unit) {

        TopAppBar(
            title = { Text(text = "Halaman Utama") },
            actions = {
                TopAppBarActionButton(
                    imageVector = Icons.Outlined.Person,
                    description = "About"
                ) {
                    startActivity(
                        Intent(
                            this@MainActivity,
                            HalamanAbout::class.java
                        )
                    )
                }

//                TopAppBarActionButton(
//                    imageVector = Icons.Outlined.Search,
//                    description = "Search"
//                ) {
//                    Toast.makeText(this@MainActivity, "Search", Toast.LENGTH_SHORT).show()
//                }
                IconButton(
                    onClick = { onSearchClicked() }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search Icon",
                        tint = Color.White
                    )
                }
            },
        )
    }

    @Composable
    fun SearchAppBar(
        text: String,
        onTextChange: (String) -> Unit,
        onCloseClicked: () -> Unit,
        onSearchClicked: (String) -> Unit,
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            elevation = AppBarDefaults.TopAppBarElevation,
            color = MaterialTheme.colors.primary
        ) {
            TextField(modifier = Modifier
                .fillMaxWidth(),
                value = text,
                onValueChange = {
                    onTextChange(it)
                },
                placeholder = {
                    Text(
                        modifier = Modifier
                            .alpha(ContentAlpha.medium),
                        text = "Search here...",
                        color = Color.White
                    )
                },
                textStyle = TextStyle(
                    fontSize = MaterialTheme.typography.subtitle1.fontSize
                ),
                singleLine = true,
                leadingIcon = {
                    IconButton(
                        modifier = Modifier
                            .alpha(ContentAlpha.medium),
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search Icon",
                            tint = Color.White
                        )
                    }
                },
                trailingIcon = {
                    IconButton(
                        onClick = {
                            if (text.isNotEmpty()) {
                                onTextChange("")
                            } else {
                                onCloseClicked()
                            }
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close Icon",
                            tint = Color.White
                        )
                    }
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Search
                ),
                keyboardActions = KeyboardActions(
                    onSearch = {
                        onSearchClicked(text)
                    }
                ),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    cursorColor = Color.White.copy(alpha = ContentAlpha.medium)
                ))
        }
    }

    @Composable
    fun ShowListView(isLoading: Boolean, allPersonList: ArrayList<BookModel>) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(all = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(
                items = allPersonList,
                key = {
                    it.id
                }
            ) {
                ShimmerListItem(
                    isLoading = isLoading,
                    contentAfterLoading = {
                        CardItem(it, ::itemClicked)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10))
                        .background(Color.LightGray)
                        .padding(all = 8.dp)
                )
            }
        }
    }

    private fun itemClicked(bookModel: BookModel){
        this.startActivity(Intent(this, HalamanDetails::class.java).apply {
            putExtra("id", bookModel.id)
            putExtra("name", bookModel.name)
            putExtra("author", bookModel.author)
            putExtra("date_publish", bookModel.date_publish)
            putExtra("summary", bookModel.summary)
            putExtra("genre", bookModel.genre)
            putExtra("ratings", bookModel.ratings)
            putExtra("price", bookModel.price)
            putExtra("url", bookModel.url)
        })
    }

    @Composable
    fun CardItem(bookModel: BookModel, onClick: (itemData: BookModel) -> Unit) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .clickable {
                    onClick(bookModel)
                }
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10))
                    .background(Color.LightGray)
                    .padding(8.dp)
            ) {
                Box(modifier = Modifier
                    .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(bookModel.url),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(60.dp)
                            .clip(RoundedCornerShape(10))
                            .padding(8.dp),
                        contentScale = ContentScale.Fit
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = bookModel.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = bookModel.author)
                    Text(text = bookModel.genre)
                }
            }
        }
    }

    @Composable
    fun TopAppBarActionButton(
        imageVector: ImageVector,
        description: String,
        onClick: () -> Unit
    ) {
        IconButton(onClick = {
            onClick()
        }) {
            Icon(imageVector = imageVector, contentDescription = description)
        }
    }

    @Preview(name = "MainActivity", showSystemUi = true)
    @Composable
    fun ListPreview() {
        ShowListView(false, BookList().getAllPersonList())
    }

    @Composable
    @Preview
    fun SearchAppBarPreview() {
        SearchAppBar(
            text = "Some random text",
            onTextChange = {},
            onCloseClicked = {},
            onSearchClicked = {}
        )
    }


    data class BookModel(
        val id: Int,
        val name: String,
        val author: String,
        val date_publish: String,
        val summary: String,
        val genre: String,
        val ratings: String,
        val price: String,
        val url: String,
    )
}

