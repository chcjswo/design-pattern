package com.mocadev.headfirst.factory.v2;

import com.mocadev.headfirst.factory.v2.chicagopizza.ChicagoCheesePizza;
import com.mocadev.headfirst.factory.v2.chicagopizza.ChicagoGreekPizza;
import com.mocadev.headfirst.factory.v2.pizza.Pizza;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/
public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
			case "cheese":
				return new ChicagoCheesePizza();
			case "greek":
				return new ChicagoGreekPizza();
			default:
				return null;
		}
	}

}
