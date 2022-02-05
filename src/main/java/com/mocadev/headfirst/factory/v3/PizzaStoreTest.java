package com.mocadev.headfirst.factory.v3;

import com.mocadev.headfirst.factory.v3.pizza.Pizza;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/
public class PizzaStoreTest {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		final Pizza ny = nyPizzaStore.orderPizza("cheese");
		System.out.println("피자 끝 = " + ny.getName() + "\n");
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		final Pizza chicago = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("피자 끝 = " + chicago.getName() + "\n");
	}

}
