package edu.lmu.cmsi.gabriel.recursionandstacks.symbolbalancer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public final class SymbolBalancer {
	
	public static boolean isBalanced(String string){
		Deque<Character> symbolStack = new ArrayDeque<Character>();
		char[] stringChars = string.toCharArray();
		
		try{
			for(char ch : stringChars){
				switch(ch){
					case '(':
						symbolStack.push(ch);
						break;
					case '[':
						symbolStack.push(ch);
						break;
					case ')':
						if(symbolStack.pop() == '('){
							break;
						} else {
							return false;
						}
					case ']':
						if(symbolStack.pop() == '['){
							break;
						} else {
							return false;
						}
				}
			}
		} catch (NoSuchElementException e){ //catches case of closing symbol with empty stack
			return false;
		}
		return symbolStack.isEmpty();
	}
}
