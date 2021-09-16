package com.mocadev.fastcampus.composite;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-17
 **/
public class Product extends ProductCategory {

	public Product(int id, String name, int price) {
		super(id, name, price);
	}

	@Override
	public void addProductCategory(ProductCategory productCategory) {

	}

	@Override
	public void removeProductCategory(ProductCategory productCategory) {

	}

	@Override
	public int getCount() {
		return 1;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getId() {
		return id;
	}

}
