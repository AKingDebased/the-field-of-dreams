package edu.lmu.cmsi.gabriel.customcollection.ccabstract.ccarray;

import java.util.Iterator;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.CCAbstract;

public class CCArray<E> extends CCAbstract<E> implements Iterable<E> {
	private int arrayElements = 0;
	public Object[] localArray; 
			
	public CCArray(int maxLength) {
		super(maxLength);
		localArray = new Object[maxLength];
	}
	
	public E getOldest(){
		return (E) this.localArray[0];
	}
	
	public E getNewest(){
		return (E) this.localArray[this.arrayElements - 1];
	}
	
	public int getSize(){
		return this.arrayElements;
	}
	
	public void add(E e){
		if(e == null){
			throw new IllegalArgumentException("null value");
		}
		
		if(arrayElements < this.maxLength){
			this.localArray[this.arrayElements] = e;
			this.arrayElements++;
		} else {
			Object[] tempArray = new Object[this.maxLength];
			
			for(int i = 0; i < this.maxLength - 1; i++){
				tempArray[i] = this.localArray[i+1]; //push all elements down one index
			}									 		   //also automatically overrides the oldest element
		
			this.localArray = tempArray;
			this.localArray[maxLength-1] = e;
		}
		
	}
	
	public void reset(){
		this.localArray = new Object[maxLength];
		this.arrayElements = 0;
	}

	public CCArrayIterator<E> iterator() {
		return new CCArrayIterator<E>(this.localArray);
	}

}
