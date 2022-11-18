package domains.board

import data.Board
import data.BoardSpaceContent

interface BoardService{
    fun createBoard(size: Int): Board
}
class BoardServiceImpl: BoardService {
    override fun createBoard(size: Int): Board {
        return Board(matrix = createInitialMatrix(size))
    }

    private fun createColumn(size: Int): MutableList<BoardSpaceContent> {
        val tempList = mutableListOf<BoardSpaceContent>()
        boardIterator(size) {
            tempList.add(BoardSpaceContent.Empty)
        }
        return tempList
    }


    private fun createInitialMatrix(
        size: Int,
        withColumn: MutableList<BoardSpaceContent> = createColumn(size)
    ): List<MutableList<BoardSpaceContent>> {
        val secondaryTemp = mutableListOf<MutableList<BoardSpaceContent>>()
        boardIterator(size) {
            secondaryTemp.add(withColumn)
        }
        return secondaryTemp.toList()
    }

    private fun boardIterator(
        withSize: Int,
        action: () -> Unit
    ) {
        for (i in 1..withSize) {
            action()
        }
    }
}