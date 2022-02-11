package com.mocadev.headfirst.singleton.v3;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-11
 **/
public class Singleton {

	// DCL(Double-Checking Lcking)
	// instance가 생성되어 있는지 확인 후 생성이 안된 경우만 동기화 사용
	private volatile static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
