package edu.lmu.cmsi.gabriel.customcollection;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclinked.CCLinked;

public class CCLinkedTest {
	
	 @Test(expected = IllegalArgumentException.class)
	 public void testNull() {
		 CCLinked<Integer> testCCLinked = new CCLinked<Integer>(4);
		 testCCLinked.add(null);
	 }
	 
	 @Test
	 public void lessThanNGetOldest(){
		 CCLinked<Integer> testCCLinked = new CCLinked<Integer>(4);
		 
		 fillCCLinked(testCCLinked, false);
		 
		 assertEquals("failed - expected 0", new Integer(0),testCCLinked.getOldest());
	 }
	 
	 @Test
	 public void greaterThanNGetOldest(){
		 CCLinked<Integer> testCCLinked = new CCLinked<Integer>(4);
		 
		 fillCCLinked(testCCLinked, true);
		 
		 assertEquals("failed - expected 1", new Integer(1),testCCLinked.getOldest());
	 }
	 
	 @Test
	 public void lessThanNGetNewest(){
		 CCLinked<Integer> testCCLinked = new CCLinked<Integer>(4);
		 
		 fillCCLinked(testCCLinked, false);
		 
		 assertEquals("failed - expected 2", new Integer(2),testCCLinked.getNewest());
	 }
	 
	 @Test
	 public void greaterThanNGetNewest(){
		 CCLinked<Integer> testCCLinked = new CCLinked<Integer>(4);
		 
		 fillCCLinked(testCCLinked, true);
		 
		 assertEquals("failed - expected 4", new Integer(4),testCCLinked.getNewest());
	 }
	 
	 @Test
	 public void sizeTest(){
		 CCLinked<Integer> testCCLinked = new CCLinked<Integer>(4);
		 
		 testCCLinked.add(1);
		 assertEquals("failed - expected 1", 1, testCCLinked.getSize());
		 
		 testCCLinked.add(2);
		 testCCLinked.add(3);
		 assertEquals ("failed - expected 3", 3, testCCLinked.getSize());
		 
		 testCCLinked.add(4);
		 assertEquals("failed - expected 4", 4, testCCLinked.getSize());
		 
		 testCCLinked.add(5); //exceeding defined CCLinked size
		 assertEquals("failed - expected 4", 4, testCCLinked.getSize());
	}
	
	@Test
	public void sizeAndResetTest(){
		CCLinked<Integer> testCCLinked = new CCLinked<Integer>(4);
		
		fillCCLinked(testCCLinked, false);
		testCCLinked.reset();
		 
		assertEquals("failed - expected 0", 0, testCCLinked.getSize());
	}
	
	/*@Test
	public void iterationOrderTest(){
		CCArray<Integer> testCCArray = new CCArray<Integer>(15);
		
		for(int i = 0; i < 15; i++){
			testCCArray.add(i);
		}
	}*/
	
	 private void fillCCLinked(CCLinked<Integer> CCLinked, boolean moreOrLess){
		 if(moreOrLess == false) { //false for < N
			 for (int i = 0; i < 3; i++){
				 CCLinked.add(i);
			 }
		 } else {
			 for (int i = 0; i < 5; i++){ //true for > N
				 CCLinked.add(i);
			 }
		 }
	 }
}
