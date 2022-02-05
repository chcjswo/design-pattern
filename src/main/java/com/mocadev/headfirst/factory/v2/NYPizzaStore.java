package com.mocadev.headfirst.factory.v2;

import com.mocadev.headfirst.factory.v2.newyorkpizza.NYCheesePizza;
import com.mocadev.headfirst.factory.v2.newyorkpizza.NYGreekPizza;
import com.mocadev.headfirst.factory.v2.pizza.Pizza;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/
public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
			case "cheese":
				return new NYCheesePizza();
			case "greek":
				return new NYGreekPizza();
			default:
				return null;
		}
	}

}
