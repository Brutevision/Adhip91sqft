package com.example.adhip91sqft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adhip91sqft.ui.theme.Adhip91sqftTheme

data class ListItem(val icon: ImageVector, val text1: String, val text2: String)

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
                    Column() {
                        Banner("Title", "clientName", "JOB ID")
                        MyList()
                    }
                }
            }
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

@Composable
fun ItemWithIconAndTexts(item: ListItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Surface(
            modifier = Modifier.size(48.dp),
            color = MaterialTheme.colorScheme.primary,
            shape = MaterialTheme.shapes.small
        ) {
            item.icon
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = item.text1,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 16.sp
            )
            Text(
                text = item.text2,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Composable
fun MyList() {
    val items = listOf(
        ListItem(Icons.Default.CheckCircle, "Item 1", "Description 1"),
        ListItem(Icons.Default.CheckCircle, "Item 2", "Description 2"),
        ListItem(Icons.Default.CheckCircle, "Item 3", "Description 3"),
        ListItem(Icons.Default.CheckCircle, "Item 4", "Description 4"),
        ListItem(Icons.Default.CheckCircle, "Item 5", "Description 5")
    )

    LazyColumn {
        items(items) { item ->
            ItemWithIconAndTexts(item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Adhip91sqftTheme {
        MyList()
    }
}