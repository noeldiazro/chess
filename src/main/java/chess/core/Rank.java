package chess.core;

import chess.core.pieces.Pawn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rank implements Iterable<Pawn> {
    public static final int CAPACITY = 8;
    
    private List<Pawn> pawns = new ArrayList<Pawn>();

    public int getPieceCount() {
	return pawns.size();
    }

    public void add(Pawn pawn) {
	pawns.add(pawn);
    }
    
    public Iterator<Pawn> iterator() {
	return pawns.iterator();
    }
}
