package fr.iutlan.tp4.feu3.state

//data class Feu3State(
//    val rouge: Boolean = true,
//    val orange: Boolean = false,
//    val vert: Boolean = false
//) {
//    /**
//     * @return Nom de la couleur courante
//     */
//    val nomCouleur: String
//        get() = when {
//            rouge -> "rouge"
//            orange -> "orange"
//            vert -> "vert"
//            else -> "???"
//        }
//}

enum class FeuCouleur {
    ROUGE,
    ORANGE,
    VERT
}

data class Feu3State(
    val couleur: FeuCouleur = FeuCouleur.ROUGE
) {
    val nomCouleur: String
        get() = couleur.toString().lowercase()

    val rouge get() = couleur == FeuCouleur.ROUGE
    val orange get() = couleur == FeuCouleur.ORANGE
    val vert get() = couleur == FeuCouleur.VERT

    fun copyChangeCouleur(nouvelle: FeuCouleur): Feu3State {
        return this.copy(couleur = nouvelle)
    }
}

