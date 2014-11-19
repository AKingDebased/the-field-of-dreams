package edu.lmu.cmsi.gabriel.recursionandstacks;

import edu.lmu.cmsi.gabriel.recursionandstacks.fibonaccirecursor.FibonacciRecursor;
import edu.lmu.cmsi.gabriel.recursionandstacks.recursivemultiplier.RecursiveMultiplier;
import edu.lmu.cmsi.gabriel.recursionandstacks.symbolbalancer.SymbolBalancer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(SymbolBalancer.isBalanced("(()[])[]"));  
        System.out.println(RecursiveMultiplier.multiply(0, 4));
        System.out.println(FibonacciRecursor.fibonacci(-1));
    }
}
