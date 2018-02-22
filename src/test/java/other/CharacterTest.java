package other;

import junit.framework.TestCase;

public class CharacterTest extends TestCase {
    public void testWhitespace() {
	assertTrue("Space is whitespace", Character.isWhitespace(' '));
	assertTrue("Carriage return is whitespace", Character.isWhitespace('\r'));
	assertTrue("New line is whitespace", Character.isWhitespace('\n'));
	assertTrue("Tab is whitespace", Character.isWhitespace('\t'));
    }

    public void testIdentifiers() {
	assertFalse(Character.isJavaIdentifierPart('^'));
	assertFalse(Character.isJavaIdentifierPart('-'));
	assertFalse(Character.isJavaIdentifierPart('?'));
	assertTrue(Character.isJavaIdentifierPart('$'));
	assertTrue(Character.isJavaIdentifierPart('_'));
	assertTrue(Character.isJavaIdentifierPart('0'));
	assertTrue(Character.isJavaIdentifierPart('a'));
	assertTrue(Character.isJavaIdentifierPart('A'));

	assertFalse(Character.isJavaIdentifierStart('0'));
	assertTrue(Character.isJavaIdentifierStart('$'));
	assertTrue(Character.isJavaIdentifierStart('_'));
	assertTrue(Character.isJavaIdentifierStart('a'));
	assertTrue(Character.isJavaIdentifierStart('A'));
    }
}
