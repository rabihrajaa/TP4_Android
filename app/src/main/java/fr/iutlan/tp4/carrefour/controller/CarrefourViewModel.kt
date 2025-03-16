package fr.iutlan.tp4.carrefour.controller

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import fr.iutlan.tp4.carrefour.state.CarrefourState
import fr.iutlan.tp4.feu3.state.Feu3State

class CarrefourViewModel : ViewModel() {
    private val _state = mutableStateOf(CarrefourState())
    var state: CarrefourState
        get() = _state.value
        private set(value) { _state.value = value }

    fun suivant() {
        state = when {
            state.feuCourant.rouge -> state.copyChangeCouleurCourant(Feu3State(false, false, true))
            state.feuCourant.vert -> state.copyChangeCouleurCourant(Feu3State(false, true, false))
            else -> state.copyChangeCourant(state.courant + 1)
        }
    }
}
