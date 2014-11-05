package edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclist;

import java.util.LinkedList;
import java.util.ListIterator;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.CCAbstract;

public class CCList<E> extends CCAbstract<E>{
	public LinkedList<E> localList;
	
	public CCList(int maxLength) {
		super(maxLength); 
		localList = new LinkedList<E>();
	}

	@Override
	public E getOldest() {
		return localList.get(0);
	}

	@Override
	public E getNewest() {
		return localList.get(localList.size()-1);
	}
	
	@Override
	public int getSize(){
		return localList.size();
	}

	@Override
	public void add(E type) {
		if(type == null){
			throw new IllegalArgumentException("null value");
		}
		
		if(localList.size() < this.maxLength){
			localList.add(type);
		} else {
			localList.remove(0);
			localList.add(type);
		}
	}

	@Override
	public void reset() {
		localList.removeAll(localList);
	}
	
	public ListIterator<E> iterator() {
		return localList.listIterator(0);
	}
	
}
