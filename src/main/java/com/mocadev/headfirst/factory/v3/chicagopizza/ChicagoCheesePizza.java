package com.mocadev.headfirst.factory.v3.chicagopizza;

import com.mocadev.headfirst.factory.v3.pizza.Pizza;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/
public class ChicagoCheesePizza extends Pizza {

	public ChicagoCheesePizza() {
		name = "시카고 치즈 피자";
		dough = "크러스트";
		sauce = "허니머스타드";
		toppings.add("좋은 시카고 치즈");
	}

	@Override
	public void cut() {
		System.out.println("시카고 피자는 이렇게 자름");
	}
}
