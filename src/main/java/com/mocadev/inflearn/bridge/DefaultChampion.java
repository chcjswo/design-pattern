package com.mocadev.inflearn.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-18
 **/
public class DefaultChampion implements Champion {

	private Skin skin;
	private String name;

	public DefaultChampion(Skin skin, String name) {
		this.skin = skin;
		this.name = name;
	}

	@Override
	public void move() {
		System.out.printf("%s %s move\n", skin.getName(), this.name);
	}

	@Override
	public void skillQ() {
		System.out.printf("%s %s skillQ\n", skin.getName(), this.name);
	}

	@Override
	public void skillW() {
		System.out.printf("%s %s skillW\n", skin.getName(), this.name);
	}

	@Override
	public void skillE() {
		System.out.printf("%s %s skillE\n", skin.getName(), this.name);
	}

	@Override
	public void skillR() {
		System.out.printf("%s %s skillR\n", skin.getName(), this.name);
	}
}
