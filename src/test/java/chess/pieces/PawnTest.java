package chess.pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
    public void testCreateSpecifyingColor() {
	final Pawn pawn = new Pawn(Color.BLACK);
	
	assertEquals(Color.BLACK, pawn.getColor());
    }

    public void testCreateDefaultColor() {
	final Pawn pawn = new Pawn();

	assertEquals(Pawn.DEFAULT_COLOR, pawn.getColor());
    }
}
