package edu.lmu.cmsi.gabriel.customcollection.ccabstract.ccarray;

import java.util.Iterator;                  
import java.util.NoSuchElementException;

public class CCArrayIterator<E> implements Iterator<E>{
	private int position;
	private Object[] array;
	
	public CCArrayIterator(Object[] array){
		this.position = -1;
		this.array = array;
	}
	
	public boolean hasNext() {
		if(position + 1 < array.length){
			return array[position + 1] != null;
		} else {
			return false;
		}
	}

	public E next() {
		if(!hasNext()){
			throw new NoSuchElementException("no further elements");
		} else {
			position++;
			return (E) array[position];
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException("remove operation not supported .");
	}
}
