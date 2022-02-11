package com.mocadev.headfirst.singleton.v1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-11
 **/
public class SingletonThread implements Runnable {

	@Override
	public void run() {
		final ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		System.out.println("chocolateBoiler = " + chocolateBoiler);
	}

}
