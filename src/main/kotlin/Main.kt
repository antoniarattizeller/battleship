import data.BoardSpaceContent
import domains.Destination
import domains.board.BoardServiceImpl
import domains.DestinationManager

fun main(args: Array<String>) {
    DestinationManager().presentDestination(Destination.NewGame)
}

private fun boardRender() {
    for (x in 0..9) {
        for (y in 0..9) {
            val t = BoardServiceImpl().createBoard(10).matrix[y][x]
            val res = when (t) {
                is BoardSpaceContent.BigShip -> "o"
                BoardSpaceContent.Empty -> " |_"
                is BoardSpaceContent.MediumShip -> "x"
                is BoardSpaceContent.SmallShip -> "z"
            }
            print(res)
        }
        println()
    }
}