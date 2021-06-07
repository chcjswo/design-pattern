package com.mocadev.inflearn.observer;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class DigitObserver implements Observer {

	@Override
	public void update(int number) {
		System.out.println("number = " + number);
	}

}
