package com.mocadev.inflearn.strategy;

import java.util.Random;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-04
 **/
public class RandomStrategy implements Strategy {

	@Override
	public Hand nextHand() {
		return Hand.getHand(new Random().nextInt(3));
	}

}
