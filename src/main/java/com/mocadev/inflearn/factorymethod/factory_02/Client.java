package com.mocadev.inflearn.factorymethod.factory_02;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class Client {

	public static void main(String[] args) {
		final Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "whiteShip@test.com");
		System.out.println("whiteShip = " + whiteShip);

		final Ship blackShip = new BlackShipFactory().orderShip("blackShip", "blackShip@test.com");
		System.out.println("blackShip = " + blackShip);
	}

}
