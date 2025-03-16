package fr.iutlan.tp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import fr.iutlan.tp4.feu3.ui.MainActivityFeu3View

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainActivityFeu3View()
                }
            }
        }
    }
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

//    }
//}
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

//@Composable
//fun Accueil(name:String,modifier:Modifier=Modifier){
//    ElevatedCard{
//        Column(
//            modifier=modifier.padding(8.dp),
//            horizontalAlignment=Alignment.CenterHorizontally
//        ){
//            Text(
//                text="Bonjour$name",
//                fontSize=20.sp,
//                modifier=Modifier.padding(12.dp))
//            Text(text="Jevoisdegrandsprogrès",color=Color.Blue)
//        }
//    }
//}
//@Preview
//@Composable
//fun AccueilPreview(){
//    Column{
//        Accueil(name="numéro10",modifier=Modifier.fillMaxWidth())
//        Accueil(name="numéro6") //valeurpardéfautdumodifier
//    }
//}

//@Composable
//fun AccueilMultipleSeulementJ(names: List<String>) {
//    Column {
//        for (name in names) {
//            if (name.startsWith("j")) {
//                Text(text = "Bonjour $name !",modifier=Modifier.padding(4.dp))
//            }
//        }
//    }
//}
//@Preview
//@Composable
//fun AccueilMultipleSeulementJPreview() {
//    AccueilMultipleSeulementJ(listOf("paul", "jean", "pierre", "jacques"))
//}

