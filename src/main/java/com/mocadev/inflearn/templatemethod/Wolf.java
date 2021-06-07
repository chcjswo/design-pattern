package com.mocadev.inflearn.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class Wolf extends Monster {

	public Wolf(char prefix) {
		super(prefix);
	}

	@Override
	public void attack(Character character) {
		System.out.println(getName() + "가 " + character.getName() + "을 공격했다.");
	}

	@Override
	public String getName() {
		return "늑대 " + getPrefix();
	}

}
