package com.mocadev.headfirst.singleton.v2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-11
 **/
public class Singleton {

	// JVM 로딩시 유일한 instance 생성
	// JVM에서 static instance 생성하기 전에는 어떤 쓰레드에서도 접근 불가
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

}
