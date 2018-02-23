package chess.core;

import chess.core.pieces.Color;
import chess.core.pieces.Pawn;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
    private Board board;
    
    @Override public void setUp() {
	board = new Board();
    }
    
    public void testBoardIsEmptyOnCreation() {
	assertEquals(0, board.getPieceCount());
	assertEquals(0, getPiecesOnBoard().size());
    }

    public void testInitializeBoard() {
	board.initialize();
	assertEquals(16, board.getPieceCount());
	assertEquals(16, getPiecesOnBoard().size());
    }
    
    private Collection<Pawn> getPiecesOnBoard() {
	Collection<Pawn> pieces = new HashSet<Pawn>();
	for (Pawn pawn: board) {
	    pieces.add(pawn);
	}
	return pieces;
    }
}
