package edu.lmu.cmsi.gabriel.recursionandstacks;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.recursionandstacks.symbolbalancer.SymbolBalancer;

public class SymbolBalancerTest {
	
	@Test
	public void validBalanceTrue(){
		assertEquals("expected true", true, SymbolBalancer.isBalanced("()"));
		assertEquals("expected true", true, SymbolBalancer.isBalanced("[]"));
		assertEquals("expected true", true, SymbolBalancer.isBalanced("()[]"));
		assertEquals("expected true", true, SymbolBalancer.isBalanced("[]()"));
		assertEquals("expected true", true, SymbolBalancer.isBalanced("[()]"));
		assertEquals("expected true", true, SymbolBalancer.isBalanced("([])"));
	}
	
	@Test 
	public void validBalanceFalse(){
		assertEquals("expected false", false, SymbolBalancer.isBalanced("[(])"));
		assertEquals("expected false", false, SymbolBalancer.isBalanced(")("));
		assertEquals("expected false", false, SymbolBalancer.isBalanced("]["));
		assertEquals("expected false", false, SymbolBalancer.isBalanced("())"));
		assertEquals("expected false", false, SymbolBalancer.isBalanced("[]]"));
		assertEquals("expected false", false, SymbolBalancer.isBalanced("[(])]("));
	}
}
