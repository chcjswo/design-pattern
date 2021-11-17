package com.mocadev.fastcampus.bridge.list;

import com.mocadev.fastcampus.bridge.impl.AbstractList;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public class Stack<T> extends List<T> {

	public Stack(AbstractList<T> impl) {
		super(impl);
	}

	public void push(T obj) {
		impl.insertElement(obj, 0);
	}

	public T pop() {
		return impl.deleteElement(0);
	}

}
