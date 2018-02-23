package chess.core;

import chess.core.pieces.Pawn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Board implements Iterable<Pawn> {
    private List<Pawn> pawns = new ArrayList<Pawn>();
    
    int getPieceCount() {
	return pawns.size();
    }

    void initialize() {
	for (int i=0; i < 16; i++) {
	    add(new Pawn());
	}
    }

    private void add(Pawn pawn) {
	pawns.add(pawn);
    }

    @Override public Iterator<Pawn> iterator() {
	return pawns.iterator();
    }
}
