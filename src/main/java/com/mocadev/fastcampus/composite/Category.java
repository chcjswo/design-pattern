package com.mocadev.fastcampus.composite;

import java.util.ArrayList;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-17
 **/
public class Category extends ProductCategory {

	ArrayList<ProductCategory> productCategories;

	public Category(int id, String name, int price) {
		super(id, name, price);
		this.productCategories = new ArrayList<>();
	}

	@Override
	public void addProductCategory(ProductCategory productCategory) {
		productCategories.add(productCategory);
	}

	@Override
	public void removeProductCategory(ProductCategory productCategory) {
		for (ProductCategory category : productCategories) {
			if (category.getId() == productCategory.getId()) {
				productCategories.remove(category);
				return;
			}
		}
		System.out.println("상품이 없습니다.");
	}

	@Override
	public int getCount() {
		int count = 0;
		for (ProductCategory category : productCategories) {
			count += category.getCount();
		}
		return count;
	}

	@Override
	public int getPrice() {
		int price = 0;
		for (ProductCategory category : productCategories) {
			price += category.getPrice();
		}
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
