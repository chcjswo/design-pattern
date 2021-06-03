package com.mocadev.inflearn.factorymethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-03
 **/
public class IDCardFactory implements Factory {

	@Override
	public Product createProduct(String name) {
		return new IDCard(name);
	}

}
