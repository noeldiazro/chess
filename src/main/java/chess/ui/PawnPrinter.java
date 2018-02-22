package chess.ui;

import chess.pieces.Color;
import chess.pieces.Pawn;

class PawnPrinter {
    static final char BLACK_PAWN = 'P';
    static final char WHITE_PAWN = 'p';

    char print(Pawn pawn) {
	return pawn.getColor() == Color.BLACK ? BLACK_PAWN : WHITE_PAWN;
    }
}
