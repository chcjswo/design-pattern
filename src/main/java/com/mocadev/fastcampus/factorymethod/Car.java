package com.mocadev.fastcampus.factorymethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-13
 **/
public abstract class Car {

	String carType;

	@Override
	public String toString() {
		return "Car{" +
			"carType='" + carType + '\'' +
			'}';
	}

}
