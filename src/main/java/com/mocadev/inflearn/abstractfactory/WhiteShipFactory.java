package com.mocadev.inflearn.abstractfactory;

import com.mocadev.inflearn.factorymethod.factory_02.Ship;
import com.mocadev.inflearn.factorymethod.factory_02.WhiteShip;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class WhiteShipFactory {

	private final ShipPartsFactory shipPartsFactory;

	public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
		this.shipPartsFactory = shipPartsFactory;
	}

	public Ship createShip() {
		Ship ship = new WhiteShip();
		ship.setAnchor(shipPartsFactory.createAnchor());
		ship.setWheel(shipPartsFactory.createWheel());
		return ship;
	}

}
