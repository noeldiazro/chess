package chess.ui;

import chess.core.Rank;
import chess.core.pieces.Pawn;
import java.util.Iterator;

class RankPrinter {
    private static final char FILLING_CHAR = '.';
    private PawnPrinter pawnPrinter = new PawnPrinter();
    
    String print(Rank rank) {
	StringBuilder representation = new StringBuilder(Rank.CAPACITY);

	for (Pawn pawn: rank)
	    representation.append(pawnPrinter.print(pawn));
	
	representation.append(getFill(rank));
	
	return representation.toString();
    }

    private String getFill(Rank rank) {
	StringBuilder fill = new StringBuilder();
	for (int i = rank.getPieceCount(); i < Rank.CAPACITY; i++)
	    fill.append(FILLING_CHAR);
	return fill.toString();
    }
}

