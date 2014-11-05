package edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclist;

import java.util.ArrayList;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.CCAbstract;

public class CCList<E> extends CCAbstract<E>{
	ArrayList<E> localList;
	
	public CCList(int size) {
		super(size); 
		localList = new ArrayList<E>(size);
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
	public void add(E type) {
		localList.add(type);
	}

	@Override
	public void reset() {
		localList.removeAll(localList);
	}
	
	private void replaceOldest(){
		
	}

}
