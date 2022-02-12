package com.mocadev.headfirst.singleton.classloader.v2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-02-13
 **/
public class Main {

	// Test 1. 인스턴스 생성
	public static void main(String[] args) {
		// 생성자로 클래스의 인스턴스 생성
		new Single();
	}

}

class Single {

	// 1. 생성자
	public Single() {
	}

	// 2. 정적 변수 - final X
	public static int a;

	// 3. 정적 변수 - final O
	public static final int b = 0;

	// 4. 정적 메서드
	public static void getInstance() {
	}

	// 5. 정적 내부 클래스
	public static class Holder {

		public static Single INSTANCE;
	}
}
