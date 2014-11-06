package edu.lmu.cmsi.gabriel.customcollection;

import java.util.Iterator;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.CCAbstract;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.ccarray.CCArray;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclinked.CCLinked;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclist.CCList;

public class App 
{
	private static CCLinked<Integer> testLinked = new CCLinked<Integer>(15);
    private static CCArray<Integer> testArray = new CCArray<Integer>(15);
    private static CCList<Integer> testList = new CCList<Integer>(15);
    
   public static void main( String[] args )
    {
	    fillCollections();
        forEachTest();
        iteratorTest();
    }
   
    private static void fillCollections(){
    	for(int i = 0; i < 15; i++){ //again, magic numbers, but let's not linger on that
	    	testLinked.add(i);
	    	testArray.add(i);
	    	testList.add(i);
	    }
    }
    
    private static void iteratorTest() {
		
		
	}

	private static void forEachTest(){
    	System.out.println("cclinked elements:");
        for(Integer integer : testLinked){
        	System.out.println(integer.toString());
        }
        
        System.out.println("\nccarray elements:");
        for(Integer integer : testArray){
        	System.out.println(integer.toString());
        }
        
        System.out.println("\ncclist elements:");
        for(Integer integer : testList){
        	System.out.println(integer.toString());
        }
    	
    }
}
