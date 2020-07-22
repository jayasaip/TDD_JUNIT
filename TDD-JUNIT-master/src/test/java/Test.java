import static org.junit.Assert.*;
import Task8.RemoveTwoAs;
public class Test {
	RemoveTwoAs obj;
	@org.junit.Before
	public void Before(){
		obj = new RemoveTwoAs();
	}
	@org.junit.Test
	public void testFirstChar() {
		/* ABCD-->BCD */
		assertEquals("BCD", obj.DelA("ABCD"));
	}
	@org.junit.Test
	public void testSecondChar() {
		/* BACD-->BCD */
		assertEquals("BCD", obj.DelA("BACD"));
	}
	@org.junit.Test
	public void testFirstTwoChars1() {
		/* BBCD-->BBCD */
		assertEquals("BBCD", obj.DelA("BBCD"));
	}
	@org.junit.Test
	public void testFirstTwoChars2() {
		/* AABD-->BD*/
		assertEquals("BD", obj.DelA("AABD"));
	}
	@org.junit.Test
	public void testFirstTwoChars3() {
		/* AABAA-->BAA */
		assertEquals("BAA", obj.DelA("AABAA"));
	}

}