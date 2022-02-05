package com.mocadev.headfirst.factory.v3.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/

public abstract class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<>();

	public void prepare() {
		System.out.println("피자 준비 = " + name);
		System.out.println("도우 던지기...");
		System.out.println("소스 추가...");
		System.out.println("토핑 추가...");
		for (String topping : toppings) {
			System.out.println("topping = " + topping);
		}
	}

	public void bake() {
		System.out.println("피자 굽기");
	}

	public void cut() {
		System.out.println("피자 자르기");
	}

	public void box() {
		System.out.println("피자 포장");
	}

	public String getName() {
		return name;
	}

}
