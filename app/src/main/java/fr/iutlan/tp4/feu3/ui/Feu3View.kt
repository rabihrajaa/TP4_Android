package fr.iutlan.tp4.feu3.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import fr.iutlan.tp4.feu3.controller.Feu3ViewModel
import fr.iutlan.tp4.feu3.state.Feu3State

@Composable
fun MainActivityFeu3View(viewmodel: Feu3ViewModel = viewModel()) {
    val state = viewmodel.state

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E1E)), // Fond sombre pour un effet réaliste
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(24.dp)
        ) {
            Feu3Card(state)
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
fun Feu3Card(state: Feu3State) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FeuAnimated(Color.Red, state.rouge)
            FeuAnimated(Color(0xFFFFA500), state.orange) // Orange
            FeuAnimated(Color.Green, state.vert)
        }
    }
}

@Composable
fun FeuAnimated(color: Color, isOn: Boolean, modifier: Modifier = Modifier) {
    val animatedColor by animateColorAsState(
        targetValue = if (isOn) color else Color.DarkGray,
        label = "Feu Color Animation"
    )

    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(8.dp),
        onDraw = {
            drawCircle(
                color = animatedColor,
                radius = size.minDimension / 2
            )
        }
    )
}
