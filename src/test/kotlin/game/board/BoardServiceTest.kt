package game.board

import game.data.Board
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*

@DisplayName("Given a board is being created")
internal class BoardServiceTest {


    @DisplayName("When I chose a board size of ten")
    @Nested
    inner class CreateBoard {

        private lateinit var board: Board
        private val boardSize = 10
        @BeforeEach
        fun whenBoardSizeIsChosen() {
            board = BoardService().createBoard(10)
        }

        @Test
        @DisplayName("Then the column size must be 10")
        fun thenColumnIsEqual() {
            assertEquals(boardSize, board.matrix[0].size)
        }


        @Test
        @DisplayName("And the row length must be 10")
        fun andRowIsEqualTen() {
            assertEquals(boardSize, board.matrix.size)
        }
    }
}