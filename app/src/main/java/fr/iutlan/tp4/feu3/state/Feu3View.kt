package fr.iutlan.tp4.feu3.state

data class Feu3State(
    val rouge: Boolean = true,
    val orange: Boolean = false,
    val vert: Boolean = false,
) {
    val nomCouleur: String
        get() = when {
            rouge -> "rouge"
            orange -> "orange"
            vert -> "vert"
            else -> "???"
        }
}
