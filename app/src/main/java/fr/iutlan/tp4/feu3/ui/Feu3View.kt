package fr.iutlan.tp4.feu3.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import fr.iutlan.tp4.feu3.controller.Feu3ViewModel
import fr.iutlan.tp4.feu3.state.Feu3State

@Composable
fun MainActivityFeu3View(viewmodel: Feu3ViewModel = viewModel()) {
    val state = viewmodel.state

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Feu3View(state)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewmodel.suivant() }) {
            Text("État suivant")
        }
    }
}

@Composable
fun Feu3View(state: Feu3State) {
    Text(
        text = "Feu ${state.nomCouleur}",
        style = MaterialTheme.typography.headlineMedium
    )
}
