package fr.iutlan.tp4.carrefour.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import fr.iutlan.tp4.carrefour.controller.CarrefourViewModel
import fr.iutlan.tp4.carrefour.state.CarrefourState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainActivityCarrefourView(viewmodel: CarrefourViewModel = viewModel()) {
    val state = viewmodel.state

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Feu courant: ${state.feuCourant.nomCouleur}")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewmodel.suivant() }) {
            Text("Changer Feu")
        }
    }
}
