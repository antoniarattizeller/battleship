package game.data

sealed class BoardSpaceContent {
    object Empty : BoardSpaceContent()
    data class BigShip(val id: Int) : BoardSpaceContent()
    data class MediumShip(val id: Int) : BoardSpaceContent()
    data class SmallShip(val id: Int) : BoardSpaceContent()
}