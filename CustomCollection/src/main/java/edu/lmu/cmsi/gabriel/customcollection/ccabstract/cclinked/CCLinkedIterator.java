package edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclinked;

import java.util.Iterator;

public class CCLinkedIterator<E> implements Iterator<E>{
	private Node<E> currentNode;
	
	public CCLinkedIterator(Node<E> node){
		currentNode = node;
	}
	
	public boolean hasNext() {
		return currentNode.getNext() != null;
	}

	public E next() {
		return (E) currentNode.getNext();
	}
	
	public void remove(){
		throw new UnsupportedOperationException("remove operation not supported");
	}

}
