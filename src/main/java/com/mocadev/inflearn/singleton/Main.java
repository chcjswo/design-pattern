package com.mocadev.inflearn.singleton;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-04
 **/
public class Main {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		if (singleton1 == singleton2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
