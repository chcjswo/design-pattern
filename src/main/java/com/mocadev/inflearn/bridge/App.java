package com.mocadev.inflearn.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-18
 **/
public class App {

	public static void main(String[] args) {
		Champion champ = new KdaAri();
		champ.skillQ();

		Champion champion1 = new Ari(new KDA());
		champion1.move();
		champion1.skillE();

		Champion champion2 = new Ari(new PoolParty());
		champion2.move();
		champion2.skillR();
	}

}
