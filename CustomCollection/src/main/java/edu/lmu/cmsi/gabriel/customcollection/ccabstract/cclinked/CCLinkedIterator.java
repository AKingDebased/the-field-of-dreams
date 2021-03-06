package edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclinked;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CCLinkedIterator<E> implements Iterator<E>{
	private Node<E> currentNode;
	
	public CCLinkedIterator(Node<E> node){
		currentNode = node;
	}
	
	public boolean hasNext() {
		return currentNode.getNext() != null;
	}

	public E next() {
		if(!hasNext()){
			throw new NoSuchElementException("no further elements");
		} else {
			this.currentNode = this.currentNode.getNext();
			return this.currentNode.getData();
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException("remove operation not supported");
	}

}
