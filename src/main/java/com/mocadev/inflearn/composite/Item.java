package com.mocadev.inflearn.composite;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-19
 **/
public class Item implements Component {

	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

}
