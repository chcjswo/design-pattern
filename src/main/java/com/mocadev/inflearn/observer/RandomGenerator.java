package com.mocadev.inflearn.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class RandomGenerator {

	private List<Observer> observers = new ArrayList<>();

	public void addObservers(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void execute() {
		int num = new Random().nextInt(50);
		observers.forEach(o -> o.update(num));
	}

}
