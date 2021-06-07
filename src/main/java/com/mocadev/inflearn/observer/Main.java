package com.mocadev.inflearn.observer;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-08
 **/
public class Main {

	public static void main(String[] args) {
		RandomGenerator randomGenerator = new RandomGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphicObserver();
		Observer observer3 = number -> {
			for (int i = 0; i < number; i++) {
				System.out.print("=");
			}
			System.out.println();
		};

		randomGenerator.addObservers(observer1);
		randomGenerator.addObservers(observer2);
		randomGenerator.addObservers(observer3);

		randomGenerator.execute();
		randomGenerator.execute();
		randomGenerator.execute();
	}

}
