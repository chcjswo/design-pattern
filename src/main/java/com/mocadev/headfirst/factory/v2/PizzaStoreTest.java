package com.mocadev.headfirst.factory.v2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/
public class PizzaStoreTest {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("cheese");
		// 슈퍼 클래스에 있는 orderPiazza 메소드에서는 어떤 피자가 만들어지는지 전혀 알 수가 없다. 단지 피자
	}

}
