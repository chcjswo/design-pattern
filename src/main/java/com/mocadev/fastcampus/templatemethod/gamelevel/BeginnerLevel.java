package com.mocadev.fastcampus.templatemethod.gamelevel;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-12
 **/
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump를 못합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn을 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("** 초보자 레벨입니다. **");
	}

}
