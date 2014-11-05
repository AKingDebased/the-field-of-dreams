package edu.lmu.cmsi.gabriel.customcollection;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CCListTest {
	
	 @Test(expected = IllegalArgumentException.class)
	 public void testNullAddition() {
	 Array<String> testArray = new Array<String>(5);
	 testArray.add(null);
	 }

}
