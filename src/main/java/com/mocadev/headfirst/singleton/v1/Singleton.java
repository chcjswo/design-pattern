package com.mocadev.headfirst.singleton.v1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-11
 **/
public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// 메소드 동기화는 100배 정도의 성능 저하 발생
//	public static synchronized Singleton getInstance(){
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}

}
