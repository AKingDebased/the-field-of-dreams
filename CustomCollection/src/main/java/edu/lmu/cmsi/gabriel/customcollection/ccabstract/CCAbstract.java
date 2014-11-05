package edu.lmu.cmsi.gabriel.customcollection.ccabstract;

public abstract class CCAbstract<E> {
	protected int maxLength;
	
	public CCAbstract(int maxLength){
		this.maxLength = maxLength;
	}
	
	public abstract E getOldest();
	
	public abstract E getNewest();
	
	public abstract void add(E e);
	
	public abstract void reset();
	
	public abstract int getSize();
}
