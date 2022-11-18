package domains

import domains.newGame.NewGameView

enum class Destination {
    NewGame,
    SettingUpBoard,
    PLayingMatch
}

class DestinationManager {
    fun presentDestination(currentDestination: Destination): NewGameView {
        return when (currentDestination) {
            Destination.NewGame -> NewGameView()
            Destination.SettingUpBoard -> TODO()
            Destination.PLayingMatch -> TODO()
        }
    }
}