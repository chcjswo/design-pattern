package com.mocadev.fastcampus.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-15
 **/
public abstract class Decorator extends Coffee {

	Coffee coffee;

	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}

}
