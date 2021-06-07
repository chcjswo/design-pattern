package com.mocadev.inflearn.observer;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class GraphicObserver implements Observer {

	@Override
	public void update(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
