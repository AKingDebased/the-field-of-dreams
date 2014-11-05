package edu.lmu.cmsi.gabriel.customcollection.ccabstract;

public abstract class CCAbstract<E> {
	private int size;
	
	public CCAbstract(int size){
		this.size = size;
	}
	
	public abstract E getOldest();
	
	public abstract E getNewest();
	
	public abstract void add(E e);
	
	public abstract void reset();
	
	public int getSize(){
		return size;
	}
	

}
