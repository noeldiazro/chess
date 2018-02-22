package chess;

import chess.pieces.Color;
import chess.pieces.Pawn;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
    private Board board;
    
    @Override public void setUp() {
	board = new Board();
    }
    
    public void testBoardCreation() {
	assertAddedPawns();
    }

    public void testAddPawnToEmptyBoard() {
	Pawn pawn = new Pawn(Color.BLACK);
	board.add(pawn);
	assertAddedPawns(pawn);
    }

    public void testAddSeveralPawnsToEmptyBoard() {
	Pawn blackPawn = new Pawn(Color.BLACK);
	Pawn whitePawn = new Pawn(Color.WHITE);

	board.add(blackPawn);
	board.add(whitePawn);

	assertAddedPawns(blackPawn, whitePawn);
    }

    private void assertAddedPawns(Pawn... expectedPawns) {
	assertEquals(expectedPawns.length, board.getPieceCount());

	Collection<Pawn> pawnsOnBoard = getPiecesOnBoard();
	assertTrue(pawnsOnBoard.containsAll(Arrays.asList(expectedPawns)));
    }
    
    private Collection<Pawn> getPiecesOnBoard() {
	Collection<Pawn> pieces = new HashSet<Pawn>();
	for (Pawn pawn: board) {
	    pieces.add(pawn);
	}
	return pieces;
    }
}
