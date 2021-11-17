package com.mocadev.fastcampus.bridge.impl;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public interface AbstractList<T> {

	void addElement(T obj);
	T deleteElement(int i);
	int insertElement(T obj, int i);
	T getElement(int i);
	int getElementSize();

}
