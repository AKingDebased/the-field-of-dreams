package edu.lmu.cmsi.gabriel.customcollection;

import java.util.Iterator;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.CCAbstract;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.ccarray.CCArray;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclinked.CCLinked;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclist.CCList;

public class App 
{
    public static void main( String[] args )
    {
        forEachTest();
        iteratorTest();
    }
    
    private static void iteratorTest() {
		
		
	}

	private static void forEachTest(){
    	CCLinked<Integer> testLinked = new CCLinked<Integer>(15);
        CCArray<Integer> testArray = new CCArray<Integer>(15);
        CCList<Integer> testList = new CCList<Integer>(15);
        
        for(int i = 0; i < 15; i++){ //again, magic numbers, but let's not linger on that
        	testLinked.add(i);
        	testArray.add(i);
        	testList.add(i);
        }
        
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
