package com.mocadev.inflearn.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-06
 **/
public abstract class Widget {

	public abstract int getColumns();
	public abstract int getRows();
	public abstract String getRowText(int row);

	public void show() {
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}

}
