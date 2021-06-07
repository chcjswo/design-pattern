package com.mocadev.inflearn.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public abstract class Monster implements Character {

	private char prefix;
	private int hp;

	public Monster(char prefix) {
		this.prefix = prefix;
		hp = 50;
	}

	public char getPrefix() {
		return prefix;
	}

	public int getHp() {
		return hp;
	}

	@Override
	public String getName() {
		return "몬스터 " + getPrefix();
	}

}
