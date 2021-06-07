package com.mocadev.inflearn.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class Wizard extends Hero {

	private int mp = 50;

	public Wizard(String name) {
		super(name);
	}

	@Override
	public void attack(Character character) {
		mp -= 5;
	}

}
