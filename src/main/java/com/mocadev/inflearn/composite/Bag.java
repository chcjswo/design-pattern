package com.mocadev.inflearn.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-19
 **/
public class Bag implements Component {

	private List<Component> components = new ArrayList<>();

	public void add(Component components) {
		this.components.add(components);
	}

	@Override
	public int getPrice() {
		return components.stream().mapToInt(Component::getPrice).sum();
	}

}
