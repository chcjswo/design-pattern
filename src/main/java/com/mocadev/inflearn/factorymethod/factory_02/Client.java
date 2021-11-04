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
		Client client = new Client();
		client.print(new WhiteShipFactory(), "whiteShip", "whiteShip@test.com");
		client.print(new WhiteShipFactory(), "blackShip", "blackShip@test.com");
	}

	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}

}
