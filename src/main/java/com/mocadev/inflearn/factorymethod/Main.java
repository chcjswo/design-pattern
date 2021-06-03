package com.mocadev.inflearn.factorymethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-03
 **/
public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.createProduct("test1");
		Product card2 = factory.createProduct("test2");
		Product card3 = factory.createProduct("test3");

		card1.use();
		card2.use();
		card3.use();
	}

}
