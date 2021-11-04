package com.mocadev.inflearn.factorymethod.factory_02;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public interface ShipFactory {

	default Ship orderShip(String name, String email) {
		validate(name, email);
		prepareFor(name);
		Ship ship = createShip();
		sendEmailTo(email, ship);
		return ship;
	}

	private void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 다 만들었습니다.");
	}

	Ship createShip();

	private void validate(String name, String email) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("배 이름을 지어주세요");
		}
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("연락처를 남겨주세요.");
		}
	}

	private void prepareFor(String name) {
		System.out.println(name + " 만들 준비 중");
	}

}
