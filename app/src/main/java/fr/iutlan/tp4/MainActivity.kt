package fr.iutlan.tp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Accueil(name = "numéro 6")
        }
//        enableEdgeToEdge()
//        setContent {
//            TP4Theme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }

    }
}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TP4Theme {
//        Greeting("Android")
//    }
//}

@Composable
fun Accueil(name:String,modifier:Modifier=Modifier){
    ElevatedCard{
        Column(
            modifier=modifier.padding(8.dp),
            horizontalAlignment=Alignment.CenterHorizontally
        ){
            Text(
                text="Bonjour$name",
                fontSize=20.sp,
                modifier=Modifier.padding(12.dp))
            Text(text="Jevoisdegrandsprogrès",color=Color.Blue)
        }
    }
}
@Preview
@Composable
fun AccueilPreview(){
    Column{
        Accueil(name="numéro10",modifier=Modifier.fillMaxWidth())
        Accueil(name="numéro6") //valeurpardéfautdumodifier
    }
}