package fr.iutlan.tp4.carrefour.state

import fr.iutlan.tp4.feu3.state.Feu3State

data class CarrefourState(
    val courant: Int = 0,
    val feux: Array<Feu3State> = arrayOf(Feu3State(), Feu3State(), Feu3State(), Feu3State())
) {
    val feuCourant get() = feux[courant]

    fun copyChangeCouleurCourant(couleur: Feu3State): CarrefourState {
        val nouveauxFeux = feux.copyOf()
        nouveauxFeux[courant] = couleur
        return copy(feux = nouveauxFeux)
    }

    fun copyChangeCourant(num: Int): CarrefourState {
        return copy(courant = num % feux.size)
    }
}
