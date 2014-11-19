package edu.lmu.cmsi.gabriel.recursionandstacks.recursivemultiplier;

public class RecursiveMultiplier {
	
	public static int multiply(int numOne, int numTwo) {
		if (numOne < 0 || numTwo < 0) {
			throw new IllegalArgumentException("multiplicands must be positive");
		} else if (numOne == 0 || numTwo == 0) {
			return 0;
		}
		
		numTwo--;
		return numOne + multiply(numOne, numTwo);
	}
}
