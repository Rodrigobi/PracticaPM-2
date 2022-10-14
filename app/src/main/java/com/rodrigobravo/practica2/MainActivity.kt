package com.rodrigobravo.practica2

import android.media.browse.MediaBrowser.MediaItem
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rodrigobravo.practica2.ui.theme.Practica2Theme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paginalogin()
            MainScreen()
            DetailScreen()



        }
    }
}












@Composable
fun MainScreen() {
    Practica2Theme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = stringResource(id = R.string.app_name)) },
                        navigationIcon = {
                            IconButton(onClick = {}) {
                                Icon(imageVector = Icons.Default.Menu,
                                    contentDescription = null)
                            }
                        }
                    )
                }
            ) {padding ->
                MediaList(modifier = Modifier.padding(padding))
            }
        }
    }

}



@Composable
fun DetailScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column() {
            Text(
                text = "¿Quienes soy?",
                style = MaterialTheme.typography.h4
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
            )
            Text(
                text = "Rodrigo Bravo Isla - 20192247",
                style = MaterialTheme.typography.h5
            )
        }
    }
}


//@Preview(showBackground = true)
@Composable
fun MediaItemD() {
    Column {
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(150.dp)
        ) {
            Doctor()

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .width(150.dp)
                .background(MaterialTheme.colors.secondary)
                .padding(10.dp)
        ) {
            Text(text = "Doctor Strange 2",
            style = MaterialTheme.typography.h6)
        }
    }
}
@Composable
fun MediaItemT() {
    Column {
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(150.dp)
        ) {
            Topgun()

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .width(150.dp)
                .background(MaterialTheme.colors.secondary)
                .padding(10.dp)
        ) {
            Text(text = "Top Gun Maverick",
                style = MaterialTheme.typography.h6)
        }
    }
}
@Composable
fun MediaItemP() {
    Column {
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(150.dp)
        ) {
            Pikachu()

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .width(150.dp)
                .background(MaterialTheme.colors.secondary)
                .padding(10.dp)
        ) {
            Text(text = "Pikachu",
                style = MaterialTheme.typography.h6)
        }
    }
}

@Preview
@Composable
fun MediaList(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier
    ) {
        items(9){
            MediaItemD()
            MediaItemT()
            MediaItemP()
        }
    }
}


@Composable
fun Doctor() {
    Image(
        painter = painterResource(R.drawable.doctor),
        contentDescription = "doctor",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}
@Composable
fun Doctor1() {
    Image(
        painter = painterResource(R.drawable.doctor),
        contentDescription = "doctor",
        modifier = Modifier.size(150.dp),
        contentScale = ContentScale.Crop
    )
}
@Composable
fun Topgun() {
    Image(
        painter = painterResource(R.drawable.topgun),
        contentDescription = "topgun",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}
@Composable
fun Pikachu() {
    Image(
        painter = painterResource(R.drawable.pikachu),
        contentDescription = "pikachu",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}




//ESTE ES LA PRIMERA PESTAÑA @Preview(
    //showBackground = true,
    //widthDp = 200,
    //heightDp = 400
//)
@Composable
fun Paginalogin() {
    Practica2Theme {
        Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        OutLineTextFieldSample()
        SimpleButton()
        }

    }
}

@Composable
fun OutLineTextFieldSample() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        label = { Text(text = "Nombre") },
        onValueChange = {
            text = it
        }
    )
}

@Composable
fun SimpleButton() {
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Ingresar")
    }
}