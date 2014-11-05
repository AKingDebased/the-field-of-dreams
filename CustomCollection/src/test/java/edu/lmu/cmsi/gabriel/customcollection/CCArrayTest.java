package edu.lmu.cmsi.gabriel.customcollection;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.ccarray.CCArray;

public class CCArrayTest {
	
	 @Test(expected = IllegalArgumentException.class)
	 public void testNull() {
		 CCArray<Integer> testCCArray = new CCArray<Integer>(4);
		 testCCArray.add(null);
	 }
	 
	 @Test
	 public void lessThanNGetOldest(){
		 CCArray<Integer> testCCArray = new CCArray<Integer>(4);
		 
		 fillCCArray(testCCArray, false);
		 
		 assertEquals("failed - expected 0", new Integer(0),testCCArray.getOldest());
	 }
	 
	 @Test
	 public void greaterThanNGetOldest(){
		 CCArray<Integer> testCCArray = new CCArray<Integer>(4);
		 
		 fillCCArray(testCCArray, true);
		 
		 assertEquals("failed - expected 1", new Integer(1),testCCArray.getOldest());
	 }
	 
	 @Test
	 public void lessThanNGetNewest(){
		 CCArray<Integer> testCCArray = new CCArray<Integer>(4);
		 
		 fillCCArray(testCCArray, false);
		 
		 assertEquals("failed - expected 2", new Integer(2),testCCArray.getNewest());
	 }
	 
	 @Test
	 public void greaterThanNGetNewest(){
		 CCArray<Integer> testCCArray = new CCArray<Integer>(4);
		 
		 fillCCArray(testCCArray, true);
		 
		 assertEquals("failed - expected 4", new Integer(4),testCCArray.getNewest());
	 }
	 
	 @Test
	 public void sizeTest(){
		 CCArray<Integer> testCCArray = new CCArray<Integer>(4);
		 
		 testCCArray.add(1);
		 assertEquals("failed - expected 1", 1, testCCArray.getSize());
		 
		 testCCArray.add(2);
		 testCCArray.add(3);
		 assertEquals ("failed - expected 3", 3, testCCArray.getSize());
		 
		 testCCArray.add(4);
		 assertEquals("failed - expected 4", 4, testCCArray.getSize());
		 
		 testCCArray.add(5); //exceeding defined CCArray size
		 assertEquals("failed - expected 4", 4, testCCArray.getSize());
	}
	
	@Test
	public void sizeAndResetTest(){
		CCArray<Integer> testCCArray = new CCArray<Integer>(4);
		
		fillCCArray(testCCArray, false);
		testCCArray.reset();
		 
		assertEquals("failed - expected 0", 0, testCCArray.getSize());
	}
	
	/*@Test
	public void iterationOrderTest(){
		CCArray<Integer> testCCArray = new CCArray<Integer>(15);
		
		for(int i = 0; i < 15; i++){
			testCCArray.add(i);
		}
	}*/
	
	 private void fillCCArray(CCArray<Integer> CCArray, boolean moreOrLess){
		 if(moreOrLess == false) { //false for < N
			 for (int i = 0; i < 3; i++){
				 CCArray.add(i);
			 }
		 } else {
			 for (int i = 0; i < 5; i++){ //true for > N
				 CCArray.add(i);
			 }
		 }
	 }
}
