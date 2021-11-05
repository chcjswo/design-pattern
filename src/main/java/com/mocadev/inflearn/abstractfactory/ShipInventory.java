package com.mocadev.inflearn.abstractfactory;


import com.mocadev.inflearn.factorymethod.factory_02.Ship;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class ShipInventory {

	public static void main(String[] args) {
		final WhiteShipFactory whiteShipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
		final Ship ship = whiteShipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
	}

}
