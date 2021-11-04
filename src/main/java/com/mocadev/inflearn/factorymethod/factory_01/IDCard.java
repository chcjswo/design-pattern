package com.mocadev.inflearn.factorymethod.factory_01;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-03
 **/
public class IDCard implements Product {

	private String owner;

	public IDCard(String owner) {
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "님의 카드를 사용합니다.");
	}

}
