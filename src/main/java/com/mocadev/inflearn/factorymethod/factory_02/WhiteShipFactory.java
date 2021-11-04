package com.mocadev.inflearn.factorymethod.factory_02;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class WhiteShipFactory implements ShipFactory {

	@Override
	public Ship createShip() {
		return new WhiteShip();
	}

}
