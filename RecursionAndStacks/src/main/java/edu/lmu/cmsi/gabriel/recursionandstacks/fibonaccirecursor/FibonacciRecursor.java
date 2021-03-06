package edu.lmu.cmsi.gabriel.recursionandstacks.fibonaccirecursor;

public final class FibonacciRecursor {
	
	public static int fibonacci(int n)  {
		if(n < 0){
			throw new IllegalArgumentException("argument must be positive whole number");
		}
	    if(n == 0){
	        return 0;
	    } else if(n == 1){
	      return 1;
	    } 
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
