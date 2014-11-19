package edu.lmu.cmsi.gabriel.recursionandstacks;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.recursionandstacks.recursivemultiplier.RecursiveMultiplier;

public class RecursiveMultiplierTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeArguments(){
		RecursiveMultiplier.multiply(-1,1);
		RecursiveMultiplier.multiply(1,-1);
	}
	
	@Test
	public void validProductTest(){
		assertEquals("expected 2", 2, RecursiveMultiplier.multiply(2,1));
		assertEquals("expected 0", 0, RecursiveMultiplier.multiply(0,1));
		assertEquals("expected 0", 0, RecursiveMultiplier.multiply(1,0));
		assertEquals("expected 25", 25, RecursiveMultiplier.multiply(5,5));
		assertEquals("expected 175", 175, RecursiveMultiplier.multiply(25,7));
		
	}
}
