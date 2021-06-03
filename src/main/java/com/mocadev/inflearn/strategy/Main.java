package com.mocadev.inflearn.strategy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-04
 **/
public class Main {

	public static void main(String[] args) {
		Player p1 = new Player(new RandomStrategy(), "p1");
		Player p2 = new Player(new PaperStrategy(), "p2");
		Player p3 = new Player(new RandomStrategy(), "p3");

		for (int i = 0; i < 10; i++) {
			System.out.println(p1.nextHand().fight(p3.nextHand()));
		}

	}

}
