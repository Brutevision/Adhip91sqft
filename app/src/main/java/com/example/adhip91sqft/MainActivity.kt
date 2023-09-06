package com.example.adhip91sqft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.layout.ModifierLocalPinnableParent
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.adhip91sqft.ui.theme.Adhip91sqftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Adhip91sqftTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Banner("Title", "clientName", "JOB ID")

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemList() {
    var items by remember { mutableStateOf(List(10) { "Item $it" }) }

    var newItemText by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        BasicTextField(
            value = newItemText, onValueChange = { newItemText = it },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 5.dp),
            textStyle = TextStyle.Default.copy(color = Color.Black)
        )

        LazyColumn {

        }
    }

}

@Composable
fun Banner(title: String, clientName: String, jobId: String) {
    Column() {
        Text(modifier = Modifier, text = title, fontWeight = FontWeight.Bold)
        Row() {
            Text(text = "CLIENT")
            Text(text = clientName)
            Text(text = "JOB ID")
            Text(text = jobId)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Adhip91sqftTheme {
        ItemList()
    }
}