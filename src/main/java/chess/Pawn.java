class Pawn {
    static final Color DEFAULT_COLOR = Color.WHITE;

    private Color color;

    Pawn() {
	this(DEFAULT_COLOR);
    }
    
    Pawn(Color color) {
	this.color = color;
    }
    
    Color getColor() {
	return color;
    }
}
