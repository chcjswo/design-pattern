package com.mocadev.fastcampus.abstractfactory.product;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public class Product {

	private String productId;
	private String productName;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Product(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

}
