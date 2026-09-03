package com.example.malika_helloworldpam

//import com.example.greetingcard.ui.theme.GreetingCardTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.malika_helloworldpam.ui.theme.MalikaHelloWorldPAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MalikaHelloWorldPAMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        nama = "Malika Zahro Nadia Aulia",
                        nim = "245150401111007",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

val gradientColors = listOf(Color.Cyan, Color.LightGray, Color.Red)

@Composable
fun Greeting(nama: String, nim: String, modifier: Modifier = Modifier) {
    Surface(color = MaterialTheme.colorScheme.primary) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            alpha = 0.6F
        )

        val headline = MaterialTheme.typography.headlineMedium.copy(fontStyle = FontStyle.Italic)
        val body = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight(700))
        val title = MaterialTheme.typography.titleLarge

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = buildAnnotatedString {
//                    withStyle(style = display.toSpanStyle()) {
//                        append("Halo!\n")
//                    }
//                    append("Saya ")

                    withStyle(style = headline.toSpanStyle()) {
                        append("$nama\n")
                    }
//                    append("NIM saya ")

                    withStyle(style = body.toSpanStyle()) {
                        append("$nim\n")
                    }

                },
//                modifier =
//                    modifier.mar
                //                    .fillMaxWidth()
                //                    .fillMaxHeight()
                //                    .padding(24.dp, 80.dp, 24.dp, 24.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
//                color = MaterialTheme.colorScheme.background
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MalikaHelloWorldPAMTheme {
        Greeting("Malika Zahro Nadia Aulia", "245150401111007")
    }
}