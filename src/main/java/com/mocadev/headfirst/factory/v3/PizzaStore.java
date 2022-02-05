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

	// 해당 메소드는 추상 클래스에 정의
	// 이 메소드는 실제로 어떤 서브 클래스에서 코드를 실행 하는지 알 수가 없다
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
