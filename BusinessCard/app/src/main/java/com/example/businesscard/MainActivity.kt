package com.example.businesscard

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardText(name = "Brandon Dombrowsky", title = "Technical Project Manager",
                        phone = "phone: 206-555-5555", email = "email: brandon@brandon.com",
                        web = "web: brandon/linkedin.com")
                }
            }
        }
    }
}

@Composable
fun CardText(name: String, title: String, phone: String, email: String,
             web: String, modifier: Modifier = Modifier) {
    BizCardImage(
        message = "Me",
        title = "I'm An Orange")
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .paddingFromBaseline(170.dp)
    ) {
        Text(text = name, fontSize = 32.sp, color = Color.Magenta, fontWeight = FontWeight.Bold)
        Text(text = title, fontSize = 22.sp)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .paddingFromBaseline(600.dp)
    ) {
        Text(text = phone, fontSize = 14.sp)
        Text(text = email, fontSize = 14.sp, color = Color.Magenta)
        Text(text = web, fontSize = 14.sp)
    }
}

@Composable
fun BizCardImage(message: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.baseline_mood_24)

    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .background(color = Color.Cyan)
    )
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        CardText(name = "Brandon Dombrowsky", title = "Technical Project Manager",
            phone = "206-555-5555", email = "brandon@brandon.com", web = "brandon/linkedin.com")
    }
}