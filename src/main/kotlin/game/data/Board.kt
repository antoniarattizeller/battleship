package game.data

class Board(
    private val boardSize: Int = 10
) {
    private val initialColumn = createColumn()
    val matrix = createInitialMatrix(withColumn = initialColumn)

    private fun createColumn(): MutableList<BoardSpaceContent> {
        val tempList = mutableListOf<BoardSpaceContent>()
        boardIterator {
            tempList.add(BoardSpaceContent.Empty)
        }
        return tempList
    }

    private fun createInitialMatrix(
        withColumn: MutableList<BoardSpaceContent> = createColumn()
    ): List<MutableList<BoardSpaceContent>> {
        val secondaryTemp = mutableListOf<MutableList<BoardSpaceContent>>()
        boardIterator {
            secondaryTemp.add(withColumn)
        }
        return secondaryTemp.toList()
    }

    private fun boardIterator(
        withSize: Int = boardSize,
        action: () -> Unit
    ) {
        for (i in 1..withSize) {
            action()
        }
    }
}