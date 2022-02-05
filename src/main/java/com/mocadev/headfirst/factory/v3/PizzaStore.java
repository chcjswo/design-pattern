package com.mocadev.headfirst.factory.v3;

import com.mocadev.headfirst.factory.v3.pizza.Pizza;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/
public abstract class PizzaStore {

	// type은 type-safety를 위해 enum을 사용하는게 좋다.
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
