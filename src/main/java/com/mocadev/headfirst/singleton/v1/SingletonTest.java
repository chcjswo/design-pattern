package com.mocadev.headfirst.singleton.v1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-11
 **/
public class SingletonTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			final SingletonThread thread = new SingletonThread();
			thread.run();
		}
	}

}
