package edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclinked;

import java.util.Iterator;

public class CCLinkedIterator<E> implements Iterator<E>{
	
	public CCLinkedIterator(Node<E> node){
		
	}
	
	public boolean hasNext() {
		
		return false;
	}

	public E next() {
		
		return null;
	}
	
	public void remove(){
		throw new UnsupportedOperationException("remove operation not supported");
	}

}
