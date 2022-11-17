package game.board

import game.data.Board

class BoardDataSource {
    private val boards = mutableListOf<Board>()
    fun getBoards() = boards.toList()

    fun createNewBoard(boardSize: Int = 10) =
        boards.add(Board(boardSize))
}