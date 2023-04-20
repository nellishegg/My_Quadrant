import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Combination()

                }
            }
        }
    }
}

//@Composable
//fun Combination2() {
//    Column(modifier = Modifier.fillMaxSize()) {
//        Row(modifier = Modifier
//            .fillMaxSize()
//            .weight(1f)) {
//            Quadrant(
//                text1 = "",
//                text2 = "",
//                background = Color.Red,
//                modifier = Modifier.fillMaxSize().weight(1f)
//            )
//            Quadrant(
//                text1 = "",
//                text2 = "",
//                background = Color.Red,
//                modifier = Modifier.fillMaxSize().weight(1f)
//            )
//        }
//        Row(modifier = Modifier.fillMaxSize().weight(1f)) {
//            Quadrant(
//                text1 = "",
//                text2 = "",
//                background = Color.Red,
//                modifier = Modifier.weight(1f)
//            )
//            Quadrant(
//                text1 = "",
//                text2 = "",
//                background = Color.Red,
//                modifier = Modifier.weight(1f)
//            )
//        }
//    }
//}
//
//@Preview
//@Composable
//fun Test() {
//    Combination2()
//}

@Composable
fun Combination() {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Quadrant(
                text1 = "Text composable",
                text2 = "Displays text and follows Material Design guidelines.",
                background = Color.Green,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)

            )
            Quadrant(
                text1 = "Image composable",
                text2 = "Creates a composable that lays out and draws a given Painter class object.",
                background = Color.Cyan,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Quadrant(text1 = "Image composable",
                text2 ="Creates a composable that lays out and draws a given Painter class object." ,
                background =Color.Yellow ,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
        Quadrant(text1 = "Column composable",
            text2 = "A layout composable that places its children in a vertical sequence.",
            background = Color.LightGray ,
            modifier = Modifier
                .fillMaxSize()
                .weight(1f))
        }
    }
}


@Composable
fun Quadrant(text1: String, text2: String, background: Color, modifier: Modifier) {
    Column(
        modifier = modifier
            .background(background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text1,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Combination()
    }
}