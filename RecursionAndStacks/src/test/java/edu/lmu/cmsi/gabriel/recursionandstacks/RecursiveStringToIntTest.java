package edu.lmu.cmsi.gabriel.recursionandstacks;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.recursionandstacks.recursivestringtoint.RecursiveStringToInt;

public class RecursiveStringToIntTest {

	public void testEmptyString(){
		assertEquals("false - expected 0", 0, RecursiveStringToInt.stringToInt(""));
	}
	
	@Test
	public void expectedConversionsTest(){
		assertEquals("false - expected 10", 10, RecursiveStringToInt.stringToInt("10"));
		assertEquals("false - expected 257", 257, RecursiveStringToInt.stringToInt("257"));
		assertEquals("false - expected 888", 888, RecursiveStringToInt.stringToInt("888"));
		assertEquals("false - expected 5", 5, RecursiveStringToInt.stringToInt("5"));
		assertEquals("false - expected 1", 1, RecursiveStringToInt.stringToInt("1"));
	}
}
