package com.mocadev.fastcampus.state;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-16
 **/
public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 Jump를 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 Turn을 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("** 중급자 레벨입니다. **");
	}

}
