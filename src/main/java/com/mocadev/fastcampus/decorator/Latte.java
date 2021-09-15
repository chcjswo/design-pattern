package com.mocadev.fastcampus.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}

}
