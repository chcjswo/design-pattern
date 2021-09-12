package com.mocadev.fastcampus.factorymethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-13
 **/
public abstract class CarFactory {

	public abstract Car createCar(String name);
	public abstract Car returnCar(String name);

	public void numbering() {
		System.out.println("numbering");
	}

	public void washCar() {
		System.out.println("washCar");
	}

	final public void sellCar(String carName) {
		numbering();
		createCar(carName);
		washCar();
	}

}
