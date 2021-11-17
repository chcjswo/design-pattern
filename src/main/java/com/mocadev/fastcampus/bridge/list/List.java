package com.mocadev.fastcampus.bridge.list;

import com.mocadev.fastcampus.bridge.impl.AbstractList;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public abstract class List<T> {

	AbstractList<T> impl;

	public List(AbstractList<T> impl) {
		this.impl = impl;
	}

	public void add(T obj) {
		impl.addElement(obj);
	}

	public T remove(int i) {
		return impl.deleteElement(i);
	}

	public T get(int i) {
		return impl.getElement(i);
	}

	public int getSize() {
		return impl.getElementSize();
	}

}
