package com.mocadev.fastcampus.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-16
 **/
public class CoffeeTest {

	public static void main(String[] args) {
		Coffee kenyaCoffee = new KenyaCoffee();
		kenyaCoffee.brewing();

		System.out.println();
		Coffee kenyaLatte = new Latte(kenyaCoffee);
		kenyaLatte.brewing();

		System.out.println();
		Coffee kenyaMocha = new MochaCoffee(new Latte(new KenyaCoffee()));
		kenyaMocha.brewing();
	}

}
