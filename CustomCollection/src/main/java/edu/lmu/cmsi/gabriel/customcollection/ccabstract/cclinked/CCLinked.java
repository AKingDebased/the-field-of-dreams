package edu.lmu.cmsi.gabriel.customcollection.ccabstract.cclinked;

import edu.lmu.cmsi.gabriel.customcollection.ccabstract.CCAbstract;

public class CCLinked<T> extends CCAbstract<T> {

	public CCLinked(int size) {
		super(size);
	}

	@Override
	public T getOldest() {
		return null;
	}

	@Override
	public T getNewest() {
		return null;
	}

	@Override
	public void add(T type) {
		
		
	}

	@Override
	public void reset() {
		
	}

}
