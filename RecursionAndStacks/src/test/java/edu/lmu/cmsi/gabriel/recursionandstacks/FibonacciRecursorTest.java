package edu.lmu.cmsi.gabriel.recursionandstacks;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.recursionandstacks.fibonaccirecursor.FibonacciRecursor;

public class FibonacciRecursorTest {
	
	@Test
	public void numberOfRecursionsTest(){
		assertEquals("expected 2", 2, FibonacciRecursor.fibonacci(3));
		assertEquals("expected 55", 55, FibonacciRecursor.fibonacci(10));
		assertEquals("expected 5", 5, FibonacciRecursor.fibonacci(5));
		assertEquals("expected 21", 21, FibonacciRecursor.fibonacci(8));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidArgumentTest(){
		FibonacciRecursor.fibonacci(-1);
	}

}
