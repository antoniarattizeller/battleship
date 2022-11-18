import game.data.Board
import game.data.BoardSpaceContent

fun main(args: Array<String>) {

    for (x in 0..9) {
        for (y in 0..9) {
            val t = Board().matrix[y][x]
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