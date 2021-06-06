package com.mocadev.inflearn.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-06
 **/
public class Main {

	public static void main(String[] args) {
		new App(new SideBorder(new FullBorder(new SideBorder(new TextWidget("hello world")))));
	}

}
