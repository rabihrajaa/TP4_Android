package fr.iutlan.tp4.carrefour.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import fr.iutlan.tp4.carrefour.controller.CarrefourViewModel
import fr.iutlan.tp4.carrefour.state.CarrefourState

@Composable
fun MainActivityCarrefourView(viewmodel: CarrefourViewModel = viewModel()) {
    val state = viewmodel.state

    // Dégradé de fond
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFF0F2027), Color(0xFF203A43), Color(0xFF2C5364))
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(24.dp)
        ) {
            FeuCarrefourCard(state)
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { viewmodel.suivant() },
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .height(50.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA726))
            ) {
                Text(
                    text = "Changer Feu",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun FeuCarrefourCard(state: CarrefourState) {
    // Animation de la couleur du texte selon l'état du feu
    val animatedColor by animateColorAsState(
        targetValue = when (state.feuCourant.nomCouleur) {
            "rouge" -> Color.Red
            "orange" -> Color(0xFFFFA500) // Orange
            "vert" -> Color.Green
            else -> Color.Gray
        }, label = "Feu Color Animation"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Feu Actuel",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = state.feuCourant.nomCouleur.uppercase(),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = animatedColor
            )
        }
    }
}
