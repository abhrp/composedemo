package com.abhrp.composedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.abhrp.composedemo.ui.ComposeDemoTheme
import com.abhrp.composedemo.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    NewsStory()
                }
            }
        }
    }
}


@Composable
fun NewsStory() {
    val image = imageResource(id = R.drawable.background)
    val modifier = Modifier.padding(16.dp)
    Column(modifier = modifier) {
        val imageModifier = Modifier
                .preferredHeight(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(8.dp))
        Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
        Spacer(Modifier.preferredHeight(10.dp))
        Text("A day in Shark Fin Cove", style = typography.h6)
        Text("Davenport, California", style = typography.body2)
        Text("December 2018", style = typography.body2)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        NewsStory()
    }
}