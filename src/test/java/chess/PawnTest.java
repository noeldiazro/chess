import junit.framework.TestCase;

public class PawnTest extends TestCase {
    public void testCreate() {
	final Pawn pawn = new Pawn(Color.BLACK);
	
	assertEquals(Color.BLACK, pawn.getColor());
    }
}
