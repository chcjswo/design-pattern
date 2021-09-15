package com.mocadev.fastcampus.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public class MochaCoffee extends Decorator {

	public MochaCoffee(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.print("Adding Mocha Syrup ");
	}

}
