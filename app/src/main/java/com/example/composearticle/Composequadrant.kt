package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle.ui.theme.*

class Composequadrant : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    composeQuadrant()
                }
            }
        }
    }
}

@Composable
fun composeQuadrant() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            composeQuadrantInfo(
                title = stringResource(R.string.first_title),
                content = stringResource(R.string.first_content),
                backgroundColor = purple10,
                modifier = Modifier.weight(1f)
            )
            composeQuadrantInfo(
                title = stringResource(id = R.string.second_title),
                content = stringResource(id = R.string.second_content),
                backgroundColor = purple60,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            composeQuadrantInfo(
                title = stringResource(id = R.string.third_title),
                content = stringResource(id = R.string.third_content),
                backgroundColor = purple90,
                modifier = Modifier.weight(1f)
            )
            composeQuadrantInfo(
                title = stringResource(id = R.string.forth_title),
                content = stringResource(id = R.string.forth_content),
                backgroundColor = purple30,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun composeQuadrantInfo(
    title: String,
    content:String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
        
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeArticleTheme {
        composeQuadrant()
    }
}