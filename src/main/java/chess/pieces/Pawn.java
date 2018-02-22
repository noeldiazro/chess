package chess.pieces;

public class Pawn {
    static final Color DEFAULT_COLOR = Color.WHITE;

    private Color color;

    public Pawn() {
	this(DEFAULT_COLOR);
    }
    
    public Pawn(Color color) {
	this.color = color;
    }
    
    public Color getColor() {
	return color;
    }
}
