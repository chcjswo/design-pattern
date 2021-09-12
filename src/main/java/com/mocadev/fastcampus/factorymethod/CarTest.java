package com.mocadev.fastcampus.factorymethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-13
 **/
public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = new HyundaiCarFactory();
		Car car = factory.createCar("sonata");
		System.out.println("car = " + car);

		Car returnCar = factory.returnCar("test");
		System.out.println("returnCar = " + returnCar);
	}

}
