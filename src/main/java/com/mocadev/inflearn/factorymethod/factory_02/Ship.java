package com.mocadev.inflearn.factorymethod.factory_02;

import com.mocadev.inflearn.abstractfactory.Anchor;
import com.mocadev.inflearn.abstractfactory.Wheel;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-05
 **/
public class Ship {

	private String name;
	private String color;
	private String logo;
	private Anchor anchor;
	private Wheel wheel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setAnchor(Anchor anchor) {
		this.anchor = anchor;
	}

	public Anchor getAnchor() {
		return anchor;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	@Override
	public String toString() {
		return "Ship{" +
			"name='" + name + '\'' +
			", color='" + color + '\'' +
			", logo='" + logo + '\'' +
			", anchor=" + anchor +
			", wheel=" + wheel +
			'}';
	}
}
