package com.mocadev.fastcampus.templatemethod.gamelevel;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-12
 **/
public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();

	public void fly() {}

	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
		fly();
	}

}
