package chess.ui;

import junit.framework.TestCase;
import chess.core.Rank;
import chess.core.pieces.Color;
import chess.core.pieces.Pawn;

public class RankPrinterTest extends TestCase {
    private Rank rank;
    private RankPrinter printer;

    @Override public void setUp() {
	rank = new Rank();
	printer = new RankPrinter();
    }
    
    public void testPrintEmptyRank() {
	assertEquals("........", printer.print(rank));
    }

    public void testPrintRankWithOneBlackPawn() {
	rank.add(new Pawn(Color.BLACK));
	assertEquals("P.......", printer.print(rank));
    }

    public void testPrintRankWithOneWhitePawn() {
	rank.add(new Pawn(Color.WHITE));
	assertEquals("p.......", printer.print(rank));
    }

    public void testPrintRankFullOfBlackPawns() {
	for (int i=0; i < Rank.CAPACITY; i++) {
	    rank.add(new Pawn(Color.BLACK));
	}
	assertEquals("PPPPPPPP", printer.print(rank));
    }
}
