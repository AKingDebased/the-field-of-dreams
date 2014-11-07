package edu.lmu.cmsi.gabriel.recursionandstacks.symbolbalancer;

import java.util.ArrayDeque;
import java.util.Deque;

public final class SymbolBalancer {
	
	public static boolean isBalanced(String string){
		Deque<Character> symbolStack = new ArrayDeque<Character>();
		char[] stringChars = string.toCharArray();
		
		for(char ch : stringChars){
			switch(ch){
				case '(':
					symbolStack.push(ch);
					break;
				case '[':
					symbolStack.push(ch);
					break;
				case ')':
					if(symbolStack.removeFirstOccurrence('(')){
						break;
					} else {
						return false;
					}
				case ']':
					if(symbolStack.removeFirstOccurrence('[')){
						break;
					} else {
						return false;
					}
			}
		}
		return symbolStack.isEmpty();
	}
}
