package chess.core;

import chess.core.pieces.Pawn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Rank implements Iterable<Pawn> {
    private List<Pawn> pawns = new ArrayList<Pawn>();

    int getPieceCount() {
	return pawns.size();
    }

    void add(Pawn pawn) {
	pawns.add(pawn);
    }
    
    public Iterator<Pawn> iterator() {
	return pawns.iterator();
    }
}