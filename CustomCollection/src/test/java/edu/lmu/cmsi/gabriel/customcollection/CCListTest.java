package edu.lmu.cmsi.gabriel.customcollection;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclist.CCList;

public class CCListTest {
	
	 @Test(expected = IllegalArgumentException.class)
	 public void testNull() {
		 CCList<Integer> testCCList = new CCList<Integer>(4);
		 testCCList.add(null);
	 }
	 
	 @Test
	 public void lessThanNGetOldest(){
		 CCList<Integer> testCCList = new CCList<Integer>(4);
		 
		 fillCCList(testCCList, false);
		 
		 assertEquals("failed - expected 0", new Integer(0),testCCList.getOldest());
	 }
	 
	 @Test
	 public void greaterThanNGetOldest(){
		 CCList<Integer> testCCList = new CCList<Integer>(4);
		 
		 fillCCList(testCCList, true);
		 
		 assertEquals("failed - expected 1", new Integer(1),testCCList.getOldest());
	 }
	 
	 @Test
	 public void lessThanNGetNewest(){
		 CCList<Integer> testCCList = new CCList<Integer>(4);
		 
		 fillCCList(testCCList, false);
		 
		 assertEquals("failed - expected 2", new Integer(2),testCCList.getNewest());
	 }
	 
	 @Test
	 public void greaterThanNGetNewest(){
		 CCList<Integer> testCCList = new CCList<Integer>(4);
		 
		 fillCCList(testCCList, true);
		 
		 assertEquals("failed - expected 4", new Integer(4),testCCList.getNewest());
	 }
	 
	 @Test
	 public void sizeTest(){
		 CCList<Integer> testCCList = new CCList<Integer>(4);
		 
		 testCCList.add(1);
		 assertEquals("failed - expected 1", 1, testCCList.getSize());
		 
		 testCCList.add(2);
		 testCCList.add(3);
		 assertEquals ("failed - expected 3", 3, testCCList.getSize());
		 
		 testCCList.add(4);
		 assertEquals("failed - expected 4", 4, testCCList.getSize());
		 
		 testCCList.add(5); //exceeding defined CCList size
		 assertEquals("failed - expected 4", 4, testCCList.getSize());
	}
	
	@Test
	public void sizeAndResetTest(){
		CCList<Integer> testCCList = new CCList<Integer>(4);
		
		fillCCList(testCCList, false);
		testCCList.reset();
		 
		assertEquals("failed - expected 0", 0, testCCList.getSize());
	}
	
	@Test
	public void iterationOrderTest(){
		CCList<Integer> testCCList = new CCList<Integer>(15);
		
		for(int i = 0; i < 15; i++){
			testCCList.add(i);
		}
		
		
		
	}
	
	 private void fillCCList(CCList<Integer> cclist, boolean moreOrLess){
		 if(moreOrLess == false) { //false for < N
			 for (int i = 0; i < 3; i++){
				 cclist.add(i);
			 }
		 } else {
			 for (int i = 0; i < 5; i++){ //true for > N
				 cclist.add(i);
			 }
		 }
	 }
}
