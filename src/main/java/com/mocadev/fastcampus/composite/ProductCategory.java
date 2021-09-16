package com.mocadev.fastcampus.composite;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-17
 **/
public abstract class ProductCategory {

	int id;
	String name;
	int price;

	public ProductCategory(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public abstract void addProductCategory(ProductCategory productCategory);
	public abstract void removeProductCategory(ProductCategory productCategory);
	public abstract int getCount();
	public abstract int getPrice();
	public abstract String getName();
	public abstract int getId();

}
