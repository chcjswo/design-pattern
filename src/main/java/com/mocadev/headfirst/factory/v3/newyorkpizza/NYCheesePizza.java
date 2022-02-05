package com.mocadev.headfirst.factory.v3.newyorkpizza;

import com.mocadev.headfirst.factory.v3.pizza.Pizza;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/
public class NYCheesePizza extends Pizza {

	public NYCheesePizza() {
		name = "뉴욕 치즈 피자";
		dough = "크러스트";
		sauce = "허니머스타드";
		toppings.add("좋은 치즈");
	}

}
