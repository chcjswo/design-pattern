package com.mocadev.inflearn.strategy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-04
 **/
public enum Hand {

	Rock(0), Paper(1), Scissors(2);

	private final int index;

	Hand(int index) {
		this.index = index;
	}

	public static Hand getHand(int value) {
		return values()[value];
	}

	public Result fight(Hand other) {
		if (this == other) {
			return Result.DRAW;
		} else if (this.index - other.index == 1 || this.index == 0 && other.index == 2) {
			return Result.WIN;
		}
		return Result.LOSE;
	}

}
