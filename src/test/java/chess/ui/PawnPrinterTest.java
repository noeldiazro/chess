package chess.ui;

import chess.pieces.Color;
import chess.pieces.Pawn;
import junit.framework.TestCase;

public class PawnPrinterTest extends TestCase {
    private PawnPrinter printer;

    @Override public void setUp() {
	printer = new PawnPrinter();
    }
    
    public void testPrintBlackPawn() {
	assertRepresentation(Color.BLACK, PawnPrinter.BLACK_PAWN);
    }

    public void testPrintWhitePawn() {
	assertRepresentation(Color.WHITE, PawnPrinter.WHITE_PAWN);
    }

    private void assertRepresentation(Color color, char representation) {
	Pawn pawn = new Pawn(color);
	assertEquals(representation, printer.print(pawn));
    }
}
