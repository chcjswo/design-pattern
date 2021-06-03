package com.mocadev.inflearn.strategy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-04
 **/
public class Player {

	private final Strategy strategy;
	private String name;
	private int life = 3;

	public Player(Strategy strategy, String name) {
		this.strategy = strategy;
		this.name = name;
	}

	public Hand nextHand() {
		return strategy.nextHand();
	}

}
