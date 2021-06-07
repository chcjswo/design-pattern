package com.mocadev.inflearn.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class SuperHero extends Hero {

	private boolean isFly = false;

	public SuperHero(String name) {
		super(name);
	}

	public boolean isFly() {
		return isFly;
	}

	public void setFly(boolean fly) {
		isFly = fly;
	}

	@Override
	public void attack(Character character) {
		System.out.println(getName() + "는 " + character.getName() + "를 공격했다");
	}

}
