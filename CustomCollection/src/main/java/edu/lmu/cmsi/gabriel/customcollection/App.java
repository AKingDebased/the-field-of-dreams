package edu.lmu.cmsi.gabriel.customcollection;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclist.CCList;

public class App 
{
    public static void main( String[] args )
    {
        CCList<Integer> testList = new CCList<Integer>(5);
        
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        
        System.out.println("elements added");
        
        System.out.println(testList.getNewest());
        System.out.println(testList.getOldest());
        
        testList.add(0);
        
        System.out.println(testList.getNewest());
        System.out.println(testList.getOldest());
    }
}
