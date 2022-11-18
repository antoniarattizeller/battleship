package domains.board

import data.Board

class BoardDataSource(
    private val boardService: BoardService = BoardServiceImpl()
) {
    private val boards = mutableListOf<Board>()
    fun getBoards() = boards.toList()

    fun createNewBoard(boardSize: Int = 10) =
        boards.add(boardService.createBoard(boardSize))
}