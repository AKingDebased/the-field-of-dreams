package edu.lmu.cmsi.gabriel.recursionandstacks;

import edu.lmu.cmsi.gabriel.recursionandstacks.symbolbalancer.SymbolBalancer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(SymbolBalancer.isBalanced("([)][][(]))("));
    }
}
