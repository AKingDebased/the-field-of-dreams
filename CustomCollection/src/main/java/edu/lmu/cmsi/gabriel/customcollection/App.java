package edu.lmu.cmsi.gabriel.customcollection;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.ccarray.CCArray;

public class App 
{
    public static void main( String[] args )
    {
        CCArray<Integer> testList = new CCArray<Integer>(5);
        
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        
        System.out.println("elements added");
        
        System.out.println(testList.getNewest());
        System.out.println(testList.getOldest());
        
        System.out.println("overloading CCList");
        testList.add(0);
        
        System.out.println(testList.getNewest());
        System.out.println(testList.getOldest());
        
    }
}
