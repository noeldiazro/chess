package chess.core;

import chess.core.pieces.Color;
import chess.core.pieces.Pawn;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import junit.framework.TestCase;

public class RankTest extends TestCase {
    private Rank rank;

    @Override public void setUp() {
	rank = new Rank();
    }
    
    public void testRankIsEmptyAfterCreation() {
	assertEquals(0, rank.getPieceCount());
	assertContents();
    }

    public void testAddingPawns() {
	Pawn blackPawn = new Pawn(Color.BLACK);
	Pawn whitePawn = new Pawn(Color.WHITE);

	rank.add(blackPawn);
	rank.add(whitePawn);
	
	assertEquals(2, rank.getPieceCount());
	assertContents(blackPawn, whitePawn);
    }

    private void assertContents(Pawn... expected) {
	List<Pawn> actual = getPieces();
	compare(Arrays.asList(expected), actual);
    }
    
    private List<Pawn> getPieces() {
	List<Pawn> pieces = new ArrayList<Pawn>();
	for (Pawn pawn: rank) {
	    pieces.add(pawn);
	}
	return pieces;
    }

    private boolean compare(List<Pawn> expected, List<Pawn> actual) {
	if (!haveSameSize(expected, actual))
	    return false;
	
	for (int i=0; i < expected.size(); i++)
	    if (!haveSameColor(expected.get(i), actual.get(i)))
		return false;

	return true;
    }

    private boolean haveSameSize(List<Pawn> first, List<Pawn> second) {
	return first.size() == second.size();
    }

    private boolean haveSameColor(Pawn first, Pawn second) {
	return first.getColor() == second.getColor();
    }
}


