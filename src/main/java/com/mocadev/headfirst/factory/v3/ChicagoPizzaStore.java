package com.mocadev.headfirst.factory.v3;

import com.mocadev.headfirst.factory.v3.chicagopizza.ChicagoCheesePizza;
import com.mocadev.headfirst.factory.v3.chicagopizza.ChicagoGarlicPizza;
import com.mocadev.headfirst.factory.v3.pizza.Pizza;

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
				return new ChicagoGarlicPizza();
			default:
				return null;
		}
	}

}
