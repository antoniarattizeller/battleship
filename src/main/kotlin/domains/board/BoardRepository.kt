package domains.board

import data.Board

interface BoardRepository {
    fun getBoards(): List<Board>
}

class BoardRepositoryImpl(private val boardDataSource: BoardDataSource): BoardRepository {
    override fun getBoards(): List<Board> = boardDataSource.getBoards()
}