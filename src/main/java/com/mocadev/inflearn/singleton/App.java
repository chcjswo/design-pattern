package com.mocadev.inflearn.singleton;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-03
 **/
public class App {

	public static void main(String[] args) {
		Settings settings = Settings.getInstance();
		System.out.println(settings == Settings.getInstance());
	}

}
