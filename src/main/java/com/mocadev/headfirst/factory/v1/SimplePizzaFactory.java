package com.mocadev.headfirst.factory.v1;

import com.mocadev.headfirst.factory.v1.pizza.CheesePizza;
import com.mocadev.headfirst.factory.v1.pizza.ClamPizza;
import com.mocadev.headfirst.factory.v1.pizza.GreekPizza;
import com.mocadev.headfirst.factory.v1.pizza.PepperoniPizza;
import com.mocadev.headfirst.factory.v1.pizza.Pizza;
import com.mocadev.headfirst.factory.v1.pizza.VeggiePizza;

/**
 * The type Simple pizza factory.
 *
 * @author chcjswo
 * @version 1.0.0
 * @blog https ://mocadev.tistory.com
 * @github https ://github.com/chcjswo
 * @since 2022 -02-05
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		switch (type) {
			case "cheese":
				return new CheesePizza();
			case "greek":
				return new GreekPizza();
			case "pepperoni":
				return new PepperoniPizza();
			case "clam":
				return new ClamPizza();
			case "veggie":
				return new VeggiePizza();
			default:
				return null;
		}
	}

}
