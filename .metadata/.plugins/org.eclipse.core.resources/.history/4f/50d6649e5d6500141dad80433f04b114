package edu.lmu.cmsi.gabriel.customcollection;

import java.util.Iterator;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.ccarray.CCArray;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclist.CCList;

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
        
        System.out.println("current elements:");
        Iterator<Integer> ccArrayIterator = testList.iterator();
        while(ccArrayIterator.hasNext()){
        	System.out.println(ccArrayIterator.next().toString());
        }
        
        System.out.println("newest: " + testList.getNewest());
        System.out.println("oldest: " + testList.getOldest());
        
        System.out.println("overloading CCList");
        testList.add(0);
        
        System.out.println("current elements:");
        Iterator<Integer> ccArrayIterator2 = testList.iterator();
        while(ccArrayIterator2.hasNext()){
        	System.out.println(ccArrayIterator2.next().toString());
        }
      
        System.out.println("newest: " + testList.getNewest());
        System.out.println("oldest: " + testList.getOldest());
        
    }
}
