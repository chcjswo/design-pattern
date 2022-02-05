package com.mocadev.headfirst.factory.pizza;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-05
 **/

public class Pizza {

	public void prepare() {
		System.out.println("피자 준비");
	}

	public void bake() {
		System.out.println("피자 굽기");
	}

	public void cut() {
		System.out.println("피자 자르기");
	}

	public void box() {
		System.out.println("피자 담기");
	}

}
