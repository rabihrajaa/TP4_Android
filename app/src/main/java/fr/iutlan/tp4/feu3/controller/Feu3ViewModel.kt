package fr.iutlan.tp4.feu3.controller

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import fr.iutlan.tp4.feu3.state.Feu3State
import fr.iutlan.tp4.feu3.state.FeuCouleur

class Feu3ViewModel : ViewModel() {
    private val _state = mutableStateOf(Feu3State())
    var state
        get() = _state.value
        private set(newState) {
            _state.value = newState
        }

    init {
        reset()
    }

    fun reset() {
        state = Feu3State()
    }

    fun suivant() {
        state = when (state.couleur) {
            FeuCouleur.ROUGE -> state.copyChangeCouleur(FeuCouleur.VERT)
            FeuCouleur.VERT -> state.copyChangeCouleur(FeuCouleur.ORANGE)
            FeuCouleur.ORANGE -> state.copyChangeCouleur(FeuCouleur.ROUGE)
        }
    }

}
