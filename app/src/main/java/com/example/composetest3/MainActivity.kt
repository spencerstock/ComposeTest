package com.example.composetest3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hi $name!")
}


@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        val texts = mutableListOf<String>("test1", "test2", "test3")

        Column(
            crossAxisAlignment = CrossAxisAlignment.Center,
            crossAxisSize = LayoutSize.Expand,
            modifier = Spacing(16.dp)
        ) {

            for (text in texts) {
                Text(text = text)
            }
        }

    }
}
