package com.mocadev.fastcampus.factorymethod;

import java.util.HashMap;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-13
 **/
public class HyundaiCarFactory extends CarFactory {

	HashMap<String, Car> carMap = new HashMap<>();

	@Override
	public Car createCar(String name) {
		Car car = null;

		if (name.equals("sonata")) {
			car = new Sonata();
		} else if (name.equals("santafe")) {
			car = new Santafe();
		}
		return car;
	}

	public Car returnCar(String name) {
		Car car = carMap.get(name);
		if (car == null) {
			car = new Sonata();
			carMap.put(name, car);
		}
		return car;
	}

}
