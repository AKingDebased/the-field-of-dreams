package edu.lmu.cmsi.gabriel.recursionandstacks;

import edu.lmu.cmsi.gabriel.recursionandstacks.symbolbalancer.SymbolBalancer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SymbolBalancerTest {
	
	public void correctBalancing(){
		assertEquals("expected true", true, SymbolBalancer.isBalanced("()"));
	}
}
